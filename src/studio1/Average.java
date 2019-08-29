package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);

        int i1 = ap.nextInt("Please enter the first of the two integers to be averaged");
        int i2 = ap.nextInt("Please enter the second of the two integers to be averaged");

        System.out.println((i1+i2)/2.0);

    }
}
