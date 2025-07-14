package array;

import java.util.Arrays;

public class Selectionsort {

    static void sort_num(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int minInd = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[minInd] > num[j]) {
                    minInd = j;
                }
            }
            int tem = num[minInd];
            num[minInd] = num[i];
            num[i] = tem;

        }
    }

    public static void main(String[] args) {
        int num[] = { 4, 5, 7, -9, 1 };
        sort_num(num);
        System.out.println("sorted array : " + Arrays.toString(num));
    }
}