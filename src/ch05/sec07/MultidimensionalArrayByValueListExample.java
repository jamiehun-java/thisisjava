package ch05.sec07;

import java.sql.SQLOutput;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        // 2차원 배열 생성
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        // 배열의 길이
        System.out.println(scores.length);
        System.out.println("scores[0].length = " + scores[0].length);
        System.out.println("scores[1].length = " + scores[1].length);

        // 점수 읽기
        System.out.println("scores[0][2] = " + scores[0][2]);
        System.out.println("scores[1][2] = " + scores[1][1]);

        // 첫번째 반
        int class1Sum = 0;
        for(int i = 0; i < scores[0].length; i++){
            class1Sum += scores[0][i];
        }
        double class1Avg = (double) class1Sum / scores[0].length;
        System.out.println(class1Avg);

        // 두번째 반
        int class2Sum = 0;
        for(int i = 0; i < scores[1].length; i++){
            class2Sum += scores[1][i];
        }
        double class2Avg = (double) class2Sum / scores[1].length;
        System.out.println(class2Avg);

        // 전체
        int totalSum = class1Sum + class2Sum;
        int totalStudent = scores[0].length + scores[1].length;
        double totalAvg = (double) totalSum / totalStudent;

        System.out.println("totalAvg = " + totalAvg);

    }
}
