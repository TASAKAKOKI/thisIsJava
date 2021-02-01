package sec02.exam01_path;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class PathExample {
	public static void main(String[] args) {
		Path path = Paths.get("src/sec02/exam01_path/PathExample.java");
		System.out.println("[���ϸ�] " + path.getFileName());
		System.out.println("[�θ� ���丮 ��] " + path.getParent().getFileName());	
		System.out.println("[��Ʈ ���丮 ��] " + path.getRoot());
		System.out.println("[��ø ��� ��] " + path.getNameCount());
		System.out.println();
		
		System.out.println("[������ �̸��� getName(int index)�� �̿��� ���]");
		for(int i=0; i<path.getNameCount(); i++) {
			System.out.println("\tpath.getName(" + i + "): " + path.getName(i));
		}
		System.out.println();

		System.out.println("[������ �̸��� Iterator�� �̿��� ���]");
		Iterator<Path> iterator = path.iterator();
		while(iterator.hasNext()) {
			Path temp = iterator.next();
			System.out.println("\t[temp]: " + temp.getFileName());
		}
	}
}