package sec04_����File_�����.exam01_file;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws URISyntaxException, IOException {
		String directory = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO�����/src/sec04_����File_�����/exam01_file";
		File dir = new File(directory + "/Dir");
		File file1 = new File(directory + "/file1.txt");
		File file2 = new File(directory + "/file2.txt");
		File file3 = new File(new URI("file:///" + directory + "/file3.txt"));
			//���� �����ڷ� URI�� ����
			//URI�����ڴ� ���Ͻ�Ű��(file:/ �Ǵ� file:///�� �ʿ�� �Ѵ�.
			//local ������ �д� ��쿡�� ȣ��Ʈ�� ���� �ʾƵ� �ǹǷ�, //�� ���ش�.
		if(dir.exists() == false) { dir.mkdir(); }
		if(file1.exists() == false) { file1.createNewFile(); }
		if(file2.exists() == false) { file2.createNewFile(); }
		if(file3.exists() == false) { file3.createNewFile(); }
		
		File temp = new File("C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO�����/src/sec04_����File_�����/exam01_file");
		File[] contents = temp.listFiles();
		System.out.println("��¥          �ð�         ����    ũ��    �̸�");
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