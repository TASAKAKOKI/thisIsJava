package sec05_���ѵ�Ÿ���Ķ����.exam01_boundedTypeParameter;

public class Util {
	/*Util Ŭ������ compare()��� �ϴ� ���� �޼ҵ带 ���µ�,
	 * �� �޼ҵ�� ����(static)�޼ҵ��̰�,
	 * NumberŸ�� Ȥ�� ���� Ÿ���� ����Ŭ���� Ÿ������ ���ѵ� �Ķ���� Ÿ���� ������,
	 * �Ű������δ� NumberŸ�� Ȥ�� ���� Ÿ���� ����Ŭ���� Ÿ���� �ΰ� �־�����,
	 * ���ϰ����δ� int�� ��ȯ�ϴ� �޼ҵ��̴�.*/
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();//Number.doubleValue(): returns the value of the specified number as a double
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}