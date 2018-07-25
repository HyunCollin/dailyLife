package dailyLife.se;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1152 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		if(in.contains(" ")) {
			String[] arr = in.split(" ");
			
			int count = 0;
			for (String string : arr) {
				if(string.length() > 0) {
					count++;
				}
			}
			System.out.println(count);
		}else {
			System.out.println(1);
		}
	}
}
// BufferedReader br