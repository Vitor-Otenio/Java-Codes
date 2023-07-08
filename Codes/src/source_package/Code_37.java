/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Fazer um programa que receba o salário de funcionário e, usando os dados a sehuir, 
calcule e mostre o novo Salário.

FAIXA SALARIAL     % DE AUMENTO

Até R$ 300              50%
R$ 300 > R$ 500         40%
R$ 500 > R$ 700         30%
R$ 700 > R$ 800         20%
R$ 800 > R$ 1.000       10%
Acima de R$ 1.000        5%
*/

package source_package;
    import java.util.Scanner;
/**
 *
 * @author Vitor Otenio
 */
public class Code_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double salario;
        
        System.out.print("\nDigíte o salario aqui: ");
        salario = input.nextDouble();
        
        if(salario <= 300.0){
            double porcentagem_50 = 50.0 / 100.0;
            double aumento_50;
            
            aumento_50 = salario + (porcentagem_50 * salario);
            
            System.out.print("\nNovo salario: " + aumento_50);
        }
        
        else if(salario > 300 && salario <= 500){
            double porcentagem_40 = 40.0 / 100.0;
            double aumento_40;
        
            aumento_40 = salario + (porcentagem_40 * salario);
        
            System.out.print("\nNovo salario: " + aumento_40);
        }
        
        else if(salario > 500 && salario <= 700){
            double porcentagem_30 = 30.0 / 100.0;
            double aumento_30;
            
            aumento_30 = salario + (porcentagem_30 * salario);
            
            System.out.print("\nNovo salario: " + aumento_30);
        }
        
        else if(salario > 700 && salario <= 800){
            double porcentagem_20 = 20.0 / 100.0;
            double aumento_20;
            
            aumento_20 = salario + (porcentagem_20 * salario);
            
            System.out.print("\nNovo salario: " + aumento_20);
        }
        
        else if(salario > 800 && salario <= 1000){
            double porcentagem_10 = 10.0 / 100.0;
            double aumento_10;
            
            aumento_10 = salario + (porcentagem_10 * salario);
            
            System.out.print("\nNovo salario: " + aumento_10);
        }
        
        else if(salario > 1000){
            double porcentagem_05 = 5.0 / 100.0;
            double aumento_05;
            
            aumento_05 = salario + (porcentagem_05 * salario);
            
            System.out.print("\nNovo salario: " + aumento_05);
        }
    }
}

