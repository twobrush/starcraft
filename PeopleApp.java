package protoss;

interface people {
	// String name ="���";�ǹ�x �������������� get �Լ� �����
	String getName();
//	people �������̽��� �����ϸ� getName()�� �������̵��ؾ��մϴ�. ��� ����� ������ �������ϱ�!
	
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
		// �������ε�
		System.out.println(p.getName());
	}

	public static void main(String[] args) {
		start(new two());
		start(new one());
	}
}
