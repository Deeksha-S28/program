class Strainer{
	String type="Steel";
	String color;
	int size;
	Strainer(int sizelocal){
		size=sizelocal;
	}
	public static void main(String[] args){
		Strainer strainer=new Strainer(3);
		strainer.color="pink";
		System.out.println(strainer.type);
		System.out.println(strainer.color);
		System.out.println(strainer.size);
		
		Strainer strainer2=new Strainer(8);
		strainer2.color="violet";
		System.out.println(strainer2.type);
		System.out.println(strainer2.color);
		System.out.println(strainer2.size);
	}
}