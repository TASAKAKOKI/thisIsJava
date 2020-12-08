package sec03.exam04_outterClass_ref;

public class Outter {
	String field = "Outter-field";
	void method() {System.out.println("Outter-method");}
	
	class Nested {
		String field = "Nested-field";
		void method() {System.out.println("Nested-method");}

		void print() {
			System.out.println("field: " + field);
			System.out.println("this.field: " + this.field);
			System.out.print("method(): ");
			method();
			System.out.print("this.method(): ");
			this.method();
			System.out.println("---------");
			System.out.println("Outter.this.field: " + Outter.this.field);
			System.out.print("Outter.this.method(): ");
			Outter.this.method();
		}
	}
}