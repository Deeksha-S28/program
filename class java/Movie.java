class Movie{
	
	
	public static void main(String[] args){
		
		
		String name1 = "appu";
		String name2 = "abhi";
		String name3 = "paramathma";
		String name4 = "milana";
		String name5 = "ninidale";
		String name6 = "Yajamana";
		String name7 = "Jaggu Dada";
		String name8 = "Chingari";
		String name9 = "chowka";
		String name10 = "Kranthiveera Sangoli Rayanna";
		String name11 = "Tarak";
		String name12 = "Saarathi";
		String name13 = "Navagraha";
		String name14 = "Arjun";
		String name15 = "Odeya";
		String name16 = "Devil.. The Hero";
		String name17 = "Mr.Airavata";
		String name18 = "Kalasipalya";
		String name19 = "Kariya";
		String name20= "Majestic";
		
	String[] names = {name1,name2,name3,name4,name5,name6,name7,name8,name9,name10};
	
	for(int store=0;store<names.length;store++)
	{
	String ref = names[store];
    System.out.println("The movie names are :"+ref);	
	}		
	for(int name=names.length-1;name>=0;name--){
		String ref1=names[name];
		System.out.println("names are"+ref1);
	}
	
	
	
	}
}