package day5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ref2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int length=scan.nextInt();
	int[] arr=(int[])Array.newInstance(int.class, length);
	System.out.println(Arrays.toString(arr));
}
}
