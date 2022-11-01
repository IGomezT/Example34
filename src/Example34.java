import java.util.Scanner;

public class Example34 {
    public static void main(String[] args) {
        double n;
        double e;
        double denom;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Write a number");
        n = inputValue.nextDouble();
        e = 1;
        denom = 1;
        for (int i = 1; i <= n; i++) {
            denom = denom * i;
            e = e + 1 / denom;
        }

        System.out.println("e = " + e);

    }
}
