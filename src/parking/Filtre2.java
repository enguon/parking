package parking;

public class Filtre2 extends Thread{

	public String messageTmp;
	public Filtre1 filtre1;	
	
	public Filtre2(Filtre1 pFiltre1){
		filtre1 = pFiltre1;
	}
	
	public void run() {
		messageTmp = filtre1.getMessage();
		System.out.println(filtre1.getMessage());
		while(!interrupted()) {
//			System.out.println("filtre 1 : " + filtre1.getMessage() + " filtre tmp : " + filtreTmp.getMessage());
		if(!messageTmp.equals(filtre1.getMessage())) {
			System.out.println(filtre1.getMessage());
			messageTmp = filtre1.getMessage();
		}
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	
}
