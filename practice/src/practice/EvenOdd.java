package practice;

import java.util.Scanner;

public class EvenOdd {
	
	public static void oddeven(int arr[],int even[],int odd[],int m[]) {
		int l=0;
		System.out.println("even array");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even[i]=arr[i];
				System.out.println(even[i]);
				
			}
			}
		System.out.println("odd array");
			for(int j=0;j<arr.length;j++) {
				if(arr[j]%2!=0) {
			
				odd[j]=arr[j];
				System.out.println(odd[j]);
			}
		}
			System.out.println("merge array");
		for(int i=0;i<even.length;i++) {
			m[i]=even[i];
			l=i;
		
			System.out.println(m[i]);
		}
		
		  System.out.println("merged array");
		  for(int j=l+1;j<10;j++) { 
			  m[j]=odd[j];
		  System.out.println(m[j]);
		  
		 
		  
		  }
		 
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int [] evenarray = new int[10];
		int [] oddarray = new int[10];
		int [] merge = new int[10];
		oddeven(arr,evenarray,oddarray,merge);

	}

}
