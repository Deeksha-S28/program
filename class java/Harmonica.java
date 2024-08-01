class Harmonica {
	String brand="Hohner";
	String color;
	int nos;
	public Harmonica(String colorlocal){
		color=colorlocal;
	}
	public static void main(String[] args){
		Harmonica harmonica=new Harmonica("white");
		harmonica.nos=3;
		System.out.println(harmonica.brand);
		System.out.println(harmonica.color);
		System.out.println(harmonica.nos);
		
		Harmonica harmonica2=new Harmonica("orangr");
		harmonica2.nos=9;
		System.out.println(harmonica2.brand);
		System.out.println(harmonica2.color);
		System.out.println(harmonica2.nos);
	}
	
}