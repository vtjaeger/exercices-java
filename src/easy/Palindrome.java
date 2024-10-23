package easy;

import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(int x){
        int original = x;
        int reverso = 0;
        while (x > 0){
            int digito = x % 10;
            reverso = reverso * 10 + digito;
            x /= 10;
        }
        if(original == reverso)
            System.out.println("true");
        else
            System.out.println("false");

        return original == reverso;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        Scanner scanner = new Scanner(System.in);
        palindrome.isPalindrome(scanner.nextInt());
    }
}
