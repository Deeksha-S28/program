class Watch{
	String brand="titan";//literal
	double cost;//constructor
	String color;//constructor
	int nos;//ref
	public Watch(String colorlocal, double costlocal){// a class can have any no of constructor
		color=colorlocal;
		cost=costlocal;
		System.out.println("created watch");
		
	}
	Watch(String colorlocal){
		color=colorlocal;
	}
}