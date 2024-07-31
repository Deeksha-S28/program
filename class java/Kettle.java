class Kettle{

String company;
double cost;
String color;
double capacity;
String uses;
{
	System.out.println("start of the program");
}
public static void main(String[] args)
{
	Kettle ref = new Kettle();
	System.out.println(ref.company);
	System.out.println(ref.cost);
	System.out.println(ref.color);
	System.out.println(ref.capacity);
	System.out.println(ref.uses);

	ref.company = "Pigeon";
	ref.cost = 500;
	ref.color = "silver";
	ref.capacity = 0.3;
	ref.uses = "make coffee";
	System.out.println(ref.company);
	System.out.println(ref.cost);
	System.out.println(ref.color);
	System.out.println(ref.capacity);
	System.out.println(ref.uses);
	
	ref.company = "Wonderchef";
	ref.cost = 300;
	ref.color = "black";
	ref.capacity = 0.4;
	ref.uses = "make tea";
	System.out.println(ref.company);
	System.out.println(ref.cost);
	System.out.println(ref.color);
	System.out.println(ref.capacity);
	System.out.println(ref.uses);
	
	ref.company = "KitchenAid";
	ref.cost = 800;
	ref.color = "red";
	ref.capacity = 0.8;
	ref.uses = "hot water";
	System.out.println(ref.company);
	System.out.println(ref.cost);
	System.out.println(ref.color);
	System.out.println(ref.capacity);
	System.out.println(ref.uses);
	
	ref.company = "Prestige";
	ref.cost = 700;
	ref.color = "red";
	ref.capacity = 1;
	ref.uses = "warm drink";
	System.out.println(ref.company);
	System.out.println(ref.cost);
	System.out.println(ref.color);
	System.out.println(ref.capacity);
	System.out.println(ref.uses);
	
	ref.company = "Milton";
	ref.cost = 1200;
	ref.color = "pink";
	ref.capacity = 0.6;
	ref.uses = "make maggie";
	System.out.println(ref.company);
	System.out.println(ref.cost);
	System.out.println(ref.color);
	System.out.println(ref.capacity);
	System.out.println(ref.uses);
	
	ref.company = "Havells";
	ref.cost = 900;
	ref.color = "blue";
	ref.capacity = 0.5;
	ref.uses = "make chicken";
	System.out.println(ref.company);
	System.out.println(ref.cost);
	System.out.println(ref.color);
	System.out.println(ref.capacity);
	System.out.println(ref.uses);
}

}