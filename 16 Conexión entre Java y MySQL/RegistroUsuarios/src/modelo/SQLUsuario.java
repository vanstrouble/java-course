package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SQLUsuario {

    public Boolean registrar(Usuario usuario) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;

        try {
            Connection conexion = con.getConnection();

            ps = conexion.prepareStatement("insert into usuario (nombreUsuario,contraseña,nombre,correo,idTipo_usuario) values (?,?,?,?,?)");
            ps.setString(1, usuario.getNombreUsuario());
            ps.setString(2, usuario.getContraseña());
            ps.setString(3, usuario.getNombre());
            ps.setString(4, usuario.getCorreo());
            ps.setInt(5, usuario.getIdTipo_usuario());
            ps.executeUpdate();
            return true;

        } catch (Exception ex) {
            return false;
        }
    }

    public Integer verificarUsuario(String usuario) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Connection conexion = con.getConnection();

            ps = conexion.prepareStatement("select count(id) from usuario where nombreUsuario=?");
            ps.setString(1, usuario);

            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (Exception ex) {
            return 1;
        }
    }

    public Boolean comprobarEmail(String correo) {
        //Patrón para validar el correo
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher matcher = patron.matcher(correo);

        return matcher.find();
    }
    
    public Boolean iniciarSesion(Usuario usuario) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Connection conexion = con.getConnection();

            ps = conexion.prepareStatement("select u.id, u.nombreUsuario, u.contraseña, u.nombre, u.idTipo_usuario, t.nombre from usuario as u inner join tipo_usuario as t on u.idTipo_usuario = t.id where nombreUsuario = ?");
            ps.setString(1, usuario.getNombreUsuario());

            rs = ps.executeQuery();

            if (rs.next()) {
                if (usuario.getContraseña().equals(rs.getString("contraseña"))) {
                    ps = conexion.prepareStatement("update usuario set ultima_sesion = ? where id = ?");
                    ps.setString(1, usuario.getUltima_sesion());
                    ps.setInt(2, rs.getInt("id"));
                    ps.executeUpdate();
                    
                    usuario.setId(rs.getInt("u.id"));
                    usuario.setNombreUsuario(rs.getString("nombre"));
                    usuario.setIdTipo_usuario(rs.getInt("u.idTipo_usuario"));
                    usuario.setNombreRol(rs.getString("t.nombre"));
                    
                    return true;
                } else {
                    return false;
                }
            }

            return false;

        } catch (Exception ex) {
            return false;
        }
    }
}
