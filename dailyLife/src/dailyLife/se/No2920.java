package dailyLife.se;

//1 2 3 4 5 6 7 8
import java.util.Scanner;
public class No2920 {
	public static void main(String[] args) {
		String ascending = "1 2 3 4 5 6 7 8";
		String descending = "8 7 6 5 4 3 2 1";
		
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		
		if(ascending.equals(in)) {
			System.out.println("ascending");
		}else if(descending.equals(in)) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}
