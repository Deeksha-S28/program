class Runner1{
	public static void main(String[] args){
	System.out.println("Start main in runner");
	new Tree();
	new Postbox();
	new Tripod();


	new Zip();
	new Wardrobee();
	new Niraksha();
	new Coin();
	new Selfiestick();

	new Furniture();
	new Poster();
	
	new Camera();
	new Helmet();
	Postbox postBox=new Postbox();
	Tripod tripod=new Tripod();
	Zip zip=new Zip();
	Wardrobee wardrobee=new Wardrobee();
	Niraksha niraksha=new Niraksha();
	Coin coin=new Coin();
	Selfiestick selfieStick=new Selfiestick();
	Furniture furniture=new Furniture();
	Tree tree=new Tree();
	Helmet helmet=new Helmet();
	Camera camera=new Camera();
	Poster poster=new Poster();
	
	System.out.println(tree.nameOfTree);
	System.out.println(postBox.loc);
	System.out.println(tripod.brand);
	System.out.println(niraksha.dressColor);
	System.out.println(wardrobee.cost);
	System.out.println(poster.info);
	System.out.println(furniture.type);
	System.out.println(selfieStick.cost);
	System.out.println(coin.meterial);
	System.out.println(zip.brand);
	System.out.println(camera.brand);
	System.out.println(helmet.brand);
	System.out.println("---------------------------------------------------------------------------");

	tree.nameOfTree="mango tree";
	postBox.loc="bangalore";
	tripod.brand="boat";
	niraksha.dressColor="blue";
	wardrobee.cost=10000;
	poster.info="job vecancy";
	furniture.type="diningtable";
	selfieStick.cost=5000;
	coin.meterial="iron";
	zip.brand="WildCraft";
	camera.brand="sony";
	helmet.brand="smk";
	System.out.println("tree name:"+tree.nameOfTree);
	System.out.println("adress:"+postBox.loc);
	System.out.println("pods brand:"+tripod.brand);
	System.out.println("niraksha dressColor:"+niraksha.dressColor);
	System.out.println("wardrobe cost:"+wardrobee.cost);
	System.out.println("poster info:"+poster.info);
	System.out.println("furniture type:"+furniture.type);
	System.out.println("selfieStick cost:"+selfieStick.cost);
	System.out.println("coin:"+coin.meterial);
	System.out.println("zip:"+zip.brand);
	System.out.println("camera brand:"+  camera.brand);
	System.out.println("helmet:"+helmet.brand);
	System.out.println("---------------------------------------------------------------------------");
	
    tree.nameOfTree="neem tree";
	postBox.loc="mysore";
	tripod.brand="sony";
	niraksha.dressColor="red";
	wardrobee.cost=1000;
	poster.info="invitation";
	furniture.type="chair";
	selfieStick.cost=500;
	coin.meterial="steel";
	zip.brand="sky";
	camera.brand="canon";
	helmet.brand="vega";
	System.out.println("tree name:"+tree.nameOfTree);
	System.out.println("adress:"+postBox.loc);
	System.out.println("pods brand:"+tripod.brand);
	System.out.println("niraksha dressColor:"+niraksha.dressColor);
	System.out.println("wardrobe cost:"+wardrobee.cost);
	System.out.println("poster info:"+poster.info);
	System.out.println("furniture type:"+furniture.type);
	System.out.println("selfieStick cost:"+selfieStick.cost);
	System.out.println("coin:"+coin.meterial);
	System.out.println("zip:"+zip.brand);
	System.out.println("camera brand:"+  camera.brand);
	System.out.println("helmet brand:"+helmet.brand);	
	
	
	
	

	
	}
}