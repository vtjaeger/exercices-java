package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int valorAnterior = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            char caracterAtual = s.charAt(i);
            int valorAtual = map.get(caracterAtual);

            System.out.println("caracter atual: " + caracterAtual);
            System.out.println("valor atual: " + valorAtual);
            System.out.println("valor anterior: " + valorAnterior);

            if(valorAtual < valorAnterior) {
                result -= valorAtual;
                System.out.println("valor atual menor que valor anterior, subtracao");
            } else {
                result += valorAtual;
                System.out.println("valor atual maior que valor anterior, adicao");
            }
            System.out.println("valor atual " + valorAtual);
            valorAnterior = valorAtual;
        }
        return result;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        romanToInteger.romanToInt(number);
    }
}
