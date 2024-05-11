/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprendiendo.narcissisticnumber;

import java.util.Scanner;
/**
 *
 * @author ElVerdaderoFrati
 */
public class NarcissisticNumber {
    
    /*
        A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits, each raised to the power of the number of digits in a given base. In this Kata, we will restrict ourselves to decimal (base 10).

        For example, take 153 (3 digits), which is narcissistic:

        1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
        and 1652 (4 digits), which isn't:

        1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
        The Challenge:

        Your code must return true or false (not 'true' and 'false') depending upon whether the given number is a Narcissistic number in base 10.

        This may be True and False in your language, e.g. PHP.

        Error checking for text strings or other invalid inputs is not required, only valid positive non-zero integers will be passed into the function.
    */

    public static void main(String[] args) {
        int number;        
        int numberLength;
        double[] numberArray;
        double digitsRaisedTotalSum = 0;
        String stringNumber;

        Scanner scan = new Scanner(System.in);
  
        System.out.print("Ingrese un numero entero y le diremos si ese es un numer narcisista: ");
        number = scan.nextInt();
        stringNumber = Integer.toString(number);
        numberLength = stringNumber.length();
        
        numberArray = new double[numberLength];    
        
        for(int i=0; i<numberLength; i++)
        {
            numberArray[i] = Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
        }
        
        for(int i=0;  i<numberLength;  i++)
        {
            double power = numberLength;
            double numberAsDouble = numberArray[i];
            digitsRaisedTotalSum = digitsRaisedTotalSum+Math.pow(numberAsDouble ,power  );
        }
        
        if(digitsRaisedTotalSum == number)
        {
            System.out.println("Number "+number+" is narcissistic");
            return;
        }
            System.out.println("Number "+number+" is not narcissistic, because the sum of it's digits raised to the power of number of digits is: "+ Math.round(digitsRaisedTotalSum)); 
        
        
    }
}
