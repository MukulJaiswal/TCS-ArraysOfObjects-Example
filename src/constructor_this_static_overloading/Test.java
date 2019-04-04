package constructor_this_static_overloading;

public class Test {
	public static void main(String[] args) {
		String name ="mukul@gmail.com";
		String name1 ="mukul@aol.com";
		
		int index = name.indexOf('@');
		int index1 = name1.indexOf('@');
		
		String sub1 = name.substring(index);
		String sub2 = name1.substring(index);
		
		
		System.out.println(name.indexOf('@'));
		System.out.println(name1.indexOf('@'));
		System.out.println(name.substring(index));
		System.out.println(name1.substring(index));
		
		if(sub1.equals(sub2) && sub2.equals("gmail.com"))
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
}
