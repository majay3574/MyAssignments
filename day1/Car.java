package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("Stop the Car");
	}
	public void applyGear() {
		System.out.println("Apply the Gear");
	}
	public void switchOnAc() {
		System.out.println("On the AC");
	}
    public void applyAcclerate() {
    	System.out.println("Apply the acceletrate");
    }
public static void main(String[] args) {
	Car done =new Car();
	done.applyBreak();
	done.applyGear();
	done.switchOnAc();
	done.applyAcclerate();
}
}
