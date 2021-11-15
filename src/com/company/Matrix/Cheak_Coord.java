package com.company.Matrix;

import java.util.ArrayList;

public class Cheak_Coord {
    ArrayList<Integer> list=new ArrayList<>();
    public void Take_list(ArrayList<Integer> list)
    {
        this.list=list;
    }

    public int Cheak_Coord(int row, int column) {
        boolean flag_2 = false;
        int step_4 = 0, step_3 = 0, step_32 = 0, step_2 = 0;
        //4 palub
        if (step_4 != 4) {
            for (int i = 0; i <= 8; i += 2) {
                if (row == list.get(i) && column == list.get(i + 1)) {
                    step_4++;
                    flag_2 = true;
                }
            }
        }
        if (step_3 != 3) {
            for (int i = 9; i <= 14; i += 2) {
                if (row == list.get(i) && column == list.get(i + 1)) {
                    flag_2 = true;
                    step_3++;
                }
            }
        }
        if (step_32 != 3) {
            for (int i = 15; i <= 20; i += 2) {
                if (row == list.get(i) && column == list.get(i + 1)) {
                    flag_2 = true;
                    step_32++;
                }
            }
        }
        if (step_2 != 2) {
            for (int i = 21; i <= 24; i += 2) {//32
                if (row == list.get(i) && column == list.get(i + 1)) {
                    flag_2 = true;
                    step_2++;
                }
            }
        }
        int step_22 = 0;
        if (step_22 != 2) {
            for (int i = 25; i <= 28; i += 2) {
                if (row == list.get(i) && column == list.get(i + 1)) {
                    flag_2 = true;
                    step_22++;
                }
            }
        }
        int step_23 = 0;
        if (step_23 != 2) {
            for (int i = 29; i <= 32; i += 2) {
                if (row == list.get(i) && column == list.get(i + 1)) {
                    flag_2 = true;
                    step_23++;
                }
            }
        }

        if (flag_2 == true) {
            return 1;
        } else {
            return 0;
        }
    }
}
