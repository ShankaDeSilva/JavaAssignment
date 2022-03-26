
public class Question8 {

	public static void main(String[] args) {

		for(int i = 10; i < 100; i++) {
			char[] chars = ("" + i).toCharArray();
			
			total = chars[0] + chars[1];
			System.out.println(i + "\t" + chars[0] + "+" + chars[1] + "=" + total);
		}
	}

}
