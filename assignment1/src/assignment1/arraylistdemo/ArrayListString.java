package assignment1.arraylistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter number of elements to insert in array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] str = new String[n];
		System.out.println("Enter values into String array");
		for(int i=0;i<n;i++)
			str[i]=sc.next();
		System.out.println("Values in array:");
		for(int i=0;i<n;i++)
			System.out.println(str[i]);
		List<String> res=convertArrayToList(str);
		System.out.println("After converting array to array list:"+res);
		System.out.println("After removing duplicate elements list values are:"+removeDuplicate(str));
		sc.close();
		

	}

	private static List<String> removeDuplicate(String[] str) {
		// TODO Auto-generated method stub
		List<String> olist=Arrays.asList(str);
		List<String> nlist=new ArrayList<String>();
		for(String i:olist) {
			if(!nlist.contains(i)) {
				nlist.add(i);
			}
		}
		return nlist;
	}

	private static List<String> convertArrayToList(String[] str) {
	
		return Arrays.asList(str);
	}

}
