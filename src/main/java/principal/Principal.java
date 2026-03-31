package principal;

import javax.swing.JOptionPane;
import model.Triangulo;

public class Principal {
    public static void main(String[] args){
        Triangulo trill = new Triangulo();
        
        trill.setBase(Double.parseDouble(JOptionPane.
                showInputDialog("Digite a base do triangulo: ")));
        trill.setAltura(Double.parseDouble(JOptionPane.
                showInputDialog("Digite a altura do triangulo: ")));
        
        JOptionPane.showMessageDialog(null, "A área do triangulo é " + trill.getArea());
    }
}
