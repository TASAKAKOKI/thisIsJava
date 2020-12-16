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
	
	//hashCode()�� ���ƾ� equals()�� Ȯ���ϰ�, equals()������ ������ ���� ��ü�� �Ǵ��Ѵ�.
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