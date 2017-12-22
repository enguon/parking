package parking;

public class Sensor extends Thread{

public int id;	
public double range;
public double rate;
public int bitCar;

public Sensor(int pId){
	id = pId;
	rate = 2;
	range = 1.80;
	bitCar=0;
}

public void run(){
	try {
		while(!interrupted()) {
//		System.out.println("ID:R"+range + "_"+bitCar+ "\n");
		sleep((long) (rate * 1000));
		
		if(bitCar == 0) {
			if(Math.random() < 0.3) carArrived();
		}
		else {
			if(Math.random() > 0.8) carLeave();
		}
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void carArrived() {
	bitCar = 1;
	range = Math.random() * 1.8;
}

public void carLeave() {
	bitCar = 0;
}

public int getBitCar() {
	return bitCar;
}

public void setBitCar(int bitCar) {
	this.bitCar = bitCar;
}



}
