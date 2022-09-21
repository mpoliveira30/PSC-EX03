import javax.swing.JOptionPane;

public class ex03g {
    
    public static void main(String [] args){

        int num;
        long fatorial = 1;

        num = Integer.parseInt
            (JOptionPane.showInputDialog(null, "Digite o número a ser calculado o Fatorial"));

        for(int i = 1; i <= num; i++){
            fatorial = fatorial * i;
        }
        
        JOptionPane.showMessageDialog(null, "O Fatorial do número " +num +" é " +fatorial);

    }
}
