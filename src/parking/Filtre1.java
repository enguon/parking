package parking;

public class Filtre1 extends Thread{

	public Sensor sensor;
	public String message;
	
	public Filtre1(Sensor pSensor) {
		sensor = pSensor;
		message = "NA";
	}
	
	public void run(){
		while(!interrupted()) {
			if(sensor.getBitCar() == 1) {
				message = "DETECTE";
//				System.out.println(message+ "\n");
			}
			else {
				message = "NA";
//				System.out.println(message +"\n");
			}
//			try {
//				sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
