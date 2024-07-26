class BusNo{

public static void main(String[] args){

String no1 = "KA40 F804";
String no2 = "KA40 F906";
String no3 = "KA40 F799";
String no4 = "KA40 F803";
String no5 = "KA40 F8798";

String[] nos = {no1,no2,no3,no4,no5};

for(int name=0;name<nos.length;name++)
{
	String ref = nos[name];
	System.out.println("The bus no is given as :"+ref);
}
for(int name1=4;name1>=0;name1--)
{
	String ref1 = nos[name1];
	System.out.println("The bus no  :"+ref1);
}
}
}