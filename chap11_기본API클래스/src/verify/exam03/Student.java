package verify.exam03;

import java.util.Objects;

//import java.util.Objects;
public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return this.studentNum;
	}
	
	//hashCode()가 같아야 equals()를 확인하고, equals()마저도 같으면 같은 객체로 판단한다.
	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
		//return studentNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			if(getStudentNum().equals(std.studentNum)) {
				return true;
			}
		}
		return false;
	}
}