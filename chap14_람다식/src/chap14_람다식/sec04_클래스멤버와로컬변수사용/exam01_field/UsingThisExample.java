package chap14_���ٽ�.sec04_Ŭ��������ͷ��ú������.exam01_field;

public class UsingThisExample {
	public static void main(String[] args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
	}
}