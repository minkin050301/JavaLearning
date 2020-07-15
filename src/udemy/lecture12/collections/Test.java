package udemy.lecture12.collections;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        String str1 = "aaabbcccdaa";
//        String str2 = " ";
//
//        for (int i = 0; i < str1.length(); i++) {
//            char ch = str1.charAt(i);
//            if (ch != str2.charAt(str2.length() - 1)) {
//                str2 += ch;
//            }
//        }
//
//        System.out.println(str2);
//        ArrayList<Integer> x = new ArrayList<>();
//        x.add(1);
//        ArrayList<Integer> y = x;
//        x.add(228);
//        System.out.println(y);

//        ArrayDeque<Integer> queue = new ArrayDeque<>();
//        queue.push(7);
//        queue.push(1);
//        queue.push(0);
//        queue.push(2);
//        System.out.println(queue);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i < 3) {
                continue;
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.println(j);
                }
            }
        }
    }

    public static void sortInDescendingOrder(List<Integer> sequence) {
        sequence.sort((o1, o2) -> o2 - o1);
    }
}
