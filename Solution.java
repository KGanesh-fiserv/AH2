import java.util.Scanner;
import java.lang.Math;
public class Solution {
    public static void main( String [] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();

    if (IsPrime(num)){
        System.out.println("The entered number is prime");
    }
    else{
        System.out.println("Not a prime. Sorry.");
    }
    }

    private static boolean IsPrime(int num) {
        if (num <= 1){
            return false;
        }
        boolean temp = true;
        for(int i = 2; i <= Math.sqrt(num); i++){

            if (num % i == 0){
                temp = false;
                break;
            }
        } 
        return temp;
    }
}
