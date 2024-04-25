package mapFramework;

import java.util.*;

public class EmailParsing {
    public static void main(String[] args) {
        String str = "harsh@yahoo.com, karan@gmail.com, ram@yahoo.com, viswa@tech.in, viswa@tech.in, deepak@outlook.com";


        String[] emails = str.split(",");
        Map<String, Set<String>> map = new HashMap<>();

        for(String email: emails) {
            email = email.trim();
            String domain = email.substring(email.indexOf('@'));
            Set<String> set = map.getOrDefault(domain, new HashSet<>());
            set.add(email);
            map.put(domain, set);
        }

        for(String domain: map.keySet()) {
            System.out.println(domain);
            for(String email: map.get(domain)) {
                System.out.println(email);
            }
            System.out.println();
        }

    }
}
