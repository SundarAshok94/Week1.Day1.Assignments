package Week1.Day1.Assignments;

public class Fibonacci {

	public static void main(String[] args) {
		int firstnum=0;
		int secnum=1;
		int n=10;
		int i=1;
		while(i<n) {
			int nextnum = firstnum + secnum;

			System.out.print(firstnum + ",");
			
			firstnum = secnum;
			secnum = nextnum;
			
			i++;
			
		    }
			

	}

}



