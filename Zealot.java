package protoss;

//������Ʈ(��ü)�� ���¿� �ൿ�� ������.
public class Zealot {
public Zealot() {
this(100,100,20,1);
}
//�Ű������� Ÿ���� �ٸ��ų�, ������ �ٸ��� �����ε�
public Zealot(int st, int sh, int attack, int armor) {
	this.st = st;
	this.sh = sh;
	this.attack = attack;
	this.armor = armor;
	System.out.println("I had returned");
}

final String name = "���";
int st; //ü��
int sh; //���� (��ȣ��)
int attack;
int armor;
	
}
