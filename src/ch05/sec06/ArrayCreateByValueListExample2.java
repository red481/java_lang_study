package ch05.sec06;

import java.util.Arrays;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[] {83, 90, 87};

        int sum1 = 0;
        sum1 = Arrays.stream(scores).sum();
        System.out.println(sum1);

        printItem( new int[] { 83, 90, 87});
    }

    private static void printItem(int[] scores) {
        for(int i = 0; i < 3; i++){
            System.out.println("score[" + i + "]: " + scores[i]);
        }
    }
}
