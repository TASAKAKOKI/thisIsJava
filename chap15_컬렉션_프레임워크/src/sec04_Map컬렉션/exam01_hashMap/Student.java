package sec04_MapÄÃ·º¼Ç.exam01_hashMap;

import java.util.Objects;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return sno == student.sno && name.equals(student.name);
		}
		return false;
	}

	@Override
	public int hashCode() {
//		return sno + name.hashCode();
		return Objects.hash(sno,name);
	}
}