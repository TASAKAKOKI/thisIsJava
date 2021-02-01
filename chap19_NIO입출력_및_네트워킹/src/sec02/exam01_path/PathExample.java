package sec02.exam01_path;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class PathExample {
	public static void main(String[] args) {
		Path path = Paths.get("src/sec02/exam01_path/PathExample.java");
		System.out.println("[파일명] " + path.getFileName());
		System.out.println("[부모 디렉토리 명] " + path.getParent().getFileName());	
		System.out.println("[루트 디렉토리 명] " + path.getRoot());
		System.out.println("[중첩 경로 수] " + path.getNameCount());
		System.out.println();
		
		System.out.println("[파일의 이름을 getName(int index)를 이용해 얻기]");
		for(int i=0; i<path.getNameCount(); i++) {
			System.out.println("\tpath.getName(" + i + "): " + path.getName(i));
		}
		System.out.println();

		System.out.println("[파일의 이름을 Iterator를 이용해 얻기]");
		Iterator<Path> iterator = path.iterator();
		while(iterator.hasNext()) {
			Path temp = iterator.next();
			System.out.println("\t[temp]: " + temp.getFileName());
		}
	}
}