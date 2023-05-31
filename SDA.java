package day5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class SDA {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
 int arr[]=new int[6];
 System.out.println("enter array elements");
 for(int i=0;i<=arr.length-1;i++)
 {
	 arr[i]=scan.nextInt();
 }
 System.out.println("enter key value");
int key=scan.nextInt();
System.out.println(Arrays.binarySearch(arr, key));
	}

}
