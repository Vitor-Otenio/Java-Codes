/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Faça um programa que verifique a validade de uma senha fornecida pelo usuário. A senha é
4531. O programa deve mostrar uma mensagem de permissão de acesso ou não. 
*/

package source_package;
    import java.util.Scanner;
/**
 *
 * @author vitoro
 */
public class Code_40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int senha;
        
        System.out.print("Digíte a senha: ");
        senha = input.nextInt();
        
        if(senha != 4531){
            System.out.println("\nAcesso negado");
        }
        else{
            System.out.println("\nAcesso permitido");
        }
    }
}
