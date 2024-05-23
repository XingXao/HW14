import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        String strNum = String.valueOf(num);
        double dobleNum = 0;

        for (int i = 0; i < strNum.length(); i++) {
            dobleNum = dobleNum + Integer.parseInt(String.valueOf(strNum.charAt(i)));
        }

        return dobleNum / strNum.length();
    }
}
