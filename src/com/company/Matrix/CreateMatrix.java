package com.company.Matrix;

import com.company.Shape.Forpalub;
import com.company.Shape.Onepalub;
import com.company.Shape.Threepalub;
import com.company.Shape.Twopalub;

import java.util.ArrayList;

public class CreateMatrix {
    Cheak_Coord cheake_coord = new Cheak_Coord();
    private int row = 9, column = 9;
    public int arr[][] = new int[10][10];
    private ArrayList<Integer> list = new ArrayList<Integer>();
    private ArrayList<Integer> Catch = new ArrayList<Integer>();


    public CreateMatrix() {
        for (int i = 0; i <= column; i++) {
            for (int j = 0; j <= row; j++) {
                arr[i][j] = 0;
            }
        }
        //проверено
        Forpalub forpalub = new Forpalub(3, 4);
        forpalub.PutShape(arr);
        Catch = forpalub.Return_Array();
        list = Help_Catch(Catch, list);

        Threepalub[] threepalub = new Threepalub[2];
        for (int i = 0; i <= 1; i++) {
            threepalub[i] = new Threepalub(2, 3);
            threepalub[i].PutShape(arr);
            Catch = threepalub[i].Return_Array();
            list = Help_Catch(Catch, list);

        }

        Twopalub[] twopalubs = new Twopalub[3];
        for (int i = 0; i <= 2; i++) {
            twopalubs[i] = new Twopalub(1, 2);
            twopalubs[i].PutShape(arr);
            Catch = twopalubs[i].Return_Array();
            list = Help_Catch(Catch, list);
        }

        Onepalub[] onepalub = new Onepalub[4];
        for (int i = 0; i <= 3; i++) {
            onepalub[i] = new Onepalub(arr);
            Catch = onepalub[i].Return_Array();
            list = Help_Catch(Catch, list);
        }

        cheake_coord.Take_list(list);

        for (int i = 0; i <= column; i++) {
            for (int j = 0; j <= row; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");

        }
        System.out.println();

    }

    public int[][] Clone_Matrix() {
        return arr;
    }

    private ArrayList<Integer> Help_Catch(ArrayList<Integer> Catch, ArrayList<Integer> list) {
        for (int i = 0; i < Catch.size(); i++) {
            list.add(Catch.get(i));
        }
        return list;
    }
}
