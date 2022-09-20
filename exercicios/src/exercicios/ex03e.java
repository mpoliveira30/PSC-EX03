package exercicios;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ex03e {
    public static void main(String[] args) {
        
        int cont, num, result;
        
        num = Integer.parseInt
            (JOptionPane.showInputDialog("Qual a tabuada?"));
        
        for (cont = 0; cont <=10; cont++){
            result = cont * num;
            System.out.println(num +" x "+ cont +" = "+ result);
            
        }
        
        
        
        
    }
}
