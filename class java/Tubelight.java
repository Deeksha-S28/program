class Tubelight{
	int watt;
	String type;
	int volt;
	Tubelight(){
		System.out.println("created tublelight");
		
	}
	public static void main( String[] args){
		Tubelight ref=new Tubelight();
		ref.watt=35;
		ref.type="uv";
		ref.volt=2;
		System.out.println("watt :"+ref.watt);
		System.out.println("tyoe :"+ref.type);
		System.out.println("voltage :"+ref.volt);
		Tubelight ref1=new Tubelight();
		ref1.watt=38;
		ref1.type="led";
		ref1.volt=5;
		System.out.println("watt :"+ref1.watt);
		System.out.println("tyoe :"+ref1.type);
		System.out.println("voltage :"+ref1.volt);
		Tubelight ref2=new Tubelight();
		ref2.watt=3;
		ref2.type="flouresecnt";
		ref2.volt=7;
		System.out.println("watt :"+ref2.watt);
		System.out.println("tyoe :"+ref2.type);
		System.out.println("voltage :"+ref2.volt);
		Tubelight ref3=new Tubelight();
		ref3.watt=3;
		ref3.type="led bulb";
		ref3.volt=7;
		System.out.println("watt :"+ref3.watt);
		System.out.println("tyoe :"+ref3.type);
		System.out.println("voltage :"+ref3.volt);
		Tubelight ref4=new Tubelight();
		ref4.watt=3;
		ref4.type="replacement light";
		ref4.volt=8;
		System.out.println("watt :"+ref4.watt);
		System.out.println("tyoe :"+ref4.type);
		System.out.println("voltage :"+ref4.volt);
	}
}