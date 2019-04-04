package cuboid;
public class TestCuboid {
	
	//static function 
	public static int findCuboidWithMaxVolume(Cuboid c1, Cuboid c2, Cuboid c3) {
		double volumeCuboid1 = c1.getVolume();
		double volumeCuboid2 = c2.getVolume();
		double volumeCuboid3 = c3.getVolume();

		if (volumeCuboid1 > volumeCuboid2 && volumeCuboid1 > volumeCuboid3)
			return c1.getCuboidId();
		else if (volumeCuboid2 > volumeCuboid1 && volumeCuboid2 > volumeCuboid3)
			return c2.getCuboidId();
		else
			return c3.getCuboidId();
	}

	public static void main(String[] args) {

		Cuboid c1 = new Cuboid(10, 8, 6);
		Cuboid c2 = new Cuboid(9, 7, 5);
		Cuboid c3 = new Cuboid(10, 15, 5);
		
		System.out.println("Cuboid 1 is created with ID : " + c1.getCuboidId());
		System.out.println("Cuboid 2 is created with ID : " + c2.getCuboidId());
		System.out.println("Cuboid 3 is created with ID : " + c3.getCuboidId());
		
		//Since getIdGenerator() function is of static type,so we don't need to create an object to call
		//It gets called with class name
		System.out.println("Next value for Cuboid IDGenerator : " + Cuboid.getIdGenerator());

		System.out.println("Surface area for Cuboid 1 : " + c1.getSurfaceArea());
		System.out.println("Volume for Cuboid 1 : " + c1.getVolume());

		System.out.println("Surface area for Cuboid 2 : " + c2.getSurfaceArea());
		System.out.println("Volume for Cuboid 2 : " + c2.getVolume());

		System.out.println("Surface area for Cuboid 3 : " + c3.getSurfaceArea());
		System.out.println("Volume for Cuboid 3 : " + c3.getVolume());

		System.out.println("Volume after reducing volume of hollow sphere :" + Math.round(c2.getVolume(13.5)));

		System.out.println("ID of cuboid with maximum value : " + findCuboidWithMaxVolume(c1, c2, c3));
	}
}
