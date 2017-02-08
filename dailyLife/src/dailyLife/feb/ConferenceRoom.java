//https://www.acmicpc.net/problem/1931
package dailyLife.feb;

import java.util.Scanner;

public class ConferenceRoom {
	private static int conferenceNum = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		conferenceNum = scanner.nextInt();
		
		int[][] roomTime = new int[conferenceNum][2];
		
		for (int i = 0; i < conferenceNum; i++) {
			roomTime[i][0] = scanner.nextInt();
			roomTime[i][1] = scanner.nextInt();
		}
				
		sortOrderAsc(roomTime);
		
		printEndTimeSeq(roomTime);
		
		scanner.close();
	}

	private static void printEndTimeSeq(int[][] roomTime) {
		int fStartTime = 0;
		int totalCnt = 0;
		for (int i = 0; i < conferenceNum; i++) {
			if(roomTime[i][0] >= fStartTime){
//				System.out.println(roomTime[i][0] + ", " + roomTime[i][1]);
				totalCnt++;
				fStartTime = roomTime[i][1];
			}
		}
		System.out.println(totalCnt);
	}
	
	private static void sortOrderAsc(int[][] maps) {
		for (int i = 0; i < conferenceNum; i++) {
			int compare = maps[i][1];
			int tIndex = 0;
			
			for (int j = i; j < conferenceNum; j++) {
				if(compare >= maps[j][1]){
					compare = maps[j][1];
					tIndex = j;
				}
			}
			if(tIndex > 0 ){
				int tempA = maps[i][0];
				int tempB = maps[i][1];
				maps[i][0] = maps[tIndex][0];
				maps[i][1] = maps[tIndex][1];
				maps[tIndex][0] = tempA;
				maps[tIndex][1] = tempB;
			}
		}		
	}
}