package assignment1.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Switching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of elements to insert into list");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter values into list");
		for(int i=0;i<n;i++)
			list.add(sc.nextInt());
		System.out.println("Enter two positions to switch");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("List before Switching:"+list);
		System.out.println("List after switching:"+switchIt(list,a,b));
		sc.close();

	}

	private static List<Integer> switchIt(List<Integer> aOne, int a, int b) {
		
				Collections.swap(aOne, a, b);
		
		return aOne;
	}

}
