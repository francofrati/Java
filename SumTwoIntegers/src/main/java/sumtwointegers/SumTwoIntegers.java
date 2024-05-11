/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumtwointegers;

import java.util.Scanner;
/**
 *
 * @author ElVerdaderoFrati
 */
public class SumTwoIntegers {
     public static void main(String[] args) {
         int num1;
         int num2;
         int sum;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Ingrese el primer numero: ");
         num1 = sc.nextInt();
         System.out.print("Ingrese el segundo numero: ");
         num2 = sc.nextInt();
         
         sum = num1 + num2;                 
         
         System.out.println("Resultado: "+num1+"+"+ num2+" = "+sum  );
                 
    }
}
