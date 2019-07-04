package protoss;

interface Animal {
	public abstract void sound();
	//public abstract �� �⺻�̶� ��������
}

class Tiger implements Animal{

	@Override
	public void sound() {
		System.out.println("����");
		
	}
	
}

class Dog implements Animal {
	// �θ� ���� �Լ��� ������ �ϴ� ���� �������̵��̶����.
	// �θ� ���� �Լ��� ������ ���� �ʾƵ� �������̵�!!!���θ𲨾���������̵�
	public void sound() {
		System.out.println("�п�");
	}

}

class Cat implements Animal {
	public void sound() {
		System.out.println("�ɳ�");
	}

}

class Fish implements Animal {
	public void sound() {
		System.out.println("��������");
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
