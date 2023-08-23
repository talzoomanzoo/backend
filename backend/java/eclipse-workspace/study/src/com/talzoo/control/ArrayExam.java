package com.talzoo.control;

public class ArrayExam {
    public static void main(String[] args) {
        double[][] findAvgInput = { { 5, 4.5, 6.8 }, { 6, 0, 3.4 }, { 7, 8.4, 2.3 } };
        findAverage(findAvgInput);
    }

    public static void findAverage(double[][] array) {
        for(int i = 0; i< array.length; i++) {
            for(int k =0; k <array[i].length; k++) {
                if (array[i][k] == 0) {
                    double sum1 = 0.0;
                    for (int x=0; x < array[i].length; x++){
                        sum1 += array[i][x];
                    }
                    double avg1 = sum1 / array[i].length;
                    double sum2 = 0.0;
                    for (int y=0; y < array.length; y++){
                        sum2 += array[y][i];
                    }
                    double avg2 = sum2 / array.length;
                    if (sum1 > sum2) {
                        array[i][k] = avg1;
                    } else {
                        array[i][k] = avg2;
                    }
                }
                System.out.printf("%2.1f ", array[i][k]);
            }
            System.out.println("");
        }
    }
}