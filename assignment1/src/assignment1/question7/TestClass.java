package assignment1.question7;

class Radio{
	private double frequency=1.1;

	public double getFrequency() {
		
		return frequency;
	}
}
class TV{
	private int channel=3;

	public int getChannel() {
	
		return channel;
	}
}
public class TestClass {

	public static void main(String[] args) {
		TV t=new TV();
		Radio r=new Radio();
	
		System.out.println("Reset for TV:"+reset(t));
		System.out.println("Reset for Radio:"+reset(r));
		
		System.out.println("Frequency is:"+r.getFrequency());
		System.out.println("Radio is:"+t.getChannel());
		
		
		

	}

	private static double reset(Radio r) {
		// TODO Auto-generated method stub
		return 0.0;
	}

	private static int reset(TV t) {
		// TODO Auto-generated method stub
		return 0;
				
	}

}
