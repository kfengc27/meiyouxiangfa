package daiochan;

public class Diaochan {
	
	private String sex;
	private double high;
	private String wuqi; 
	private String color_of_cloth;
	private double blood; 
	private double blue; 
	private double xuetiao;
	private double shanghai_value;
	

	public Diaochan(String sex, double high, String wuqi, String color_of_cloth, double blood, double blue, double xuetiao, double shanghai_value){
		this.sex = sex; 
		this.high = high;
		this.wuqi = wuqi;
		this.color_of_cloth = color_of_cloth;
		this.blood = blood;
		this.blue = blue;
		this.xuetiao = xuetiao;
		this.shanghai_value = shanghai_value; 
	}
	
	
	public String skillone() {
		
		return "Fang lianhua";
	}
	
	
	public String skilltwo() {
		return "Shanxian";
	}
	
	public String skillthree() {
		
		return "fang yuanquan";
	}
	
	public void addBlue(float bluebuff) {
		blue = blue + bluebuff;
	}
		
	public void setShanghai(float red) {
		this.xuetiao = red;
	}
	
	public double getXuetiao() {
		return this.xuetiao;
	}
	
	
	public void minusXuetiao(float shanghai) {
		this.xuetiao = this.xuetiao - shanghai;
		if(this.xuetiao <= 0) {
			System.out.println("吕布我要死了, 救我！！！");
		} 
	}
	
	public void sayHello() {
		System.out.println("Hello, I am Daqiao! Nice to see you.");
	}
	
	public void printXuetiao() {
		System.out.println("我的血条是"+this.xuetiao);
	}
}
