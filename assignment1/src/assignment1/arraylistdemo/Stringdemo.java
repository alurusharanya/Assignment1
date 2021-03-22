package assignment1.arraylistdemo;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] str=new String[2][3];
		str[0][0]="1-one";
		str[0][1]="2-two";
		str[0][2]="3-three";
		str[1][0]="4-four";
		str[1][1]="5-five";
		str[1][2]="6-six";
		System.out.println("Displaying String values without using loops:");
		System.out.println(str[0][0]+"  "+str[0][1]+"  "+str[0][2]);
		System.out.println(str[1][0]+"  "+str[1][1]+"  "+str[1][2]);
		System.out.println("Displaying String values without using nested loops:");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(str[i][j]+"  ");
			}
			System.out.println();
		}
		
	

	}

}
