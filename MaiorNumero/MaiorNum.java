package MaiorNumero;

import java.util.Scanner;

public class MaiorNum {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        int num1 = input.nextInt();

        System.out.println("Digite outro numero: ");
        int num2 = input.nextInt();

        if(num1>num2){
            System.out.println("O numero "+num1+" é maior que "+num2+".");
        }else if(num1<num2){
            System.out.println("O numero "+num2+" é maior que "+num1+".");
        }else{
            System.out.println("Os números são iguais.");
        }
    }
    
}