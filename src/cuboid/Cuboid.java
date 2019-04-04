package cuboid;
/**
 * Example of getters and setters,function overloading static and this keyword,
 * constructors.
 * 
 * @author Mukul
 *
 */
public class Cuboid {

	// static variable
	public static int idGenerator = 1;

	private int cuboidId;
	private int length;
	private int width;
	private int height;

	public Cuboid(int length, int width, int height) {
		this.cuboidId = idGenerator++;
		this.length = length;
		this.width = width;
		this.height = height;
	}

	// Getters and Setters examples.
	public static int getIdGenerator() {
		return idGenerator;
	}

	public static void setIdGenerator(int idGenerator) {
		// ID generator is static so "this" cannot be used.Instead we use Class name
		// because
		// static variables are associated with class.
		Cuboid.idGenerator = idGenerator;
	}

	public int getCuboidId() {
		return cuboidId;
	}

	public void setCuboidId(int cuboidId) {
		this.cuboidId = cuboidId;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getSurfaceArea() {
		double totalSurfaceArea;
		totalSurfaceArea = 2 * ((length * width) + width * height + height * length);
		return totalSurfaceArea;
	}

	public double getVolume() {
		return length * width * height;
	}

	// Example of function overloading.Same name but differentiated by parameters.
	public double getVolume(double hollowRadius) {
		double volumeCuboid;
		double volumeSphere;
		double finalVolumeCuboid;

		volumeSphere = 4 * (Math.PI * (3 * hollowRadius)) / 3;
		volumeCuboid = length * width * height;
		finalVolumeCuboid = volumeCuboid - volumeSphere;
		return finalVolumeCuboid;
	}

}
