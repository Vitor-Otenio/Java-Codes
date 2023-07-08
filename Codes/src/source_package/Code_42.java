/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu peso
ideal, utilizando as seguintes fórmulas (onde h é a altura):

a) para homens: (72.7 * h) – 58.
b) para mulheres: (62.1 * h) – 44.7.
*/

package source_package;
    import java.util.Scanner;
/**
 *
 * @author vitoro
 */
public class Code_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float altura; char sexo;
        
        System.out.print("Digíte sua altura: ");
        altura = input.nextFloat();
        System.out.print("Digíte seu sexo: ");
        sexo = input.next().charAt(0);
        
        if(sexo == 'f'){
            //Calculando o peso ideal feminino
            double calc_f = (62.1 * altura) - 44.7;
            System.out.printf("\nO seu peso ideal é: %.2f kg%n",  calc_f);
        }
        else{
            //Calculando o peso ideal masculino
            double calc_m = (72.7 * altura) - 58;
            System.out.printf("\nO seu peso ideal é: %.2f kg%n",  calc_m);
        }
    }
}
