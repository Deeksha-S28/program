class Snack{

public static void main(String[] args){
	
String snack1 = "kitkat";
String snack2 = "lays";
String snack3 = "cake";
String snack4 = "choclet";
String snack5 = "ice-cream";
String snack6 = "lolipop";
String snack7 = "pizza";
String snack8 = "burger";
String snack9 = "sandwitch";
String snack10 = "peanut";
String snack11 = "vada pav";
String snack12 = "pakora";
String snack13 = "dhokla";
String snack14 = "samosa";
String snack15 = "chaat";
String snack16 = "poha";
String snack17 = "kachori";
String snack18 = "smoothie";
String snack19 = "edamame";
String snack20= "banana chips";
String snack21 = "cottage cheese and fruits";
String snack22 = "aloo chaat";
String snack23= "dried fruit";
String snack24= "trail mix";
String snack25= "homemade cheese crackers";
 
 String[] snacks={snack1,snack2,snack3,snack4,snack5,snack6,snack7,snack8,snack9,snack10,snack12,snack13,snack14,snack15};
 for(int snack=0;snack<snacks.length;snack++){
	 String ref=snacks[snack];
	 System.out.println("ref "+ref);
 }
 for(int i=snacks.length-1;i>=0;i--){
	 String ref1=snacks[i];
	 System.out.println("snacks is:"+ref1);
 }
}
}