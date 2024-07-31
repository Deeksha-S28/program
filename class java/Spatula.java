class Spatula{
	String color="grey";// literal non static type : ref , literal,
	int no=3;
	Spatula(){
		System.out.println("create spatula");
		
	}
	public static void main(String[] args){
		Spatula ref=new Spatula();
		System.out.println("color is :"+ref.color);
		
		System.out.println("int is :"+ref.no);
		ref.color="white";
		ref.no=1;
		System.out.println("color is :"+ref.color);
		
		System.out.println("int is :"+ref.no);
		Spatula ref1=new Spatula();
		System.out.println("color is :"+ref1.color);
		
		System.out.println("int is :"+ref1.no);
		ref1.color="orange";
		ref1.no=2;
		System.out.println("color is :"+ref1.color);
		
		System.out.println("int is :"+ref1.no);
		Spatula ref2=new Spatula();
		System.out.println("color is :"+ref2.color);
		
		System.out.println("int is :"+ref2.no);
		ref2.color="purple";
		ref2.no=1;
		System.out.println("color is :"+ref2.color);
		
		System.out.println("int is :"+ref2.no);
		
		Spatula ref3=new Spatula();
		System.out.println("color is :"+ref3.color);
		
		System.out.println("int is :"+ref3.no);
		ref3.color="brown";
		ref3.no=2;
		System.out.println("color is :"+ref3.color);
		
		System.out.println("int is :"+ref3.no);
		Spatula ref4=new Spatula();
		System.out.println("color is :"+ref4.color);
		
		System.out.println("int is :"+ref4.no);
		ref4.color="violet";
		ref4.no=6;
		System.out.println("color is :"+ref4.color);
		
		System.out.println("int is :"+ref4.no);
		Spatula ref5=new Spatula();
		System.out.println("color is :"+ref5.color);
		
		System.out.println("int is :"+ref5.no);
		ref5.color="yellow";
		ref5.no=2;
		System.out.println("color is :"+ref5.color);
		
		System.out.println("int is :"+ref5.no);
		Spatula ref6=new Spatula();
		System.out.println("color is :"+ref6.color);
		
		System.out.println("int is :"+ref6.no);
		ref6.color="silver";
		ref6.no=2;
		System.out.println("color is :"+ref6.color);
		
		System.out.println("int is :"+ref6.no);
		
		
	}
}