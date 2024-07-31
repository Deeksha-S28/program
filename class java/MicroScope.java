class MicroScope{

String company;
String name;
double cost;
byte quantity;
String range;
{
	System.out.println("Start of the program");
}
public static void main(String[] args)
{
	MicroScope ref = new MicroScope();
	System.out.println(ref.company);
	System.out.println(ref.name);
	System.out.println(ref.cost);
	System.out.println(ref.quantity);
	System.out.println(ref.range);

	ref.company = "Carl Zeiss AG";
	ref.name = "simple";
	ref.cost = 10000;
	ref.quantity = 2;
	ref.range = "10x";
	System.out.println(ref.company);
	System.out.println(ref.name);
	System.out.println(ref.cost);
	System.out.println(ref.quantity);
	System.out.println(ref.range);
	
	ref.company = "Leica Microsystems";
	ref.name = "compond";
	ref.cost = 15000;
	ref.quantity = 3;
	ref.range = "20x";
	System.out.println(ref.company);
	System.out.println(ref.name);
	System.out.println(ref.cost);
	System.out.println(ref.quantity);
	System.out.println(ref.range);
		
	ref.company = "Nikon Instruments, Inc.";
	ref.name = "electron";
	ref.cost = 5000;
	ref.quantity = 4;
	ref.range = "40x";
	System.out.println(ref.company);
	System.out.println(ref.name);
	System.out.println(ref.cost);
	System.out.println(ref.quantity);
	System.out.println(ref.range);
		
	ref.company = "Labomed";
	ref.name = "Stereo";
	ref.cost = 20000;
	ref.quantity = 5;
	ref.range = "60x";
	System.out.println(ref.company);
	System.out.println(ref.name);
	System.out.println(ref.cost);
	System.out.println(ref.quantity);
	System.out.println(ref.range);
		
	ref.company = "Olympus";
	ref.name = "Scanning probe";
	ref.cost = 30000;
	ref.quantity = 6;
	ref.range = "80x";
	System.out.println(ref.company);
	System.out.println(ref.name);
	System.out.println(ref.cost);
	System.out.println(ref.quantity);
	System.out.println(ref.range);
	
	ref.company = "JB Microscope";
	ref.name = "Phase-Contrast";
	ref.cost = 50000;
	ref.quantity = 7;
	ref.range = "100x";
	System.out.println(ref.company);
	System.out.println(ref.name);
	System.out.println(ref.cost);
	System.out.println(ref.quantity);
	System.out.println(ref.range);
}
}