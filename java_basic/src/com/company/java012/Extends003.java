package com.company.java012;

class MobileNote7 extends Object{
	String iris;
	public String getIris() { return iris; }
	public void setIris(String iris) { this.iris = iris; }
	public MobileNote7() { super();  }
}

class MobileNote8 extends MobileNote7{
	String face;
	public String getFace() { return face; }
	public void setFace(String face) { this.face = face; }
	public MobileNote8() { super();  }
}

class MobileNote9 extends MobileNote8{
	int battery;
	public int getBattery() { return battery; }
	public void setBattery(int battery) { this.battery = battery; }
	public MobileNote9() { super();  }
	
	
	public void iris(String string) {  }
	
	public void newShow() {
		System.out.print(":::: NOTE7새로운기능(Overriding)\r\n"
				+ "= iris 홍채인식기능!\r\n"
				+ "= myiris : " + iris + "\r\n"
				+ ":::: NOTE8새로운기능(Overriding)\r\n"
				+ "= face 안면인식기능!\r\n"
				+ "= face : " + face + "\r\n"
				+":::: NOTE9새로운기능(Overriding) 추가\r\n"
				+ "= battery 하루종일 사용가능!\r\n"
				+ "= battery : " + battery);
	}
}

public class Extends003 {
	public static void main(String[] args) {
		MobileNote9 my9 = new MobileNote9();
		my9.setIris("brown");
		my9.setFace("pretty");
		my9.setBattery(24);
		my9.newShow();
	}

}
