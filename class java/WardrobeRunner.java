class WardrobeRunner{
	public static void main(String[] args){
		System.out.println("start main in wardrobe runner");
		new Wardrobe();
		Wardrobe wardrobe=new Wardrobe();
		System.out.println("ref is :"+wardrobe);
		wardrobe.brand();
	}
}