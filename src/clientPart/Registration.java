package clientPart;

import chatMessanger.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Registration {

    public static void registration() {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.print("Введите Ваш ник, которое будет использоваться в чате: ");
        user.setName(sc.nextLine());
        List<String> name = new ArrayList<>();
        for (String s : name) {
            if (!(name.contains(user.getName()))) {
                name.add(user.getName());
                System.out.println("Пользователь успешно зарегистрован");
            } else {

            }
        }
//        try {
//            List
//            if (map.containsKey(chat.getName())) {
//                throw new Exception();
//            }
//        } catch (Exception e) {
//            System.out.println("Имя пользователя занято");
//        }
    }
}
