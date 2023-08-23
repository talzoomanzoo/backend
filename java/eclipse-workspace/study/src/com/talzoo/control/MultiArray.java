package com.talzoo.control;

public class MultiArray {
    public static void main(String[] args) {
        int[][] scores = {{90, 85},
                          {85, 80},
                          {77,100}
                        };
        //nested for loop
        for(int i = 0; i < scores.length; i++) { //outer for loop
            for(int k = 0; k < scores[i].length; k++) { //inner for loop
                // System.out.print("scores[" + i + "][" + k + "] = " + scores[i][k] + " ");
                System.out.print(scores[i][k] + " ");
            }
            System.out.println("");
        }

        int[][] mathScores = new int[3][];
        int[] row01 = {90, 85};
        int[] row02 = {85, 80};
        int[] row03 = {77, 100};
        
        mathScores[0] = row01;
        mathScores[1] = row02;
        mathScores[2] = row03;

        for(int i = 0; i < mathScores.length; i++) { 
            for(int k = 0; k < mathScores[i].length; k++) {
                System.out.print("mathScores[" + i + "][" + k + "] = " + mathScores[i][k] + " ");
            }
            System.out.println("");
        }

        for (int[] row: mathScores) {
            for (int score : row) {
                System.out.print(score + " ");
            }
            System.out.println("");
        }

        for (int[] row: scores) {
            for (int score: row) {
                System.out.print(score + " ");
            }

            System.out.println("");
        }
    }
}
