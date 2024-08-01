class WatchRunner{
	public static void main(String[] args){
		Watch watch=new Watch("gold",2599);
		watch.nos=2;
		System.out.println("brand is:"+watch.brand);
		System.out.println("color is:"+watch.color);
		System.out.println("cost is:"+watch.cost);
		System.out.println("no is:"+watch.nos);
		
		
		Watch watch1=new Watch("grey");
		System.out.println("color is:"+watch1.color);
		System.out.println("cost is:"+watch1.cost);
		
	}
}