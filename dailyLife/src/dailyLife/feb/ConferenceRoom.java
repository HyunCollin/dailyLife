//https://www.acmicpc.net/problem/1931
package dailyLife.feb;

import java.util.Scanner;

public class ConferenceRoom {
	private static int fStartTime = 0;
	private static int totalCnt = 0;
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
		
		boolean isEnd = false;
		while( !isEnd ){
			isEnd = printEndTimeSeq(roomTime);
		}
		scanner.close();
	}

	private static boolean printEndTimeSeq(int[][] roomTime) {
		int tempIndex = -1;
		int fEndTime = 2147483647;
		boolean isEnd = false;
		for (int i = 0; i < conferenceNum; i++) {
			if( roomTime[i][1] <= fEndTime && roomTime[i][0] >= fStartTime ){
				tempIndex = i;
				fEndTime = roomTime[i][1];
			}
		}
		if(tempIndex >= 0){
			fStartTime = roomTime[tempIndex][1];
			totalCnt++;
		}else{
			System.out.println(totalCnt);
			isEnd = true;
		}
		return isEnd;		
	}
	
	private static void sortOrderAsc(int[][] maps) {
		for (int i = 0; i < conferenceNum; i++) {
			int frInt = maps[i][1];
			int tIndex = 0;
			
			for (int j = i; j < conferenceNum; j++) {
				int backInt = maps[j][1];
				if(frInt >= backInt){
					frInt = backInt;
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