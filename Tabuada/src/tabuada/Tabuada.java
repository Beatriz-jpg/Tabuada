/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada;

import java.util.Scanner;



/**
 *
 * @author beatr
 */
public class Tabuada {


    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);   
       
       // Obter o número da tabuada do usuário
        System.out.print("Digite o numero para ver a tabuada dele (do 6 ao 10): ");
        int num = ler.nextInt();
        
        // Gerar a tabuada
            
        if (num >=6 && num <=10) {
           for (int i=0; i<=10; i++) {
            int resultado = num * i;
            System.out.println(num + "x" + i + "=" + resultado);         
        } // fim do for
                           
    } else { //resposta caso a pessoa digite um número maior que 10
            if (num > 10 || num <6) {
              System.out.println("Tente novamente. Apenas do 6 ao 10.");
                }
        }      
        
    }   //fim main
} //fim classe
