package protoss;

//오브젝트(객체)는 상태와 행동을 가진다.
public class DarkTempler implements Protoss {
	public DarkTempler() {
		this(100, 100, 40, 5);
	}

	// 매개변수의 타입이 다르거나, 개수가 다르면 오버로딩
	public DarkTempler(int st, int sh, int attack, int armor) {
		this.st = st;
		this.sh = sh;
		this.attack = attack;
		this.armor = armor;
		System.out.println("DarkTempler의울음소리왈왈");
	}

	final String name = "다크템플러";
	int st; // 체력
	int sh; // 쉴드 (보호막)
	int attack;
	int armor;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSh() {
		return sh;
	}

	@Override
	public int getSt() {
		return st;
	}

	@Override
	public int getAttack() {
		return attack;
	}

	@Override
	public int getArmor() {
		return armor;
	}

	@Override
	public void setSh(int sh) {
		this.sh = sh;
	}

}
