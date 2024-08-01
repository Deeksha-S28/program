class Cable{
	String type="single core";
	String brand;
	double size;
	int nos;
	Cable(String brandlocal, double sizelocal){
		brand=brandlocal;
		size=sizelocal;
	}
	public static void main(String[] args){
		Cable cable=new Cable("Havells",3);
		cable.nos=4;
		System.out.println(cable.type);
		
		System.out.println(cable.brand);
		
		System.out.println(cable.size);
		System.out.println(cable.nos);
		
		Cable cable1=new Cable("vguard",4);
		cable1.nos=6;
		System.out.println(cable1.type);
		
		System.out.println(cable1.brand);
		
		System.out.println(cable1.size);
		System.out.println(cable1.nos);
	}
}