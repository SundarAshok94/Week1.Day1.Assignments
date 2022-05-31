package Week1.Day1.Assignments;

public class Primenumber {

	public static void main(String[] args) {

		int number=3;
		boolean isflag=true;
		if(number == 0 || number == 1) {

			System.out.println("its not a prime number");	
		}
		else {
			for(int i=2;i<number;i++) {
				if(number==2)
					System.out.println("Prime number");

				else if(number%i==0)
				{

					isflag=false;
				}
			}
			if(isflag) {
				System.out.println("its prime number");
			}
			else {
				System.out.println("its not a prime number");
			}
		}
	}

}



