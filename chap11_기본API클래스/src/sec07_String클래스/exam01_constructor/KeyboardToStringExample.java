package sec07_StringŬ����.exam01_constructor;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100]; //ũ�Ⱑ 100�� byte�迭 ����
		
		System.out.print("�Է�: ");
		int readByteNo = System.in.read(bytes); //Ű����� �Է��� ���� byte�迭�� bytes�� ����
		
		String str = new String(bytes, 0, readByteNo-2);//�迭�� ����� ���� ó������ �Էµ� ���ڿ��� ���̸�ŭ String�� ���ڿ��� ����
		System.out.println(str);
	}
}