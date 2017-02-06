//https://www.acmicpc.net/problem/1449
package dailyLife.feb;

import java.util.Arrays;
import java.util.Scanner;
public class PipeRepair {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//4 2
//1 2 5 9 100 101
        int n = scanner.nextInt();
        int tapeLength = scanner.nextInt();
        
        int[] pipeHoles = new int[n];
        
        for (int i = 0; i < n; i++) {
			pipeHoles[i] = scanner.nextInt();
		}
        
        Arrays.sort(pipeHoles);

        int totalTape = 0;
        int stickPoint = 0;
        for (int i = 0; i < n; i++) {
        	
			int fPoint = pipeHoles[i];
			
			if(stickPoint < fPoint){
				stickPoint = fPoint + ( tapeLength - 1 ) ;
				totalTape++;
			}			
		}
        
        System.out.println(totalTape);
        
        scanner.close();
	}
}
