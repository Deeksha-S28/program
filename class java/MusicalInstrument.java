class MusicalInstrument{
	String name; // instance variable non sttatic variable
	String brand;
	double cost;
	int noofinst;
	boolean check;
	public MusicalInstrument(){//explicit constructor
		System.out.println("created instrument ");
	}
	public static void main(String[] args){
		MusicalInstrument musicalInstrument=new MusicalInstrument();// created a copy of musicalim=nstrument and stored 
		System.out.println("instrument is:" +musicalInstrument.name);// default null default of primitive is 0 and non primitive is null
		System.out.println("brand  is:" +musicalInstrument.brand);// default null
		System.out.println("cost is:" +musicalInstrument.cost);// default 0
		System.out.println("no  is:" +musicalInstrument.noofinst);// default 0
		System.out.println("check is:" +musicalInstrument.check);// default false
		System.out.println("--------------------------------------------");
		musicalInstrument.name="piano";
		musicalInstrument.brand="Fazioli";
		musicalInstrument.cost=2345;
		musicalInstrument.noofinst=5;
		musicalInstrument.check=true;
		System.out.println("instrument is:" +musicalInstrument.name);
		System.out.println("brand  is:" +musicalInstrument.brand);
		System.out.println("cost is:" +musicalInstrument.cost);
		System.out.println("no  is:" +musicalInstrument.noofinst);
		System.out.println("check is:" +musicalInstrument.check);
		System.out.println("--------------------------------------------");
		MusicalInstrument ref=new MusicalInstrument();
		ref.name="guitar";
		ref.cost=1245;
		ref.noofinst=3;
		ref.check=true;
		System.out.println("instrument is:" +ref.name);
		System.out.println("cost is:" +ref.cost);
		System.out.println("no is:" +ref.noofinst);
		System.out.println("check is:" +ref.check);
	    System.out.println("------------------------------------------");
	    MusicalInstrument ref1=new 	MusicalInstrument();  
		ref1.name="flute";
		ref1.cost=456;
		ref1.noofinst=1;
		ref1.check=true;
		System.out.println("instrument is:" +ref1.name);
		System.out.println("cost is:" +ref1.cost);
		System.out.println("no is:" +ref1.noofinst);
		System.out.println("check is:" +ref1.check);
		System.out.println("------------------------------------------");
		MusicalInstrument ref2=new 	MusicalInstrument();  
		ref2.name="keyboard";
		ref2.cost=3456;
		ref2.noofinst=1;
		ref2.check=false;
		System.out.println("instrument is:" +ref2.name);
		System.out.println("cost is:" +ref2.cost);
		System.out.println("no is:" +ref2.noofinst);
		System.out.println("check is:" +ref2.check);
		System.out.println("------------------------------------------");
		MusicalInstrument ref3=new 	MusicalInstrument();  
		ref3.name="tamte";
		ref3.cost=8765;
		ref3.noofinst=1;
		ref3.check=true;
		System.out.println("instrument is:" +ref3.name);
		System.out.println("cost is:" +ref3.cost);
		System.out.println("no is:" +ref3.noofinst);
		System.out.println("check is:" +ref3.check);
		System.out.println("------------------------------------------");
		MusicalInstrument ref4=new 	MusicalInstrument();  
		ref4.name="drums";
		ref4.cost=7896;
		ref4.noofinst=5;
		ref4.check=false;
		System.out.println("instrument is:" +ref4.name);
		System.out.println("cost is:" +ref4.cost);
		System.out.println("no is:" +ref4.noofinst);
		System.out.println("check is:" +ref4.check);
		System.out.println("------------------------------------------");
		MusicalInstrument ref5=new 	MusicalInstrument();  
		ref5.name="percussion";
		
		ref5.cost=3456;
		ref5.noofinst=1;
		ref5.check=false;
		System.out.println("instrument is:" +ref5.name);
		System.out.println("cost is:" +ref5.cost);
		System.out.println("no is:" +ref5.noofinst);
		System.out.println("check is:" +ref5.check);
		
		
		
		
		
		
		
		
	}
}