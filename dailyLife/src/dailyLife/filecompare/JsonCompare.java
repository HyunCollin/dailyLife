package dailyLife.filecompare;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonCompare {
	public static void main(String[] args) {
		String oldAPI = "{\"test\":[{\"name\":\"a\",\"type\":\"b\"},{\"name\":\"ab\",\"type\":\"c\"},{\"name\":\"abc\",\"type\":\"cd\"},{\"name\":\"zz\",\"type\":\"f\"}]}";
		String newAPI = "{\"test\":[{\"name\":\"zz\",\"type\":\"f\"},{\"name\":\"abc\",\"type\":\"cd\"},{\"name\":\"ab\",\"type\":\"c\"},{\"name\":\"a\",\"type\":\"b\"}]}";
//		String oldAPI = scanner.nextLine();//{"test":[{"name":"a","type":"b"},{"name":"ab","type":"c"},{"name":"abc","type":"cd"},{"name":"zz","type":"f"}]}
//		String newAPI = scanner.nextLine();//{"test":[{"name":"zz","type":"f"},{"name":"a","type":"b"},{"name":"abc","type":"cd"},{"name":"ab","type":"c"}]}
		try {

			JSONParser jsonParser = new JSONParser();

			// JSON데이터를 넣어 JSON Object 로 만들어 준다.
			JSONObject oldAPIJson = (JSONObject) jsonParser.parse(oldAPI);
			JSONObject newAPIJson = (JSONObject) jsonParser.parse(newAPI);

			// 배열을 추출
			JSONArray oldApiList = (JSONArray) oldAPIJson.get("test");
			JSONArray newApiList = (JSONArray) newAPIJson.get("test");

			// size가 다르면 응답값이 다르다. 비교할 필요 없음
			if (oldApiList.size() == newApiList.size()) {

				if( compareJsonObject(oldApiList, newApiList) ){
					System.out.println("같습니다.");
				}else{
					System.out.println("다릅니다.");
				}
			}

			for (int i = 0; i < oldApiList.size(); i++) {

				// 배열 안에 있는것도 JSON형식 이기 때문에 JSON Object 로 추출
				JSONObject oldObject = (JSONObject) oldApiList.get(i);

				// JSON name으로 추출
				System.out.println("test: name==>" + oldObject.get("name"));
				System.out.println("test: type==>" + oldObject.get("type"));

			}
			
			for (int i = 0; i < newApiList.size(); i++) {

				// 배열 안에 있는것도 JSON형식 이기 때문에 JSON Object 로 추출
				JSONObject newObject = (JSONObject) newApiList.get(i);

				// JSON name으로 추출
				System.out.println("test: name==>" + newObject.get("name"));
				System.out.println("test: type==>" + newObject.get("type"));

			}

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private static boolean compareJsonObject(JSONArray oldApiList, JSONArray newApiList) {
		boolean result = true;
		for (int i = 0; i < oldApiList.size(); i++) {
			//배열 안에 있는것도 JSON형식 이기 때문에 JSON Object 로 추출
			JSONObject oldObject = (JSONObject) oldApiList.get(i);
			
			 boolean hasEquals = false;
			 for (int j = 0; j < newApiList.size(); j++) {
				 JSONObject newObject = (JSONObject) newApiList.get(j);
				 String a = (String) oldObject.get("type");
				 String b = (String) newObject.get("type");
				 
				 String c = (String) oldObject.get("name");
				 String d = (String) newObject.get("name");
				 if(a.equals(b) && c.equals(d)){
					 hasEquals = true;
					 break;
				 }
				 
			}
			 if(!hasEquals){
				 result = false;
			 }
			 
		}
		return result;
	}
}
