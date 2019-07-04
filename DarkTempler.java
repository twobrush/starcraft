package protoss;

//������Ʈ(��ü)�� ���¿� �ൿ�� ������.
public class DarkTempler implements Protoss {
	public DarkTempler() {
		this(100, 100, 40, 5);
	}

	// �Ű������� Ÿ���� �ٸ��ų�, ������ �ٸ��� �����ε�
	public DarkTempler(int st, int sh, int attack, int armor) {
		this.st = st;
		this.sh = sh;
		this.attack = attack;
		this.armor = armor;
		System.out.println("DarkTempler�ǿ����Ҹ��п�");
	}

	final String name = "��ũ���÷�";
	int st; // ü��
	int sh; // ���� (��ȣ��)
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
