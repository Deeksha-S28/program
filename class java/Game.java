class Game{

public static void main (String[] args){
	
	
String game1 = "Free games";
String game2 = "javelin throw";
String game3 = "Cricket";
String game4 = "Volley Ball";
String game5 = "Throw Ball";
String game6 = "Hockey";
String game7 = "Foot Ball";
String game8 = "Chess";
String game9 = "Basket Ball";
String game10 = "Running";

String[] games = {game1,game2,game3,game4,game5,game6,game7,game8,game9,game10};
for(int game=0;game<games.length;game++){
	String ref=games[game];
	System.out.println("ref is:"+ref);
}
for(int j=games.length-1;j>=0;j--){
	String read=games[j];
	System.out.println("read is:"+read);
}
}
}