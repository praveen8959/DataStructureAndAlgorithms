package ds.array;

import java.util.Scanner;

public class FactorialRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = scanner.nextInt();
        int factorial = recursiveFactorial(num);
        System.out.println("Factorial of " + num + " is : " + factorial);
    }

    private static int recursiveFactorial(int num) {
        if(num == 0 ){
            return 1;
        }
        return num * recursiveFactorial(num-1);
    }

    private static int nonRecFactorial(int num) {
        if(num==0){
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
