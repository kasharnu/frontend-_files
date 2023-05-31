package day5;

import java.util.Scanner;

public class ThreeDimen {
	public static void main(String[] args) {
		
	 Scanner sc=new Scanner(System.in);
		int arr[][][]=new int[2][2][2];
		System.out.println("enter the elements of array");
System.out.println("hello first commit");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
			arr[i][j][k]=sc.nextInt();
		}
		}
		}
		System.out.println("array elements are");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
		{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
		
			System.out.print(arr[i][j][k]+" ");
		}
			System.out.println();
		}
}
	
}
}
