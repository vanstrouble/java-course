package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class Ventana extends JFrame {
	private DefaultComboBoxModel<Persona> modelo = new DefaultComboBoxModel<Persona>();
	private DefaultTableModel modeloTabla = new DefaultTableModel();

	private JPanel panel;
	private JTable tabla;
	private JTextField textField;
	private JTextField textoApellidos;
	private JTextField textoEmail;
	private JTextField textoCelular;
	private JTextField textoDireccion;
	private JComboBox<Persona> comboPersonas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		llenarModeloComboBox();
		agregarModeloTabla();
		initComponets();
	}

	private void agregarModeloTabla() {
		modeloTabla.addColumn("Nombres");
		modeloTabla.addColumn("Apellidos");
		modeloTabla.addColumn("Email");
		modeloTabla.addColumn("Celular");
		modeloTabla.addColumn("Dirección");
	}

	private void llenarModeloComboBox() {
		modelo.addElement(new Persona("Pedro Antonio", "Vázquez González", "pedrovqz@gmail.com", "123456", "Libertad 30"));
		modelo.addElement(new Persona("Aideé Berenice", "Correa Villegas", "aidee.cov@gmail.com", "234567", "Gatitos 23"));
		modelo.addElement(new Persona("José", "Ventura", "suegrito@gmail.com", "345678", "Gatitos 23"));
		modelo.addElement(new Persona("Francisca", "Yebra", "franciseslamejor@gmail.com", "56789", "Gatitos 30"));
		modelo.addElement(new Persona("Edwin Enrique", "Salazar Vázquez", "edwineslaonda@gmail.com", "09988776", "Colima 86"));
		modelo.addElement(new Persona("Belén", "González Cruz", "belen05@gmail.com", "1828430", "Palma 21"));
	}

	private void initComponets() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 505);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel etiquetaPersona = new JLabel("Persona");
		etiquetaPersona.setFont(new Font("Arial", Font.PLAIN, 20));
		etiquetaPersona.setBounds(6, 6, 85, 16);
		panel.add(etiquetaPersona);
		
		comboPersonas = new JComboBox<Persona>();
		comboPersonas.setBounds(6, 34, 239, 27);
		panel.add(comboPersonas);
		comboPersonas.setModel(modelo);
		
		JButton botonInsertarPersona = new JButton("Insertar Persona");
		botonInsertarPersona.setBounds(275, 33, 158, 29);
		panel.add(botonInsertarPersona);
		
		tabla = new JTable();
		tabla.setBounds(16, 84, 412, 112);
		panel.add(tabla);
		tabla.setModel(modeloTabla);
		
		JLabel etiquetaDatos = new JLabel("Datos de la Persona");
		etiquetaDatos.setFont(new Font("Arial", Font.PLAIN, 15));
		etiquetaDatos.setBounds(26, 210, 146, 27);
		panel.add(etiquetaDatos);
		
		JLabel etiquetaNombre = new JLabel("Nombre");
		etiquetaNombre.setBounds(17, 248, 61, 16);
		panel.add(etiquetaNombre);
		
		JLabel etiquetaApellidos = new JLabel("Apellidos");
		etiquetaApellidos.setBounds(275, 248, 61, 16);
		panel.add(etiquetaApellidos);
		
		JLabel etiquetaEmail = new JLabel("Email");
		etiquetaEmail.setBounds(17, 307, 61, 16);
		panel.add(etiquetaEmail);
		
		JLabel etiquetaCelular = new JLabel("Celular");
		etiquetaCelular.setBounds(275, 307, 61, 16);
		panel.add(etiquetaCelular);
		
		JLabel etiquetaDireccion = new JLabel("Dirección");
		etiquetaDireccion.setBounds(17, 378, 61, 16);
		panel.add(etiquetaDireccion);
		
		textField = new JTextField();
		textField.setBounds(16, 269, 182, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		textoApellidos = new JTextField();
		textoApellidos.setColumns(10);
		textoApellidos.setBounds(221, 269, 204, 26);
		panel.add(textoApellidos);
		
		textoEmail = new JTextField();
		textoEmail.setColumns(10);
		textoEmail.setBounds(16, 326, 182, 26);
		panel.add(textoEmail);
		
		textoCelular = new JTextField();
		textoCelular.setColumns(10);
		textoCelular.setBounds(246, 326, 182, 26);
		panel.add(textoCelular);
		
		textoDireccion = new JTextField();
		textoDireccion.setColumns(10);
		textoDireccion.setBounds(16, 406, 409, 26);
		panel.add(textoDireccion);
	}
	
	
}
