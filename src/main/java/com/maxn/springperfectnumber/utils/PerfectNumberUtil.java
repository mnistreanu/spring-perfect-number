package com.maxn.springperfectnumber.utils;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumberUtil {

    public static boolean isPerfect(int number) {

        if (number <= 0) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }


        return number == sum;
    }

    public static List<Integer> getRange(int start, int end) {

        List<Integer> list = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (PerfectNumberUtil.isPerfect(i)) {
                list.add(i);
            }
        }

        return list;
    }

}
