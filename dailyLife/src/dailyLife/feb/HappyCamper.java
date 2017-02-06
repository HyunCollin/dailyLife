//https://www.acmicpc.net/problem/4796
package dailyLife.feb;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class HappyCamper {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//input sequence = L , P, V
//        5 8 20
//        5 8 17
//        0 0 0
        
        Queue<Integer> queue = new ArrayDeque<>();
        
        while(true){
        	int input = scanner.nextInt();
        	if(input == 0){
        		break;
        	}
        	queue.add(input);
        }
        int i = 1;
        while( !queue.isEmpty() ){
        	int lUseableDay = queue.poll();
        	int pCampDays = queue.poll();
        	int vTotalDay = queue.poll();

        	int mok = ( vTotalDay / pCampDays );
        	
        	int dayCnt = mok * lUseableDay;
        	
        	int diff = vTotalDay - ( mok * pCampDays );
        	
        	if(diff >= lUseableDay){
        		dayCnt += lUseableDay;
        	}else if(diff < lUseableDay){
        		dayCnt += diff;
        	}
        	
        	System.out.println("Case "+i+": " + dayCnt);
        	i++;
        }
        
        scanner.close();
	}
}
