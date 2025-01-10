import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 45) {
            System.out.println("Эууу бля чо за соска");
        } else if (age > 45) {
            System.out.println("Не подходи ванющка");
        }

    }
}