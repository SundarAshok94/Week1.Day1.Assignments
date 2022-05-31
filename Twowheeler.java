package Week1.Day1.Assignments;

public class Twowheeler {
	
	int noofwheels = 4;
	short mirrors=2;
	long chassisnumber=28658372;
	boolean ispunctured = false;
	double runningKM =85000.34;
	
	public void braking() {
		System.out.println("Vehicle is barked");
		}
	
	public void running() {
		
		boolean ispunctured = false;
		
		if(ispunctured) {
			
			System.out.println("vehicle is not punctured");
			
			}
		else
			System.out.println("vehicle punctured");
		
	}

	public void drift() {
		
		System.out.println("vehicle drifted");
		
		
	}
	
	public static void main(String[] args) {
		
		Twowheeler tw = new Twowheeler();
		tw.running();
		tw.drift();
		tw.braking();
		System.out.println("total on of Wheels in car is: " + tw.noofwheels);
		System.out.println("Total no of mirrors is: " + tw.mirrors);
		System.out.println("Chassis number of car is " + tw.chassisnumber);
		System.out.println("Total Ran KMs of Car: " + tw.runningKM);
							
	}
}



