package daiochan;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Diaochan xiaoniao = new Diaochan("female", 1.6,"lianhua","sliver", 1000.0, 1000.0, 2000,50);
		
		xiaoniao.sayHello(); 
		System.out.println("My skill one is" + xiaoniao.skillone());
		System.out.println("我的技能two"+xiaoniao.skilltwo());
		System.out.println("我的技能三"+ xiaoniao.skillthree());
		xiaoniao.printXuetiao();
		xiaoniao.minusXuetiao(100);
		xiaoniao.printXuetiao();
		xiaoniao.minusXuetiao(2000);
		
		Diaochan xiaoniaotwo = new Diaochan("female", 1.6,"lianhua","sliver", 9000.0, 18000.0, 2000,500);
		System.out.println("小鸟二号的血量是");
		xiaoniaotwo.printXuetiao();
		
		Diaochan suinibian = new Diaochan("Male", 2.9, "lianhua","sliver", 9000.0, 10.0, 20,500);
		System.out.println("随你变的血量是");
		suinibian.printXuetiao();
		
	}

}
