
package combustivel;

import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Scanner tc = new Scanner (System.in);
    
   Double precoGasolina, precoEtanol, calculo = 0.70;
    
    System.out.println("Verificação do custo beneficio da gasolina.");
    System.out.println("Qual o preço da gasolina ?   ");
     precoGasolina = tc.nextDouble();
    System.out.println("Qual o preço do etanol ?   ");
     precoEtanol = tc.nextDouble();

    calculo = (precoGasolina * calculo);
     
    System.out.println("Valor do custo beneficio gasolina: "+calculo);
     
     if (calculo >= precoEtanol){
         System.out.println(" E melhor abastecer o veiculo com Etanol.");
         
     }else {
        System.out.print("E melhor abastecer o veiculo com gasolina.");
     }
          tc.close();
   }

   
    }
    
    
    

