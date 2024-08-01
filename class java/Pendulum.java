class Pendulum{
	String type="bifilaar";
	int nos;
	public static void main (String[] args){
		Pendulum pendulum=new Pendulum();
		pendulum.nos=4;
		System.out.println(pendulum.type);
		System.out.println(pendulum.nos);
		
		Pendulum pendulum2=new Pendulum();
		System.out.println(pendulum2.type);
		System.out.println(pendulum2.nos);//0
	}
}