package Java;

import java.util.Scanner;

public class WelcomeProject {
    public static void main(String[] args) {
        System.out.println("enter array size ");
        int size = 0;
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        int[] score = new int[size];
        fillarray(score);
        System.out.println("enter number to search");
        int searchednumber;
        searchednumber = input.nextInt();
        int index = search(score, searchednumber);
        if (index >= 0)
            System.out.println("index = " + index);
        else
            System.out.println("Value not found ");
        int maximumscore ;
       maximumscore = max(score);
        System.out.println("maximumscore is " + maximumscore);
    }

    public static void fillarray(int list[]) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        int average = 0;
        int score = 0;
        for (i = 0; i < list.length; i++) {
            System.out.println("enter score for test1 " + (i + 1));
            score = input.nextInt();
            list[i] = score;
            sum += score;
            average = sum / list.length;
        }
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }

    public static int search(int list[], int target) {
        int i = 0;
        for (i = 0; i < list.length; i++) {
            if (target == list[i])
                return i;
        }
        return -1;
    }

    public static int max(int list[]) {
        int i = 1;
        int maxnumm = list[0] ;
        for (i = 1; i < list.length; i++) {
if (list[i] > maxnumm)
maxnumm = list[i];

        }
return maxnumm ;
    }

}