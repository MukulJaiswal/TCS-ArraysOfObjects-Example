package constructor_this_static_overloading;

 class Testing {
	
	public void talent()
	{
		System.out.println("Talent code");
	}
}
public class OutputTest  extends Testing{
	public void talent()
	{
		System.out.println("Talent");
	}
	public static void main(String[] args) {
		
		Testing ob = new OutputTest();
		ob.talent();
	}
}
