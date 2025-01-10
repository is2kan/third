import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18 && age < 65) {
            System.out.println("Ты в самом соку");
        }

    }
}