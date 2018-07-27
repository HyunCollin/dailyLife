package dailyLife.se;
//Mississipi	-> ?
//zZa -> Z
//bbbaaa -> A
//abcc
//aabccd
//aaab
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class No1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		in = in.toUpperCase();
		char[] arr = in.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(map.get(arr[i]) != null) {
				map.put(arr[i], map.get(arr[i]) +1);
			}else {
				map.put(arr[i], 1);	
			}
		}
		
		Set<Character> keys = map.keySet();
		Character fChar = ' ';
		int maxCount = 0;
		for (Character character : keys) {
			if(maxCount < map.get(character)){
				maxCount = map.get(character);
				fChar = character;
			}else if(maxCount == map.get(character)){
				fChar = '?';
			}
		}
		System.out.println(fChar);
		
	}
}
