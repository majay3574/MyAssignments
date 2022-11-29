package week1.day1;

public class Twowheeler {
	int noOfWheels =2;
	short noOfMirrors =2;
	long chassisNumber =897898676979L;
	boolean isPunctured =true;
	String bikename = "Tvs champ";
	double runningKM = 23.87;
public static void main(String[] args) {
	Twowheeler bike = new Twowheeler();
	System.out.println("no of wheels=" +bike.noOfWheels);
	System.out.println("no of mirror=" +bike.noOfMirrors);
	System.out.println("chassis number=" +bike.chassisNumber);
	System.out.println("Tyre is punctured="+bike.isPunctured);
	System.out.println("Bike name=" +bike.bikename);
	System.out.println("runningKm=" +bike.runningKM);



}

}
