package lambdaExpression;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> list = List.of("Lokesh Kumar", "Harish Panjiyara", "Mohan Verma", "Vivek Sharma", "Mahindra Singh Dhoni", "Karan Chopra");

        List<String> validNames = getValidName(list);

        List<String> shortNames = getShortNames(validNames);

        String allNames = getAllNames(shortNames);

        System.out.println(allNames);
    }



    static List<String> getValidName(List<String> list) {
        List<String> validName = new ArrayList<>();
        for(String name: list) {
            String[] part = name.split(" ");
            if(part.length > 1)
                validName.add(name.strip());
        }
        return validName;
    }

    static List<String> getShortNames(List<String> list) {
        List<String> shortName = new ArrayList<>();

        for(String name: list) {
            String[] part = name.split(" ");
            StringBuilder sb = new StringBuilder();
            for(String s: part) {
                sb.append(s.charAt(0));
            }
            shortName.add(sb.toString());
        }
        return shortName;
    }

    static String getAllNames(List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(list.getFirst());
        for(int i=1; i<list.size(); i++) {
            sb.append(", ").append(list.get(i));
        }
        return sb.toString();
    }

}

