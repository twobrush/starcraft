package protoss;
class Earth{
//	String check = "�ְ�θ�";
	String name = "����";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Asia extends Earth{ //���
	String name = "�ƽþ�";
	public String getName() {
		return name;
	}
}

class Korea extends Asia{//���
	String name = "�ѱ�";
}
class Daejeon extends Korea{//���
	String name = "����";
	public String getName() {
		return name;
	}
}

public class BindApp {
	public static void main(String[] args) {
		Earth d = new Korea();
		System.out.println(d.getName());
//	System.out.println(d.name);
//	System.out.println(d.check);
	}
	
	

}
