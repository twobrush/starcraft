package protoss;

//������Ʈ(��ü)�� ���¿� �ൿ�� ������.
public class Dragoon  implements Protoss  {
public Dragoon() {
this(100,100,16,1);
}
//�Ű������� Ÿ���� �ٸ��ų�, ������ �ٸ��� �����ε�
public Dragoon(int st, int sh, int attack, int armor) {
	this.st = st;
	this.sh = sh;
	this.attack = attack;
	this.armor = armor;
	System.out.println("My Life Aior");
}





final String name = "����";
int st; //ü��
int sh; //���� (��ȣ��)
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
