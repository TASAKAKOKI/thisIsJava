package verify.exam04;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("ȫ�浿", 35);
		String nameKey = "ȫ�浿";
		Integer age = Util.getValue(pair, nameKey);
		System.out.println(nameKey + "�� ����: " + age);

		ChildPair<String, Integer> childPair = new ChildPair<>("ȫ���", 20);
		String childNameKey = "ȫ���";
		Integer childAge = Util.getValue(childPair,childNameKey);
		System.out.println(childNameKey + "�� ����: " + childAge);

		/*
		OtherPair<String, Integer> otherPair = new OtherPair<>("ȫ���", 20);
		String otherNameKey = "ȫ���";
		Integer otherAge = Util.getValue(otherPair,otherNameKey);
		System.out.println(otherNameKey + "�� ����: " + otherAge);
		*/
	}
}