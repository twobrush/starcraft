package protoss;

interface Animal {
	public abstract void sound();
	//public abstract 는 기본이라 생략가능
}

class Tiger implements Animal{

	@Override
	public void sound() {
		System.out.println("어흥");
		
	}
	
}

class Dog implements Animal {
	// 부모가 가진 함수를 재정의 하는 것을 오버라이딩이라고함.
	// 부모가 가진 함수를 재정의 하지 않아도 오버라이딩!!!걍부모꺼쓰면오버라이딩
	public void sound() {
		System.out.println("왈왈");
	}

}

class Cat implements Animal {
	public void sound() {
		System.out.println("냥냥");
	}

}

class Fish implements Animal {
	public void sound() {
		System.out.println("뻐끔뻐끔");
	}
}

public class BindApp2 {

	public static void start(Animal a) {
		a.sound();
	}

	public static void main(String[] args) {
		// Animal f = new Fish();
		// f.sound();
		//
		// Animal c = new Cat();
		// c.sound();
		//
		// Animal d = new Dog();
		// d.sound();

		start(new Fish());
		start(new Cat());
		start(new Dog());
		start(new Tiger());
	}

}
