package clientPart;

import chatMessanger.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Registration {


//   static ArrayList<String> name = new ArrayList<>();

    public static void registration(ArrayList<String> users) {
        Scanner sc = new Scanner(System.in);
        User user = new User();

        System.out.print("Введите Ваш ник, которое будет использоваться в чате: ");
        user.setName(sc.nextLine());

        String name = user.getName();

        checkName(users, name);
        }
        public static void checkName(ArrayList<String> name, String n) {

        if (name.contains(n)) {
            System.out.println("Имя пользователя занято");
            registration(name);
        }
        else {
            name.add(n);
            System.out.println("Имя пользователя " + n + " успешно зарегистрировано");
        }
    }


}
