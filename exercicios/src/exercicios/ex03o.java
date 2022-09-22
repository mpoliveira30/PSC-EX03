package exercicios;

import java.util.Scanner;

public class ex03o{

    public static void main(String[] args){
        float maior, num;
        int count=2;

        Scanner scan = new Scanner(System.in);
 
        System.out.print("[Digite 0 para finalizar] \nNúmero 1: ");
        num = scan.nextFloat();
     
        maior = num;

        while(num != 0){
            System.out.print("Número " + count + " : ");
            num = scan.nextFloat();
 
            if(num > maior){
               maior = num;
            } 
            count++;
        } 
        System.out.println("O maior número digitado é: "+maior);
    }
}
