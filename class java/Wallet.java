class Wallet
{
String company = "Tommy Hilfiger";
String type = "Travel wallets";
String color = "black";
byte quantity = 1;
double cost = 500;

{
	System.out.println("Start of the program");
}
public static void main (String[] args)
{
	Wallet ref = new Wallet();
	System.out.println(ref.company);
	System.out.println(ref.type);
	System.out.println(ref.color);
	System.out.println(ref.quantity);
	System.out.println(ref.cost);
	
	ref.company = "wildhorn";
	ref.type = "Mobile wallets";
	ref.color = "brown";
	ref.quantity = 5;
	ref. cost = 1000;
    System.out.println(ref.company);
	System.out.println(ref.type);
	System.out.println(ref.color);
	System.out.println(ref.quantity);
	System.out.println(ref.cost);

	ref.company = "URBAN FOREST";
	ref.type = "Checkbook Wallet";
	ref.color = "brown";
	ref.quantity = 3;
	ref. cost = 800;
    System.out.println(ref.company);
	System.out.println(ref.type);
	System.out.println(ref.color);
	System.out.println(ref.quantity);
	System.out.println(ref.cost);
	
	ref.company = "Louis Vuitton";
	ref.type = "Trifold ";
	ref.color = "black";
	ref.quantity =1;
	ref. cost = 1000;
    System.out.println(ref.company);
	System.out.println(ref.type);
	System.out.println(ref.color);
	System.out.println(ref.quantity);
	System.out.println(ref.cost);
	
	ref.company = "Montblanc";
	ref.type = "belt";
	ref.color = "brown";
	ref.quantity = 4;
	ref. cost = 500;
    System.out.println(ref.company);
	System.out.println(ref.type);
	System.out.println(ref.color);
	System.out.println(ref.quantity);
	System.out.println(ref.cost);
	
	ref.company = "DANISH REXINE";
	ref.type = "Bifold";
	ref.color = "black";
	ref.quantity = 5;
	ref. cost = 1500;
    System.out.println(ref.company);
	System.out.println(ref.type);
	System.out.println(ref.color);
	System.out.println(ref.quantity);
	System.out.println(ref.cost);
	
	ref.company = "Fastrack";
	ref.type = "cardholder";
	ref.color = "brown";
	ref.quantity = 2;
	ref. cost = 500;
    System.out.println(ref.company);
	System.out.println(ref.type);
	System.out.println(ref.color);
	System.out.println(ref.quantity);
	System.out.println(ref.cost);
}
}