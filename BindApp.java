package protoss;
class Earth{
//	String check = "최고부모";
	String name = "지구";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Asia extends Earth{ //상속
	String name = "아시아";
	public String getName() {
		return name;
	}
}

class Korea extends Asia{//상속
	String name = "한국";
}
class Daejeon extends Korea{//상속
	String name = "대전";
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
