package exercicios;

import java.util.Scanner;

public class ex03b {
    public static void main(String[] args) {
       
       int num, i, acumula;
       
       i = 0;
       acumula = 0;
       num = 99;
       
       
       Scanner scan = new Scanner(System.in);
       
       
       while (num != 0){
           
       System.out.println("Digite um valor: ");
       num = scan.nextInt();
       
       if (num > 0) {
           acumula += num;
           i++;
       }
       else if (num < 0)
            System.out.println("ERRO. Número Inválido.");
       
       }
       
       System.out.println("Valor acumulado: " +acumula);
       System.out.println("Quantidade de números: " +i);
       System.out.println("Média: " +acumula/i);
       
       
       
    }
    
    
}
