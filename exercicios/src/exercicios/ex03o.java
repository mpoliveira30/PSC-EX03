import java.util.Scanner;

public class ex03o{

    public static void main(String[] args){
        float maior, num;
        int count=2;

        Scanner scan = new Scanner(System.in);
 
        System.out.print("Numero 1 [0 para finalizar]:  ");
        num = scan.nextFloat();
     
        maior = num;

        while(num != 0){
            System.out.print("Numero " + count + " : ");
            num = scan.nextFloat();
 
            if(num > maior){
               maior = num;
            } 
            count++;
        } 
        System.out.println("O maior numero digitado é: "+maior);
    }
}