import javax.swing.JOptionPane;

public class SentenciaSwitch {
    public static void main(String[] args) {
        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 1-5: "));

        switch (dato){
            case 1: JOptionPane.showMessageDialog(null, "Es el número 1");
                break;
            case 2: JOptionPane.showMessageDialog(null, "Es el número 2");
                break;
            case 3: JOptionPane.showMessageDialog(null, "Es el número 3");
                break;
            case 4: JOptionPane.showMessageDialog(null, "Es el número 4");
                break;
            case 5: JOptionPane.showMessageDialog(null, "Es el número 5");
                break;
            default: JOptionPane.showMessageDialog(null, "El número no está en el rango de 1-5");
        }
    }    
}