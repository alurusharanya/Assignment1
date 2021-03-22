package assignment1.pizzademo;

public class Pizza {
	
	void makePizza() {
		System.out.println("This is Pizza Class");
	}
	
	public static String fetchCalories(Pizza p) {
		
		String cal="";
		if(p instanceof MargheritaPizza)
		cal="Clories for Margherita Pizza is:"+200.30;
		else if(p instanceof CheesePizza)
		cal="Clories for Cheese Pizza is:"+150.10;
		
			return cal;
		
	}

}
