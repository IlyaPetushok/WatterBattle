package com.company.Matrix;

public class Cheake {
    private int row, column;
    private int quality=0;

    public Cheake() {
    }

    public int Cheake(int row, int column, int arr[][]) {
        boolean flag_1 = false, flag_2 = false, flag_3 = false, flag_4 = false;
        if (arr[row][column] != 1) {

            if (row > 0 && column > 0 && row < 9 && column < 9) {
                flag_1 = true;
                flag_2 = true;
                flag_3 = true;
                flag_4 = true;
            }
            if (row > 0 && row < 9 && column == 0) {
                flag_1 = true;
                flag_2 = true;
            }
            if (row == 0 && column > 0 && column < 9) {
                flag_1 = true;
                flag_3 = true;
            }
            if (row == 9 && column > 0 && column < 9) {
                flag_2 = true;
                flag_4 = true;
            }
            if (row > 0 && row < 9 && column == 9) {
                flag_3 = true;
                flag_4 = true;
            }
            if (row == 0 && column == 0 || flag_1 == true) {
                if (arr[row + 1][column + 1] != 1 && arr[row + 1][column] != 1 && arr[row][column + 1] != 1) {
                    flag_1 = false;
                }
            }
            if (row == 9 && column == 0 || flag_2 == true) {
                if (arr[row - 1][column] != 1 && arr[row - 1][column + 1] != 1 && arr[row][column + 1] != 1) {
                    flag_2 = false;
                }
            }
            if (row == 0 && column == 9 || flag_3 == true) {
                if (arr[row][column - 1] != 1 && arr[row + 1][column - 1] != 1 && arr[row + 1][column] != 1) {
                    flag_3 = false;
                }
            }
            if (row == 9 && column == 9 || flag_4 == true) {
                if (arr[row - 1][column - 1] != 1 && arr[row - 1][column] != 1 && arr[row][column - 1] != 1) {
                    flag_4 = false;
                }
            }
        }
        if (flag_1 == false && flag_2 == false && flag_3 == false && flag_4 == false && arr[row][column] != 1) {
            return 1;
        } else {
            return 0;
        }
    }



    public int Quality(int arr[][]) {
        for(int i=0;i<=9;i++){
            for(int j=0;j<=9;j++)
            {
                if(arr[i][j]==1){
                    quality++;
                }
            }
        }
        return quality;
    }
}
