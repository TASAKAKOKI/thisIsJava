package verify.exam04;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("È«±æµ¿", 35);
		String nameKey = "È«±æµ¿";
		Integer age = Util.getValue(pair, nameKey);
		System.out.println(nameKey + "ÀÇ ³ªÀÌ: " + age);

		ChildPair<String, Integer> childPair = new ChildPair<>("È«»ï¿ø", 20);
		String childNameKey = "È«»ï¼ø";
		Integer childAge = Util.getValue(childPair,childNameKey);
		System.out.println(childNameKey + "ÀÇ ³ªÀÌ: " + childAge);

		/*
		OtherPair<String, Integer> otherPair = new OtherPair<>("È«»ï¿ø", 20);
		String otherNameKey = "È«»ï¼ø";
		Integer otherAge = Util.getValue(otherPair,otherNameKey);
		System.out.println(otherNameKey + "ÀÇ ³ªÀÌ: " + otherAge);
		*/
	}
}