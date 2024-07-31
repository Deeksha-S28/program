class Injection{
	String name;
	int size;
	boolean check;
	Injection(){
		System.out.println("created injection");
	}
	public static void main(String[] values){
		Injection inject=new Injection();
		inject.name="Atropine";
		inject.size=2;
		inject.check=true;
		System.out.println("name is :"+inject.name);
		System.out.println("size is :"+inject.size);
		System.out.println("check is :"+inject.check);
		Injection inject1=new Injection();
		inject1.name="artesunate";
		inject1.size=1;
		inject1.check=true;
		System.out.println("name is :"+inject1.name);
		System.out.println("size is :"+inject1.size);
		System.out.println("check is :"+inject1.check);
		Injection inject2=new Injection();
		inject2.name="acetaminopen";
		inject2.size=3;
		inject2.check=false;
		System.out.println("name is :"+inject2.name);
		System.out.println("size is :"+inject2.size);
		System.out.println("check is :"+inject2.check);
		Injection inject3=new Injection();
		inject3.name="adrenaline";
		inject3.size=1;
		inject3.check=true;
		System.out.println("name is :"+inject3.name);
		System.out.println("size is :"+inject3.size);
		System.out.println("check is :"+inject3.check);
		Injection inject4=new Injection();
		inject4.name="acetaminopen2";
		inject4.size=3;
		inject4.check=true;
		System.out.println("name is :"+inject4.name);
		System.out.println("size is :"+inject4.size);
		System.out.println("check is :"+inject4.check);
		Injection inject5=new Injection();
		inject5.name="ampicillin";
		inject5.size=1;
		inject5.check=false;
		System.out.println("name is :"+inject5.name);
		System.out.println("size is :"+inject5.size);
		System.out.println("check is :"+inject5.check);
		Injection inject6=new Injection();
		inject6.name="amoxiclav";
		inject6.size=2;
		inject6.check=true;
		System.out.println("name is :"+inject6.name);
		System.out.println("size is :"+inject6.size);
		System.out.println("check is :"+inject6.check);
		
		
	}
}