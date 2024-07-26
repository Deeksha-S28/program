class Song{


public static void main(String[] args){

String song1 = "Yava Janumada Gelathi";
String song2 = "Pasandaagavne";
String song3 = "Punyathma";
String song4 = "Telephone Gelathi";
String song5 = "Anuraagava Kalisalu";
String song6 = "Ninnaane Ninnaane";
String song7 = "Dhool maga Dhool";
String song8 = "Nanna Chanchale";
String song9 = "Dhava Dhava";
String song10 = "Sona Sona";

String[] songs={song1,song2,song3,song4,song5,song6,song7,song8,song9,song10};
String ref=songs[0];
System.out.println("ref is "+ref);
for(int i=0;i<songs.length;i++){
	String reff=songs[i];
	System.out.println("reff is:"+reff);
}
for(int j=songs.length-1;j>=0;j--){
	String re=songs[j];
	System.out.println("re :"+re);
}

}
}
