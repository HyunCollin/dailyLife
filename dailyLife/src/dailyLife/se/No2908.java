package dailyLife.se;
//734 893
import java.util.Scanner;

public class No2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] ins = input.split(" ");
		String a = ins[0];
		String b = ins[1];
		char[] cs = a.toCharArray();
		char[] reCs = new char[cs.length];
		
		char[] ds = b.toCharArray();
		char[] reDs = new char[ds.length];
		
		for (int i = 0; i < cs.length; i++) {
			reCs[cs.length - i -1] = cs[i];
			reDs[ds.length - i -1] = ds[i];
		}
		
		System.out.println(Math.max(Integer.parseInt(String.valueOf(reCs)), Integer.parseInt(String.valueOf(reDs))));;
	}
}
