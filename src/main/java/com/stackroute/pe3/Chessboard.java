package com.stackroute.pe3;

public class Chessboard {

    public static String[][] display(int rows, int cols) {
        {
            String output[][] = new String[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (((i + j) % 2) == 0) {
                        //print ww in even places
                        output[i][j] = "WW";
                       // return output;
                    } else {
                        //print bb in odd places
                        output[i][j] = "BB";
                       // return output;
                    }
                }
            }
            return output;
        }
    }

}
