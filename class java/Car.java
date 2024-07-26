class Car{

public static void main(String[] args){
	
	
	String car1 = "bugati";
	String car2 = "breeza";
	String car3 = "glanza";
	String car4 = "i20";
	String car5 = "benz";
	String car6 = "audi";
	String car7 = "tata harrier";
	String car8 = "kia";
	String car9 = "thar";
	String car10 = "scorpio";
	String car11 = "volkswagen";
	String car12 = "ford";
	String car13 = "toyota";
	String car14 = "honda";
	String car15 = "mitsubishi";
	
	String[] cars = {car1,car2,car3,car4,car5,car6,car7,car8,car9,car10};
	
	for(int start=0;start<cars.length;start++)
	{
		String ref = cars[start];
		System.out.println("the car name is :"+ref);
	}
	for(int i=9;i>=0;i--){
		String tell=cars[i];
		System.out.println("car is"+tell);
	}
	
}
}