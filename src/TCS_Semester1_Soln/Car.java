package TCS_Semester1_Soln;

import java.util.Scanner;

class Solution3 {
	int id;
	String carName;
	String fuel;
	int mileage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public Solution3(int id, String carName, String fuel, int mileage) {
		super();
		this.id = id;
		this.carName = carName;
		this.fuel = fuel;
		this.mileage = mileage;
	}
}
public class Car {
	public static void main(String[] args) {
		int id;
		String carName;
		String fuel;
		int mileage;
		Solution3 book[] = new Solution3[4];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			id = sc.nextInt();sc.nextLine();
			carName = sc.nextLine();
			fuel = sc.nextLine();
			mileage = sc.nextInt();
			
			book[i] = new Solution3(id, carName , fuel, mileage);
		}
		
		Solution3[] sol = carHavingPetrol(book);
		for(int i=0;i<sol.length;i++) {
			System.out.println(sol[i].id);
			System.out.println(sol[i].carName);
			System.out.println(sol[i].fuel);
			System.out.println(sol[i].mileage);
			
		}
	}
	static Solution3[] carHavingPetrol(Solution3 car[]) {
		int n=0,p=0;
		for(int i=0;i<4;i++) {
			if(car[i].fuel.equalsIgnoreCase("petrol")) {
				n=n+1;
			}
		}
		p=n;
		Solution3 sol[] = new Solution3[n];
		n=0;
		for(int i=0;i<4;i++) {
			if(car[i].fuel.equalsIgnoreCase("petrol")) {
				sol[n++] = car[i];
			}
		}
		
		for(int i=0;i<p;i++) {
			for(int j=0;j<p-i-1;j++) {
				if(sol[j].mileage > sol[j+1].mileage) {
					Solution3 temp = sol[j];
					sol[j] = sol[j+1];
					sol[j+1] = temp;
				}
			}
		}
		
		return sol;
		
	}
}










