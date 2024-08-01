class Mask{
	String type="Cotton";
	String color;
	int price;
	Mask(String colorloacl ){
		color=colorloacl;
	}
	public static void main(String[] args){
		Mask mask=new Mask("golden");
		mask.price=89;
		System.out.println(mask.type);
		System.out.println(mask.color);
		System.out.println(mask.price);
		
		Mask mask1=new Mask("silver");
		mask1.price=789;
		System.out.println(mask1.type);
		System.out.println(mask1.color);
		System.out.println(mask1.price);
	}
}