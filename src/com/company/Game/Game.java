package com.company.Game;

import com.company.Matrix.Cheak_Coord;
import com.company.Matrix.Cheake;
import com.company.Matrix.CreateMatrix;

import java.util.Scanner;

public class Game {
    public int arr2[][];
    public int arr[][] = new int[10][10];

    private int column, row, quality;
    private boolean flag = false;
    private int step = 0;

    CreateMatrix createMatrix = new CreateMatrix();

    Cheak_Coord cheak_coord = new Cheak_Coord();

    Cheake cheake = new Cheake();

    Scanner in = new Scanner(System.in);

    public Game() {
        arr2 = createMatrix.Clone_Matrix();

        quality = cheake.Quality(arr2);

        int q = 0;

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        while (q != quality) {

            flag = false;
            while (!flag) {
                System.out.print("Введите столбец:");
                column = in.nextInt();
                System.out.print("Введите строку:");
                row = in.nextInt();

                if (row > 0 || row <= 10 || column > 0 || column <= 10) {
                    flag = true;
                    step++;
                } else {
                    System.out.println("Вы вышли за пределы поля,повторите попытку!!!");
                }
            }

            if (arr[row - 1][column - 1] == 0) {
                if (arr2[row - 1][column - 1] == 1) {
                    if (cheak_coord.Cheak_Coord(row - 1, column - 1) == 0) {
                        System.out.println("Потопил");
                        arr[row - 1][column - 1] = 1;
                        q++;
                    } else {
                        System.out.println("Попал");
                        arr[row - 1][column - 1] = 1;
                        q++;
                    }
                } else {
                    System.out.println("Промазал");
                    arr[row - 1][column - 1] = 2;
                }
                for (int i = 0; i <= 9; i++) {
                    for (int j = 0; j <= 9; j++) {
                        System.out.print(arr[i][j] + "  ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Вы так уже ходили,повторите попытку");
            }
            if (q == quality) {
                System.out.println("Поздравляю,вы победили))");
                System.out.println("Ваша число ходов:" + step);
                System.out.println("Число попаданий:" + quality);
                System.out.println("Число промахов:" + (step - quality));
                System.out.println("!!!!!!!!!!!!");
                for (int i = 0; i <= 9; i++) {
                    for (int j = 0; j <= 9; j++) {
                        System.out.print(arr2[i][j] + "  ");
                    }
                    System.out.println();
                }
                System.out.println("!!!!!!!!!!!!");
            }
        }
    }
}
