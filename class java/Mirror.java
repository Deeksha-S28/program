class Mirror{
	String shape;
	int size;
	Mirror(){
		System.out.println("created");
	}
	public static void main(String[] args){
		Mirror ref= new Mirror();
		System.out.println("shape :"+ref.shape);
		System.out.println("size :"+ref.size);
		ref.shape="oval";
		ref.size=2;
		System.out.println("shape :"+ref.shape);
		System.out.println("size :"+ref.size);
		Mirror ref1= new Mirror();
		System.out.println("shape :"+ref1.shape);
		System.out.println("size :"+ref1.size);
		ref1.shape="square";
		ref1.size=5;
		System.out.println("shape :"+ref1.shape);
		System.out.println("size :"+ref1.size);
		Mirror ref2= new Mirror();
		System.out.println("shape :"+ref2.shape);
		System.out.println("size :"+ref2.size);
		ref2.shape="triangle";
		ref2.size=5;
		System.out.println("shape :"+ref2.shape);
		System.out.println("size :"+ref2.size);
		Mirror ref3= new Mirror();
		System.out.println("shape :"+ref3.shape);
		System.out.println("size :"+ref3.size);
		ref3.shape="circle";
		ref3.size=35;
		System.out.println("shape :"+ref3.shape);
		System.out.println("size :"+ref3.size);
		
		Mirror ref4= new Mirror();
		System.out.println("shape :"+ref4.shape);
		System.out.println("size :"+ref4.size);
		ref4.shape="diamond";
		ref4.size=2;
		System.out.println("shape :"+ref4.shape);
		System.out.println("size :"+ref4.size);
	}
}