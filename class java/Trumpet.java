class Trumpet{
	String brand="bach";
	double cost;
	int nos;
	Trumpet(double costlocal){
		cost=costlocal;
	}
	public static void main(String[] args){
		Trumpet trumpet=new Trumpet(345);
		trumpet.nos=2;
		System.out.println("brand"+trumpet.brand);
		System.out.println("cost"+trumpet.cost);
		System.out.println("no"+trumpet.nos);
		
		Trumpet trumpet2=new Trumpet(5789);
		trumpet2.nos=5;
		System.out.println("brand"+trumpet2.brand);
		System.out.println("cost"+trumpet2.cost);
		System.out.println("no"+trumpet2.nos);
	}
}