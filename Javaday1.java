package Week1.Day1.Assignments;

public class Javaday1 {
	
	//Variables
	short maxspeed = 110;
	int price = 700000;
	int seat = 5;
	float mileage = 25f;
	double distancecovered = 20000.354d;
	char fueltype = 'P';
	boolean ispetrolengine =true;
	
	public void Drive() {
		
		int regnumber = 12345;
		System.out.println("make a call");
		System.out.println("regnumber =" + regnumber);
	}
	
	public void overspeed() {
		System.out.println("Make a message");
		int n =5;
		for(int noofmsgs =1; noofmsgs<n;noofmsgs++) {
			
		if(noofmsgs<5) {
		System.out.println("total no of messages: " + noofmsgs);
			
		}
		}
		
		int driverage=70;
		if(driverage>=18) {
			System.out.println("Driver is elgible for driving:");
		}
		else if(driverage>=60) {
			System.out.println("Driver is a senior citizen");}
			else if(driverage<=18) {
				System.out.println("dont allow driving");
			}
	}
		
		public void addition(){
			int a=2;
			int b=4;
			int c=a+b;
			System.out.println("Adding of two number = " +  c);
			}
	
	
				
	public static void main(String [] args) {
		Javaday1 driving = new Javaday1();
	    driving.Drive();
	    driving.overspeed();
	    driving.addition();
		System.out.println("total number of seat:" +  driving.seat);
		
		}
	
}
