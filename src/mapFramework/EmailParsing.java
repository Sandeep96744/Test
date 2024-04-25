package mapFramework;

import java.util.*;

public class EmailParsing {
    public static void main(String[] args) {
        String str = "harsh@yahoo.com, karan@gmail.com, ram@yahoo.com, viswa@tech.in, viswa@tech.in, deepak@outlook.com, dpak@outlook.com, k@outlook.com, vk@tech.in, hk@gmail.com";


        String[] emails = str.split(",");
        Map<String, Set<String>> map = new HashMap<>();

        for(String email: emails) {
            email = email.trim();
            String domain = email.substring(email.indexOf('@') + 1);
            Set<String> set = map.getOrDefault(domain, new HashSet<>());
            set.add(email);
            map.put(domain, set);
        }


        for(String domain: map.keySet()) {
            System.out.printf("%-30s", domain);
        }
        System.out.println();
        System.out.println("-".repeat(110));

        int i = 0;
        int max = 1;
        while(i < max) {
            for (String domain : map.keySet()) {
                List<String> list = new ArrayList<>(map.get(domain));
                max = Math.max(list.size(), max);
                if(i < list.size())
                    System.out.printf("%-30s", list.get(i));
                else
                    System.out.printf("%-30s", " ");
            }
            System.out.println();
            i++;
        }
        System.out.println("-".repeat(110));
    }
}
