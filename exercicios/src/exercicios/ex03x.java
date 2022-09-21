package exercicios;

import javax.swing.JOptionPane;

public class ex03x {

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
                System.out.println("A diferenca entre as fortunas e: R$" + diferença + " no mes "+ contador);
                pessoaA = pessoaA + fortunaA;
                pessoaB = pessoaB + fortunaB;
            }
            contador++;
        }
        JOptionPane.showMessageDialog(null,"Se a pessoa A tem R$10.000 e tem sua fortuna crescendo em R$100 por mês\ne a pessoa B tem uma fortuna de R$5.000 e tem sua fortuna crescendo R$300 por mês\n \nEntão o tempo demorado para a Pessoa B ter mais dinheiro que a Pessoa A foi de: \n"+ contador +" meses.\n \nApós 26 meses a pessoa A ficou estará com uma fortuna de: R$" +pessoaA+ "\nApós 26 meses a pessoa B ficou estará com uma fortuna de: R$" +pessoaB);
    }
}
