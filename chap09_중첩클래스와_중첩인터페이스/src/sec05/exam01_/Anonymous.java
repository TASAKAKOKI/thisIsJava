package sec05.exam01_;

public class Anonymous {
	//필드 초기값으로 익명자식객체 대입
	Person parentField = new Person() {
		/*익명객체 내의 메소드는 익명객체 실행블록안에서만 사용될 수 있다.
		work()메소드는 생성된 객체의 wake()메소드를 호출하여 그 안에서 호출된 메소드로만 호출할 수 있다.
		*/
		void work() {
			System.out.println("익명객체 필드_익명객체의 메소드호출: 출근합니다.");
		}
		@Override
		public void wake() {
			System.out.println("익명객체 필드_Person()객체의 기본메소드 호출: 8시에 일어나겠습니다..");
			work();
			System.out.println("----------------------------------");
		}
	};
	
	void method1() {
		//로컨 변수값으로 익명자식객체 대입
		Person parentLocalValue = new Person() {
			/*마찬가지로, 익명객체 내의 메소드는 지역변수로 익명객체가 대입되어도, 익명객체 실행블록 안에서만 사용, 호출 가능하다.
			*/
			void walk() {
				System.out.println("익명객체 로컬변수_익명객체의 메소드호출: 걷습니다.");
			}
			@Override
			public void wake() {
				System.out.println("익명객체 로컬변수_Person()객체의 기본메소드 호출: 6시에 일어났어요!");
				walk();
				System.out.println("----------------------------------");
			}
		};
		//로컬 변수 사용
		parentLocalValue.wake();
	}
	
	//메소드의 매개값으로 person객체를 줄 수 있는데, 이때에도 역시 익명객체를 생성하여 매개값으로 줄 수 있다.
	void method2(Person person) {
		person.wake();
	}
}