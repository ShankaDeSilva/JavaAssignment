import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		int no1, no2, ans = 0; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter \n\n * : For multiplication \n / : For division \n + : For addition \n - : For substraction \n\n "
				+ "Any other character : To exit");
		String math = scanner.nextLine();
		
		System.out.println("Please Enter No1 : ");
		no1 = scanner.nextInt();
		System.out.println("Please Enter No2 : ");
		no2 = scanner.nextInt();
		
		switch(math) {
		case "*":
			ans = no1 * no2;
			break;
		case "/" :
			ans = no1 / no2;
			break;
		case "+" :
			ans = no1 + no2;
			break;
		case "-" :
			ans = no1 - no2;
			break;
		}
		
//		if(math.equals("*")) {
//			ans = no1 * no2;
//		} else if(math.equals("/")) {
//			ans = no1 / no2;
//		} else if(math.equals("+")) {
//			ans = no1 + no2;
//		} else if(math.equals("-")) {
//			ans = no1 - no2;
//		}
		
		System.out.println("Answer is : " + ans);
		
		scanner.close();
	}

}
