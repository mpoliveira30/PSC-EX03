import java.util.Scanner;

public class ex03j {

    public static void main (String [] args){
        int maior, menor, num;
        int count=2;

        Scanner scan = new Scanner(System.in);
 
        System.out.print("Idade 1:  ");
        num = scan.nextInt();
     
        maior = num;
        menor = num;

        while(count <= 100){
            System.out.print("Idade " + count + " : ");
            num = scan.nextInt();
 
            if(num > maior){
               maior = num;
            } else if (num < menor) {
                menor = num;
            }
            count++;
        } 
        System.out.println("O Paciente com a maior idade é o de " +maior +" e o com a menor idade é o de " +menor);
    }
}
