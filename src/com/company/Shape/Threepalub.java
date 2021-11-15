package com.company.Shape;

import com.company.Matrix.Cheake;

import java.util.ArrayList;
import java.util.Random;

public class Threepalub extends Shape {
    public Threepalub(int Quality,int param2){
        this.Quality=Quality;
        this.param2=param2;
    }
}
//    private int row, column;
//    private Random rand = new Random();
//    private int random, param;
//    ArrayList<Integer> cordin3palub=new ArrayList<Integer>();
//
//    public Threepalub(int arr[][]) {
//        row =rand.nextInt(10);
//        column = rand.nextInt(10);
//        random =rand.nextInt(4);
//
//        Cheake cheake = new Cheake();
//        for (int i = 0; i <= 2; i++) {
//            param = 0;
//
//            if (random == 0) {
//                if (column - i >= 0) {
//                    if (cheake.Cheake(row, column - i, arr) == 1) {
//                        arr[row][column - i] = 2;
//                    } else {
//                        for (int q = 0; q < 10; q++) {
//                            for (int j = 0; j < 10; j++) {
//                                if (arr[q][j] == 2) {
//                                    arr[q][j] = 0;
//                                }
//                            }
//                        }
//                        i = -1;
//                        random = rand.nextInt(4);
//                        row = rand.nextInt(10);
//                        column = rand.nextInt(10);
//                    }
//                } else {
//                    param = 3 - i;
//                    if (cheake.Cheake(row, column + param, arr) == 1) {
//                        arr[row][column + param] = 2;
//                    } else {
//                        for (int q = 0; q < 10; q++) {
//                            for (int j = 0; j < 10; j++) {
//                                if (arr[q][j] == 2) {
//                                    arr[q][j] = 0;
//                                }
//                            }
//                        }
//                        i = -1;
//                        random = rand.nextInt(4);
//                        row = rand.nextInt(10);
//                        column = rand.nextInt(10);
//                    }
//                }
//            }
//            if (random == 1) {
//                if (column + i <= 9) {
//                    if (cheake.Cheake(row, column + i, arr) == 1) {
//                        arr[row][column + i] = 2;
//                    } else {
//                        for (int q = 0; q < 10; q++) {
//                            for (int j = 0; j < 10; j++) {
//                                if (arr[q][j] == 2) {
//                                    arr[q][j] = 0;
//                                }
//                            }
//                        }
//                        i = -1;
//                        random = rand.nextInt(4);
//                        row = rand.nextInt(10);
//                        column = rand.nextInt(10);
//                    }
//                } else {
//                    param = 3 - i;
//                    if (cheake.Cheake(row, column - param, arr) == 1) {
//                        arr[row][column - param] = 2;
//                    }
//                    else {
//                        for (int q = 0; q < 10; q++) {
//                            for (int j = 0; j < 10; j++) {
//                                if (arr[q][j] == 2) {
//                                    arr[q][j] = 0;
//                                }
//                            }
//                        }
//                        i = -1;
//                        random = rand.nextInt(4);
//                        row = rand.nextInt(10);
//                        column = rand.nextInt(10);
//                    }
//                }
//            }
//            if (random == 2) {
//                if (row - i >= 0) {
//                    if (cheake.Cheake(row - i, column, arr) == 1) {
//                        arr[row - i][column] = 2;
//                    } else {
//                        for (int q = 0; q < 10; q++) {
//                            for (int j = 0; j < 10; j++) {
//                                if (arr[q][j] == 2) {
//                                    arr[q][j] = 0;
//                                }
//                            }
//                        }
//                        i = -1;
//                        random = rand.nextInt(4);
//                        row = rand.nextInt(10);
//                        column = rand.nextInt(10);
//                    }
//                } else {
//                    param = 3 - i;
//                    if (cheake.Cheake(row + param, column, arr) == 1) {
//                        arr[row + param][column] = 2;
//                    } else {
//                        for (int q = 0; q < 10; q++) {
//                            for (int j = 0; j < 10; j++) {
//                                if (arr[q][j] == 2) {
//                                    arr[q][j] = 0;
//                                }
//                            }
//                        }
//                        i = -1;
//                        random = rand.nextInt(4);
//                        row = rand.nextInt(10);
//                        column = rand.nextInt(10);
//                    }
//                }
//            }
//            if (random == 3) {
//                if (row + i <= 9) {
//                    if (cheake.Cheake(row + i, column, arr) == 1) {
//                        arr[row + i][column] = 2;
//                    } else {
//                        for (int q = 0; q <=9; q++) {
//                            for (int j = 0; j < 10; j++) {
//                                if (arr[q][j] == 2) {
//                                    arr[q][j] = 0;
//                                }
//                            }
//                        }
//                        i = -1;
//                        random = rand.nextInt(4);
//                        row = rand.nextInt(10);
//                        column = rand.nextInt(10);
//                    }
//                } else {
//                    param = 3 - i;
//                    if (cheake.Cheake(row - param, column, arr) == 1) {
//                        arr[row - param][column] = 2;
//                    } else {
//                        for (int q = 0; q < 10; q++) {
//                            for (int j = 0; j < 10; j++) {
//                                if (arr[q][j] == 2) {
//                                    arr[q][j] = 0;
//                                }
//                            }
//                        }
//                        i = -1;
//                        random = rand.nextInt(4);
//                        row = rand.nextInt(10);
//                        column = rand.nextInt(10);
//                    }
//
//                }
//            }
//
//        }
//
//        for(int i=0;i<=9;i++){
//            for(int j=0;j<=9;j++){
//                if(arr[i][j]==2){arr[i][j]=1;Arrays(i,j);}
//            }
//        }
//    }
//    public void Arrays(int row,int column){
//        cordin3palub.add(row);
//        cordin3palub.add(column);
//    }
//
//    public ArrayList<Integer> Return_Array(){
//        return cordin3palub;
//    }
//}
