package com.company;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void printMatrix(int matrix[][])
    {
        for (int i = 0; i < matrix.length; i++)
        {

            for (int j = 0; j < matrix[i].length; j++)
            {

                System.out.print( matrix[i][j]  + "\t");
            }
            System.out.println();
        }
    }
    public static void cheatTable(int[][] matrix,List<int[]> steps)
    {

        if(matrix[5][0]==1) {
            useSwitch(0, 0, matrix);
            int [] array={0,0};
            steps.add(array);
            useSwitch(0, 2, matrix);
            int [] array2={0,2};
            steps.add(array);
            steps.add(array2);


        }
        if(matrix[5][1]==1) {
            int [] array={0,3};
            useSwitch(0, 3, matrix);
            steps.add(array);

        }
         if(matrix[5][2]==1) {
             int [] array={0,0};
            useSwitch(0, 0, matrix);
             int [] array2={0,4};
            useSwitch(0, 4, matrix);
             steps.add(array);
             steps.add(array2);

        }
         if(matrix[5][3]==1) {
            useSwitch(0, 1, matrix);
             int [] array={0,1};
            useSwitch(0, 5, matrix);
             int [] array2={0,5};
             steps.add(array);
             steps.add(array2);

        }
        if(matrix[5][4]==1) {
            int [] array={0,2};
            useSwitch(0, 2, matrix);
            steps.add(array);

        }
        if(matrix[5][5]==1) {
            useSwitch(0, 3, matrix);
            int [] array={0,3};
            useSwitch(0, 5, matrix);
            int [] array2={0,5};
            steps.add(array);
            steps.add(array2);

        }

    }

    public static void useSwitch(int i,int j,int[][] matrix )
    {
        if(j!=0 && j!=5 && i!=5 && i!=0) {
            if(matrix[i][j]==1)
                matrix[i][j] = 0;
            else
                matrix[i][j] = 1;
            if(matrix[i+1][j]==1)
                matrix[i + 1][j] = 0;
            else
                matrix[i + 1][j] = 1;
            if(matrix[i-1][j]==1)
                matrix[i - 1][j] = 0;
            else
                matrix[i - 1][j] = 1;
            if(matrix[i][j+1]==1)
                matrix[i][j + 1] = 0;
            else
                matrix[i][j + 1] = 1;
            if(matrix[i][j-1]==1)
                matrix[i][j - 1] = 0;
            else
                matrix[i][j - 1] = 1;
        }
        if(i==0 && j!=0 && j!=5){
            if(matrix[i][j]==1)
                matrix[i][j] = 0;
            else
                matrix[i][j] = 1;
            if(matrix[i+1][j]==1)
                matrix[i + 1][j] = 0;
            else
                matrix[i + 1][j] = 1;
            if(matrix[i][j+1]==1)
                matrix[i][j + 1] = 0;
            else
                matrix[i][j + 1] = 1;
            if(matrix[i][j-1]==1)
                matrix[i][j - 1] = 0;
            else
                matrix[i][j - 1] = 1;
        }
        if( i==0 && j==0)
        {
            if(matrix[i][j]==1)
                matrix[i][j] = 0;
            else
                matrix[i][j] = 1;
            if(matrix[i+1][j]==1)
                matrix[i + 1][j] = 0;
            else
                matrix[i + 1][j] = 1;
            if(matrix[i][j+1]==1)
                matrix[i][j + 1] = 0;
            else
                matrix[i][j + 1] = 1;
        }
        if(i==0 && j==5){
            if(matrix[i][j]==1)
                matrix[i][j] = 0;
            else
                matrix[i][j] = 1;
            if(matrix[i+1][j]==1)
                matrix[i + 1][j] = 0;
            else
                matrix[i + 1][j] = 1;

            if(matrix[i][j-1]==1)
                matrix[i][j - 1] = 0;
            else
                matrix[i][j - 1] = 1;
        }
        if(j==0 && i!=0 && i!=5)
        {
            if(matrix[i][j]==1)
                matrix[i][j] = 0;
            else
                matrix[i][j] = 1;
            if(matrix[i+1][j]==1)
                matrix[i + 1][j] = 0;
            else
                matrix[i + 1][j] = 1;
            if(matrix[i-1][j]==1)
                matrix[i - 1][j] = 0;
            else
                matrix[i - 1][j] = 1;
            if(matrix[i][j+1]==1)
                matrix[i][j + 1] = 0;
            else
                matrix[i][j + 1] = 1;
        }
        if(i==5 && j!=0 && j!=5){
            if(matrix[i][j]==1)
                matrix[i][j] = 0;
            else
                matrix[i][j] = 1;
            if(matrix[i-1][j]==1)
                matrix[i - 1][j] = 0;
            else
                matrix[i - 1][j] = 1;
            if(matrix[i][j+1]==1)
                matrix[i][j + 1] = 0;
            else
                matrix[i][j + 1] = 1;
            if(matrix[i][j-1]==1)
                matrix[i][j - 1] = 0;
            else
                matrix[i][j - 1] = 1;
        }
        if(j==5 && i!=0 && i!=5){
            if(matrix[i][j]==1)
                matrix[i][j] = 0;
            else
                matrix[i][j] = 1;
            if(matrix[i+1][j]==1)
                matrix[i + 1][j] = 0;
            else
                matrix[i + 1][j] = 1;
            if(matrix[i-1][j]==1)
                matrix[i - 1][j] = 0;
            else
                matrix[i - 1][j] = 1;
            if(matrix[i][j-1]==1)
                matrix[i][j - 1] = 0;
            else
                matrix[i][j - 1] = 1;
        }
        if(i==5 && j==0){
            if(matrix[i][j]==1)
                matrix[i][j] = 0;
            else
                matrix[i][j] = 1;

            if(matrix[i-1][j]==1)
                matrix[i - 1][j] = 0;
            else
                matrix[i - 1][j] = 1;
            if(matrix[i][j+1]==1)
                matrix[i][j + 1] = 0;
            else
                matrix[i][j + 1] = 1;

        }
        if(i==5 && j==5){
            if(matrix[i][j]==1)
                matrix[i][j] = 0;
            else
                matrix[i][j] = 1;

            if(matrix[i-1][j]==1)
                matrix[i - 1][j] = 0;
            else
                matrix[i - 1][j] = 1;

            if(matrix[i][j-1]==1)
                matrix[i][j - 1] = 0;
            else
                matrix[i][j - 1] = 1;
        }


    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 0, 0, 0,0,1 },
                { 0, 0, 0, 1,0,0 },
                { 1, 1, 0, 1,0,0 },
                { 0, 0, 0, 0,0,1 },
                { 0, 0, 0, 1,0,0 },
                { 1, 0, 0, 1,0,0 } };

      List<int[]> steps = new ArrayList<int[]>();
        printMatrix(matrix);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));


        for (int i = 1; i < matrix.length; i++)
        {

            for (int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i-1][j]==1)
                {
                   useSwitch(i,j,matrix);
                   int[] array ={i,j};
                   steps.add(array);
                }

            }

        }

        cheatTable(matrix,steps);

        for (int i = 1; i < matrix.length; i++)
        {

            for (int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i-1][j]==1)
                {
                    useSwitch(i,j,matrix);
                }

            }



        }
        System.out.println();
        printMatrix(matrix);
        for(int i=0;i<steps.size();i++)
        {
            System.out.println(steps.get(i)[0]+":"+steps.get(i)[1]);
        }




    }
}
