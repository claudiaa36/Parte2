import java.io.IOException;
import java.util.Scanner;

class barril {
	int capacidad;
	int contenido;
	
	barril (int cap, int cont){
		capacidad=cap;
		contenido=cont;
	}
	public void omplim(barril otro) {
	
		int disponible;
		disponible=this.capacidad-this.contenido;
		
		int cambio;
		if (otro.contenido<disponible) {
		cambio=otro.contenido;
		}else {
			cambio=disponible;
		}
		this.contenido=this.contenido+cambio;
		otro.contenido=otro.contenido-cambio;
		
	}
	
}

public class E11_Barriles {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner teclat=new Scanner(System.in);
		barril[] barriles= {
				new barril(8,8),
				new barril(5,0),
				new barril(3,0)
		};
		int mov=0;
		
		do {
		System.out.println("Movimientos: " +mov);
		for (int i = 0; i < barriles.length; i++) {
			System.out.printf("Barril %d --> %d litros.",i+1,barriles[i].contenido);
			System.out.println();
		}
		
		System.out.println("Que barril cogemos?");
		int a=teclat.nextInt();
		System.out.println("Que barril llenamos?");
		int b=teclat.nextInt();
		a--;
		b--;	
		barriles[b].omplim(barriles[a]);
		mov++;
		}while(barriles[0].contenido!=4 && barriles[1].contenido!=4);
		
		System.out.println("Movimientos: " +mov);
		for (int i = 0; i < barriles.length; i++) {
			System.out.printf("Barril %d --> %d litros.",i+1,barriles[i].contenido);
			System.out.println();
		}
	}

}
