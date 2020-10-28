package ru.netology.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();
        int count = 0;
        for (int x : intList) {
            if (x > 0)
                if (x % 2 == 0)

                    newList.add(x);

            boolean sort = false;
            int temp;
            while (!sort) {
                sort = true;
                for (int i = 0; i < newList.size() - 1; i++) {
                    if (newList.get(i) > newList.get(i + 1)) {
                        temp = newList.get(i);
                        newList.set(i, newList.get(i + 1));
                        newList.set(i + 1, temp);
                        sort = false;
                    }
                }
            }
        }
        System.out.println(newList);
    }
}

