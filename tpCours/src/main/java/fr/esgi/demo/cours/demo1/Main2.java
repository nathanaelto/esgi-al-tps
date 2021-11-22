package fr.esgi.demo.cours.demo1;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {

        Map<UserId, User> map = new HashMap<>();
        final UserId userId1 = UserId.of("1");
        map.put(userId1, new User(userId1, "NAME1"));

        final UserId searchUserId = UserId.of("1");
        final User user = map.get(searchUserId);

        System.out.println("Equals:" + userId1.equals(searchUserId));
        System.out.println("HashCode:" + (userId1.hashCode() == searchUserId.hashCode()));

        System.out.println(user);
    }
}
