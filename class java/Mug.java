class Mug{
	String color="yellow";
	String design;
	int cost;
	Mug(String designlocal){
		design=designlocal;
	}
	public static void main(String[] args){
		Mug mug=new Mug("printed");
		mug.cost=525;
		System.out.println(mug.color);
		System.out.println(mug.design);
		System.out.println(mug.cost);
		
		Mug mug1=new Mug("dotted");
		mug1.cost=98;
		System.out.println(mug1.color);
		System.out.println(mug1.design);
		System.out.println(mug1.cost);
	}
}