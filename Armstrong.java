package Week1.Day1.Assignments;

public class Armstrong {

	public static void main(String[] args) {


		int Input=776;
		int sum=0;
		int original=Input;


		while(Input>0) {

			int Rem= Input % 10;
			sum = sum +(Rem*Rem*Rem);
			Input = Input/10;

		}
		if(sum == original) {

			System.out.println("number is armstrong number");
		}
		else {

			System.out.println("not a armstrong number");
		}
	}}
