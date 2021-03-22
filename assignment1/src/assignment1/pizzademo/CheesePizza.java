package assignment1.pizzademo;

public class CheesePizza extends Pizza {
	

	
	void makePizza() {
		System.out.println("This is Cheese Pizza Class");
	}

	public static void main(String[] args) {
		CheesePizza cp=new CheesePizza();
		
		MargheritaPizza mp=new MargheritaPizza();
		
		Pizza p=new CheesePizza();
		
		cp.makePizza();
		mp.makePizza();
		p.makePizza();
		
		Nutritionist n=new Nutritionist();
		n.printCalories(cp);
		n.printCalories(mp);

	}

}
