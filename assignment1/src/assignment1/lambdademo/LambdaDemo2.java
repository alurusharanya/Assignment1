package assignment1.lambdademo;



public class LambdaDemo2 {
	
	public static void main(String[] args) {
		
		double[] params= {20.23,30.34};
		Shape s=()->params[0]*params[1];
		Operation op=(name,param)->{
			System.out.println("Name is:"+name);
			System.out.println("Parameters are:");
			for(int i=0;i<param.length;i++)
				System.out.println(param[i]);
		};
		op.operate("Rectangle",params);
		s.computeArea();
		System.out.println("Area is:"+s.computeArea());
		 
	}

}


interface Shape{
	double computeArea();
}

interface Operation{
	void operate(String name,double[] params);
}