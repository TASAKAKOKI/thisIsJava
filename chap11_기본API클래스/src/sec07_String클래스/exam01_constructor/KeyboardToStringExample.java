package sec07_String클래스.exam01_constructor;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100]; //크기가 100인 byte배열 생성
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes); //키보드로 입력한 값을 byte배열인 bytes에 저장
		
		String str = new String(bytes, 0, readByteNo-2);//배열에 저장된 값을 처음부터 입력된 문자열의 길이만큼 String에 문자열로 저장
		System.out.println(str);
	}
}