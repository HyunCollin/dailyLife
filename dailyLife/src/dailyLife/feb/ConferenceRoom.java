//https://www.acmicpc.net/problem/1931
package dailyLife.feb;

import java.util.Scanner;

public class ConferenceRoom {
	private static int fStartTime = 0;
	private static int totalCnt = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int conferenceNum = scanner.nextInt();
		int[] roomStartTime = new int[conferenceNum];
		int[] roomEndTime = new int[conferenceNum];		
		
		for (int i = 0; i < conferenceNum; i++) {
			roomStartTime[i] = scanner.nextInt();
			roomEndTime[i] = scanner.nextInt();
		}
				
		// 입력받은 회의 시간 배열을 끝나는 시간이 빠른순서로 정렬이 필요함 
		
		boolean isEnd = false;
		while( !isEnd ){
			isEnd = printEndTimeSeq(roomStartTime, roomEndTime);
		}
		scanner.close();
	}

	private static boolean printEndTimeSeq(int[] roomStartTime, int[] roomEndTime) {
		int tempIndex = -1;
		int fEndTime = 2147483647;
		boolean isEnd = false;
		for (int i = 0; i < roomEndTime.length; i++) {
			if( roomEndTime[i] <= fEndTime && roomStartTime[i] >= fStartTime ){
				tempIndex = i;
				fEndTime = roomEndTime[i];
			}
		}
		if(tempIndex >= 0){
			fStartTime = roomEndTime[tempIndex];
			totalCnt++;
		}else{
			System.out.println(totalCnt);
			isEnd = true;
		}
		return isEnd;		
	}
}