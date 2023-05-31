package day5;

import java.util.Scanner;

public class SDAEx {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.println("enter the elements of array");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("array elements are");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]);
	}
}
}
