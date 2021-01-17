package sec04_파일File_입출력.exam01_file;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws URISyntaxException, IOException {
		String directory = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO입출력/src/sec04_파일File_입출력/exam01_file";
		File dir = new File(directory + "/Dir");
		File file1 = new File(directory + "/file1.txt");
		File file2 = new File(directory + "/file2.txt");
		File file3 = new File(new URI("file:///" + directory + "/file3.txt"));
			//파일 생성자로 URI를 전달
			//URI생성자는 파일스키마(file:/ 또는 file:///를 필요로 한다.
			//local 파일을 읽는 경우에는 호스트가 오지 않아도 되므로, //를 해준다.
		if(dir.exists() == false) { dir.mkdir(); }
		if(file1.exists() == false) { file1.createNewFile(); }
		if(file2.exists() == false) { file2.createNewFile(); }
		if(file3.exists() == false) { file3.createNewFile(); }
		
		File temp = new File("C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO입출력/src/sec04_파일File_입출력/exam01_file");
		File[] contents = temp.listFiles();
		System.out.println("날짜          시간         형태    크기    이름");
		System.out.println("===============================================");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.print( sdf.format( new Date( file.lastModified() ) ) );
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t" + file.getName());
			} else {
				System.out.print("\t<File>\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}
}