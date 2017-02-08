//https://www.acmicpc.net/problem/1931
package dailyLife.feb;

import java.util.Scanner;

public class ConferenceRoom {
	private static int conferenceNum = 0;
	private static int startRoomTime = 0;
	private static int[][] roomTime = null;
	private static int[] endCon = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		conferenceNum = scanner.nextInt();

		roomTime = new int[conferenceNum][2];
		endCon = new int[conferenceNum];

		for (int i = 0; i < conferenceNum; i++) {
			roomTime[i][0] = scanner.nextInt();
			roomTime[i][1] = scanner.nextInt();
			endCon[i] = 0;
		}

		int total = 0;
		while (true) {
			int nowConference = getConferenceNo();

			if (nowConference == -1) {
				System.out.println(total);
				break;
			}

			total++;
			startRoomTime = roomTime[nowConference][1];
			endCon[nowConference] = 1;
			endCon[nowConference] = 1;
		}

		scanner.close();
	}

	private static int getConferenceNo() {
		int temp = 2147483647;
		int tI = -1;
		for (int i = 0; i < conferenceNum; i++) {
			if (temp >= roomTime[i][1] && endCon[i] == 0 && startRoomTime <= roomTime[i][0]) {
				int k = i;
				if(tI >= 0 ){
					if(roomTime[tI][0] < roomTime[k][0] && roomTime[tI][1] == roomTime[k][1]){
						k = tI;
					}
				}				
				temp = roomTime[k][1];
				tI = k;				
			}
		}
		return tI;
	}
}
// 2 2 2 2 2 = 2
// 3 1 1 1 2 1 3 = 2
// 6 1 3 3 100 4 5 6 6 5 6 7 7 = 5
// 11 1 4 3 5 0 6 5 7 3 8 5 9 6 10 8 11 8 12 2 13 12 14 = 4
// 10 8 8 8 8 8 8 8 8 6 8 8 8 8 8 8 8 8 8 8 8 = 10