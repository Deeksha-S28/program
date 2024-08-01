class Radio{
	String brand="philips";
	String hz;
	String color;
	int cost;
	Radio(String hzlocal,String colorlocal){
		hz=hzlocal;
		color=colorlocal;
	}
	public static void main(String[] args){
		Radio radio=new Radio("50","black");
		radio.cost=345;
		System.out.println(radio.brand);
		System.out.println(radio.hz);
		System.out.println(radio.color);
		System.out.println(radio.cost);
		
		Radio radio1=new Radio("60","white");
		radio1.cost=405;
		System.out.println(radio1.brand);
		System.out.println(radio1.hz);
		System.out.println(radio1.color);
		System.out.println(radio1.cost);
	}
}