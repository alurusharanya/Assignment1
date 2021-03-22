package assignment1.lambdademo;

import java.util.Scanner;

public class LambdaDemo1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		NoParam np=()->a%2==0;
		if(np.evenOdd())
		System.out.println("Method in NoParam interface says:"+a+" is even");
		else
			System.out.println("Method in NoParam interface says:"+a+" is odd");
		
		Comparison cmp=p->p<98;
		System.out.print("Method in Comparison interface says: ");
		System.out.println(a+" < 98 is :"+cmp.compare(a));
		sc.close();
		
	

	}

}

interface NoParam{
	boolean evenOdd();
}

interface Comparison{
	boolean compare(int p);
}
