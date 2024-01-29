import java.util.Scanner;

class cabina{
	String nom;
	int llits;
	int coberta;
	double preu;

cabina(String nom, int llits, int coberta, int preu){
	this.nom=nom;
	this.llits=llits;
	this.coberta=coberta;
	this.preu=preu;
}

public String toString() {
	return "Creuer: "+nom+", llits: "+llits+", coberta: "+coberta+", preu: "+preu+"€.";
}

}
class creuer{
	String nomcreuer;
	int durada;
	int escales;
	int piscines;
	int eslora;
	
creuer(String nom, int durada, int escales, int piscines, int eslora){
	this.nomcreuer=nom;
	this.escales=escales;
	this.durada=durada;
	this.piscines=piscines;
	this.eslora=eslora;
}

}


public class E15_Creuers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat=new Scanner(System.in);
		
		creuer viatges[]= {
				new creuer ("CostaConcordia",7,5,5,300),
				new creuer("MSC Cruceros", 10, 8, 4, 280),
				new creuer("Grimaldi", 5, 4, 3, 210),
				new creuer("Pullmantur", 14, 12, 4, 315),
			};	
		cabina cabines[]= {
			new cabina("CostaConcordia", 2, 5, 1000),
			new cabina("CostaConcordia", 2, 7, 1200),
			new cabina("MSC Cruceros", 4, 4, 1200),
			new cabina("Pullmantur", 4, 4, 450),
			new cabina("MSC Cruceros", 4, 8, 1400),
			new cabina ("MSC Cruceros", 2, 10, 1400),
			new cabina("Pullmantur" , 6, 8, 800),
		};
		
		System.out.println("Piscines?");
		int piscines=teclat.nextInt();
		boolean existe=false;
		for (int i = 0; i < viatges.length; i++) {
			
			if (viatges[i].piscines>=piscines) {
				
				for (int j = 0; j < cabines.length; j++) {
					if (cabines[j].nom==viatges[i].nomcreuer) {
						existe=true;
						System.out.println(cabines[j].toString());
					}
				}
			
			}
			
		}
		if (!existe) {
			System.out.println("Cap cabina");
		}
		
	}

}

