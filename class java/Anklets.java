class Anklets{
	String color="gold";
	String design;
	int cost;
	Anklets(String designlocal){
		design=designlocal;
	}
	public static void main(String[] args){
		Anklets anklets=new Anklets("mango");
		anklets.cost=356;
		System.out.println(anklets.color);
		System.out.println(anklets.design);
		System.out.println(anklets.cost);
		
		Anklets anklets1=new Anklets("circls");
		anklets1.cost=890;
		System.out.println(anklets1.color);
		System.out.println(anklets1.design);
		System.out.println(anklets1.cost);
	}
}