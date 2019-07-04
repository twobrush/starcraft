package protoss;

public class protossApp {

//	
//	//누가 누구를
//	public static void attack(Zealot u1,Dragoon u2){
//		//질럿 공격력: 20
//		//드라군 방어력 : 1
//		int damage = u1.attack - u2.armor;//19
//		u2.sh = u2.sh - damage;
//		
//	}
//	public static void attack(Dragoon u2 , Zealot u1){
//		//질럿 공격력:20
//		//드라군 방어력 : 1
//		int damage = u1.attack - u2.armor;//19
//		u2.sh = u2.sh - damage;
//		
//	}
	
	public static void attack(Protoss u1,Protoss u2){
		//질럿 공격력: 16
		//드라군 방어력 : 1
		int damage = u1.getAttack() - u2.getArmor();//15
		u2.setSh(u2.getSh() - damage);
		
	}
	public static void printUnit(Protoss u){
		System.out.println(u.getName()+"의 쉴드는"+u.getSh());
	}
//	public static void printUnit(Zealot d2){
//		System.out.println("질럿의 쉴드은"+d2.sh);
//	}
	
	public static void main(String[] args) {
		
		
		gateway gate1 = new gateway();
		Zealot z1 = gate1.makeZealot();//질럿 생성
		Zealot z2 = gate1.makeZealot();//질럿 생성
		
		Dragoon d1 = gate1.makeDragoon(); //드라군 생성
		Dragoon d2 = gate1.makeDragoon();//드라군 생성
		
		DarkTempler dar1 = gate1.makeDarkTempler();
		
		protossApp.attack(z1, d1);
		protossApp.printUnit(d1);
		
		
		protossApp.attack(d1, z1);
		protossApp.printUnit(z1);
	
		protossApp.attack(z1, z2);
		protossApp.printUnit(z2);
		
		protossApp.attack(z2, dar1);
		protossApp.printUnit(dar1);
	}

}
