/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Faça um programa que receba a idade de uma pessoa e mostre a mensagem de maioridade
ou não.
*/

package source_package;
    import java.util.Scanner;
/**
 *
 * @author vitoro
 */
public class Code_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int idade;
        
        System.out.print("Digíte a sua idade: ");
        idade = input.nextInt();
        
        if(idade >= 18){
            System.out.println("\nVocê é maior de idade");
        }
        else{
            System.out.println("\nVocê é menor de idade");
        }
    }
}
