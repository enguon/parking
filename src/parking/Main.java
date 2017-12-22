package parking;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Parking : \n");
Sensor s1 = new Sensor(1);
s1.start();
Filtre1 f1 = new Filtre1(s1);
f1.start();
Filtre2 f2 = new Filtre2(f1);
f2.start();

	}

}
