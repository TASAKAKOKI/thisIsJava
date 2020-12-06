package sec04.exam02_parent_method_call;

public class SupersonicAirplane extends Airplane{
	//static final을 이용하여 상수를 2개 선언해 준다.
	//상수는 정적으로 선언되었으므로, 객체를 생성하기 이전에 클래스를 통해서도 접근할 수 있다.
	public static final int NORMAL = 1;
	public static final	int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		if(flymode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			//부모 클래스의 원본 .fly()를 호출해준다.
			super.fly();			
		}
	}
	
}
