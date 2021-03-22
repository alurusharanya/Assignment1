package assignment1.pizzademo;

public class Nutritionist {
	
	void printCalories(Pizza p) {

		String cal=Pizza.fetchCalories(p);
		System.out.println(cal);
	}

}
