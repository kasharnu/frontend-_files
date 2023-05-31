package day5;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArr {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		int arr[][]=new int[4][];
	    arr[0]=new int[4];
	    arr[1]=new int[3];
	    arr[2]=new int[6];
	    arr[3]=new int[2];
		System.out.println("enter the elements of array");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
			arr[i][j]=sc.nextInt();
		}
		}
		System.out.println("array elements are");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
			System.out.println();
		}
	//int	key=35;
	//System.out.println(Arrays.binarySearch(arr, key));
		System.out.println(arr[1][1]);
}
}
