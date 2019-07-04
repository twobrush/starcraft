package protoss;

interface people {
	// String name ="사람";의미x 변수접근을위해 get 함수 써야함
	String getName();
//	people 인터페이스를 구현하면 getName()을 오버라이딩해야합니다. 라고 안적어도 어차피 오류나니까!
	
}

class one implements people {
	String name = "one";

	@Override
	public String getName() {
		return name;
	}
}

class two implements people {
	String name = "two";

	@Override
	public String getName() {
		return name;
	}
}

public class PeopleApp {
	static void start(people p) {
		// 동적바인딩
		System.out.println(p.getName());
	}

	public static void main(String[] args) {
		start(new two());
		start(new one());
	}
}
