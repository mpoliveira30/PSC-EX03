
package lista_de_exercicios3;

import javax.swing.JOptionPane;

public class Exercício23 {
    
        public static void main(String[] args) {
            
            int canal, canal4, canal5, canal9, contador;
            
            canal4 = 0;
            canal5 = 0;
            canal9 = 0;
            contador = 1;
            
            canal = Integer.parseInt(JOptionPane.showInputDialog("Em qual canal está assistindo"));
            
            while(canal != 0){
                
                if(canal == 4){
                    
                    canal4 = canal4 + 1;          
                }
                
                else if(canal == 5){
                    
                    canal5 = canal5 + 1;
                    
                }
                
                else if(canal == 9){
                    
                    canal9 = canal9 + 1;
                    
                }
                
                canal = Integer.parseInt(JOptionPane.showInputDialog("Em qual canal está assistindo"));
                
                contador++;
            }
            
            if(canal4 > canal5 && canal4 > canal9 && canal5 > canal9){
    
                JOptionPane.showMessageDialog(null, "Os votos dos canais foram divididos em: \n Primeiro canal 4: " + canal4 + " votos \n Segundo canal 5: " + canal5 + " votos \n Terceiro canal 9: " + canal9 + " votos");
            }
            
            else if(canal4 > canal5 && canal4 > canal9 && canal9 > canal5){
                
                JOptionPane.showMessageDialog(null, "Os votos dos canais foram divididos em: \n Primeiro canal 4: " + canal4 + " votos \n Segundo canal 9: " + canal9 + " votos \n Terceiro canal 5: " + canal5 + " votos");
            }
            
            else if(canal5 > canal4 && canal5 > canal9 && canal4 > canal9){
                
                JOptionPane.showMessageDialog(null, "Os votos dos canais foram divididos em: \n Primeiro canal 5: " + canal5 + " votos \n Segundo canal 4: " + canal4 + " votos \n Terceiro canal 9: " + canal9 + " votos");
            }
            
            else if(canal5 > canal4 && canal5 > canal9 && canal9 > canal4){
                
                JOptionPane.showMessageDialog(null, "Os votos dos canais foram divididos em: \n Primeiro canal 5: " + canal5 + " votos \n Segundo canal 9: " + canal9 + " votos \n Terceiro canal 4: " + canal4 + "votos");
            }
            
            else if(canal9 > canal4 && canal9 > canal5 && canal4 > canal5){
                
                JOptionPane.showMessageDialog(null, "Os votos dos canais foram divididos em: \n Primeiro canal 9: " + canal9 + " votos \n Segundo canal 4: " + canal4 + " votos \n Terceiro canal 5: " + canal5 + " votos");
            }
            
            else if(canal9 > canal4 && canal9 > canal5 && canal5> canal4){
                
                JOptionPane.showMessageDialog(null, "Os votos dos canais foram divididos em: \n Primeiro canal 9: " + canal9 + " votos \n Segundo canal 5: " + canal5 + " votos \n Terceiro canal 4: " + canal4 + " votos");
            }
        }
}
