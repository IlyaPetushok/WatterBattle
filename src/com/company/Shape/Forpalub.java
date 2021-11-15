package com.company.Shape;

import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.Random;

public class Forpalub extends Shape {
    public Forpalub(int Quality,int param2){
        this.Quality=Quality;
        this.param2=param2;
    }
    //    public int row, column;
//    private Random rand = new Random();
//    private int random, param;
//    ArrayList<Integer> cordin4palub = new ArrayList<Integer>();
//
//    public Forpalub(int arr[][]) {
//
//        row = rand.nextInt(10);
//        column = rand.nextInt(10);
//        random = rand.nextInt(4);
//
//        arr[row][column] = 1;
//        Array(row, column );
//
//
//        for (int i = 1; i <= 3; i++) {
//
//            if (random == 0) {
//                if (column - i >= 0) {
//                    arr[row][column - i] = 1;
//                    Array(row, column - i);
//                } else {
//                    param = 4 - i;
//                    arr[row][column + param] = 1;
//                    Array(row, column + param);
//                }
//            }
//
//            if (random == 1) {
//                if (column + i <= 9) {
//                    arr[row][column + i] = 1;
//                    Array(row, column + i);
//                } else {
//                    param = 4 - i;
//                    arr[row][column - param] = 1;
//                    Array(row, column - param);
//                }
//            }
//
//            if (random == 2) {
//                if (row - i >= 0) {
//                    arr[row - i][column] = 1;
//                    Array(row - i, column);
//                } else {
//                    param = 4 - i;
//                    arr[row + param][column] = 1;
//                    Array(row + param, column);
//                }
//            }
//
//            if (random == 3) {
//                if (row + i <= 9) {
//                    arr[row + i][column] = 1;
//                    Array(row + i, column);
//                } else {
//                    param = 4 - i;
//                    arr[row - param][column] = 1;
//                    Array(row - param, column);
//                }
//            }
//
//
//        }
//    }
//
//    private void Array(int row, int column) {
//        cordin4palub.add(row);
//        cordin4palub.add(column);
//    }
//
//    public ArrayList<Integer> Return_Array(){
//        return cordin4palub;
//    }
}
