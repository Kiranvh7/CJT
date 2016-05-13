
public class FirstClass {
	int a=5;
	//Methods
	public void getData()
	{
	//
		System.out.println ("I am in Method");
		//return "hello";
	
	}
	
	// What are Objects?
	//Objects are the instances/references of a class
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		FirstClass fn=new FirstClass();
		SecondClass sn=new SecondClass();
		fn.getData();
		sn.setData();
		System.out.println(fn.a);
		System.out.println ("a");
		System.out.println ("Hi");
		System.out.println ("Hello World");
		
	}

}
