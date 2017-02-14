package dailyLife.filecompare;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileCompare {
	public static void main(String[] args) {
		//비교 대상 파일 경로
		String sourcePath = "C:\\FileCompare\\source.txt";
		String targetPath = "C:\\FileCompare\\target.txt";
		File source = new File(sourcePath);
		File target = new File(targetPath);
		
		if(compare(source, target)){
			System.out.println("파일 내용이 같습니다.");
		}else{
			System.out.println("파일 내용이 서로 다릅니다.");
		}
	}
	

	/**
	 * 두 개의 파일을 비교하는 함수
	 * @param source
	 * @param target
	 * @return
	 */
	public static boolean compare(File source, File target) {
        boolean result = true;
        
        InputStream sourceFIS= null;
        InputStream targetFIS = null;
        int sourceByte;
        int targetByte;

        try {
        	sourceFIS = new FileInputStream(source);        	
            targetFIS = new FileInputStream(target);
            // ASCII 값 비교        
            while (((sourceByte = sourceFIS.read()) != -1) && ((targetByte = targetFIS.read()) != -1)) {
                if (sourceByte != targetByte) {
                    result = false;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            result = false;
        }finally{
            try {
                sourceFIS.close();
                targetFIS.close();                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}
