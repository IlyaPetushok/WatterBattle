package com.company.Shape;

import com.company.Matrix.Cheake;

import java.util.ArrayList;
import java.util.Random;

public class Onepalub {

    private int row, column;
    private boolean flag = true;
    ArrayList<Integer> cordin1palub=new ArrayList<Integer>();

    Random rand=new Random();

    public Onepalub(int arr[][]) {
        Cheake cheake =new Cheake();
        while (flag) {

            row = rand.nextInt(10);
            column = rand.nextInt(10);
            arr[row][column] = cheake.Cheake(row, column, arr);
            if (arr[row][column] == 1) {
                Arrays(row,column);
                flag = false;
            } else {
                flag = true;
            }
        }
    }
    private void Arrays(int row,int column){
        cordin1palub.add(row);
        cordin1palub.add(column);
    }

    public ArrayList<Integer> Return_Array(){
        return cordin1palub;
    }
}
