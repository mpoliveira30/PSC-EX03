
package lista_de_exercicios3;

import javax.swing.JOptionPane;

public class Exercício24 {

    public static void main(String[] args) {
        
        int pessoaA, pessoaB, fortunaA, fortunaB, contador;
        
        pessoaA = 10000;
        fortunaA = 100;
        pessoaB = 5000;
        fortunaB = 300;
        contador = 0;
        
        while(pessoaA >= pessoaB){
            if(pessoaA >= pessoaB){
                int diferença;
                diferença = pessoaA - pessoaB;
                System.out.println("A diferença entre as fortunas é: R$" + diferença + " no mês "+ contador);
                pessoaA = pessoaA + fortunaA;
                pessoaB = pessoaB + fortunaB;
            }
            contador++;
        }
        JOptionPane.showMessageDialog(null,"O tempo demorado para a Pessoa B ter mais dinheiro que a Pessoa A foi de: \n"+ contador +" meses.");
    }
}
