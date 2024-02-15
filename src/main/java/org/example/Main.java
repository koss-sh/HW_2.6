package org.example;

import java.util.*;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Integer> nums = generate(10);
        List<String> words = new ArrayList<>(List.of("он", "я", "ты", "привет", "привет", "я", "я", "он"));
        System.out.println("Сгенерированные числа:" + nums);
        task1(nums);
        task2(nums);
        task3(words);
        task4(words);
    }

    private static List<Integer> generate(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(RANDOM.nextInt(0, 9));
        }
        return list;
    }

    public static void task1(List<Integer> nums) {
        System.out.println("task1");
        for (Integer e : nums) {
            if (e % 2 != 0) {
                System.out.print(e + " ");
            }
        }
        System.out.println();
    }

    public static void task2(List<Integer> nums) {
        System.out.println("task2");
        Set<Integer> even = new TreeSet<>(nums);
        for (Integer e : even) {
            if (e % 2 == 0) {
                System.out.print(e + " ");
            }
        }
        System.out.println();
    }

    public static void task3(List<String> words) {
        System.out.println("task3");
        Set<String> set = new HashSet<>(words);
        System.out.println(set);
    }

    public static void task4(List<String> words) {
        System.out.println("task4");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.replace(word, map.get(word) + 1);
            }
        }
        int sum = 0;
        for (Integer e : map.values()) {
            if (e > 1) {
                sum += e;
            }
        }
        System.out.println("Количество повторяющихся слов в списке: " + sum);
    }
}



