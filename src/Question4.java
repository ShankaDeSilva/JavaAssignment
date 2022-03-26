
public class Question4 {

	public static void main(String[] args) {
		
		double gpa = Double.parseDouble(args[0]);
		
		if(gpa >= 3.6) {
			System.out.println("First Class Hons");
		} else if(gpa >= 3.4) {
			System.out.println("Upper Second Class Hons");
		} else if(gpa >= 3.0) {
			System.out.println("Lower Second Class Hons");
		} else if(gpa < 3.00 || gpa >= 2.00) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}	
}
