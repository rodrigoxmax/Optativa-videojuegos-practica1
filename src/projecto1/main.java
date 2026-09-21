package projecto1;
import java.util.*;
public class main {
	public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
		
		
		
		tienda tienda1=new tienda();
		
		tienda1.añadirjuego(new Game("Super Mario",Genere.PLATAFORM,20,3));
		tienda1.añadirjuego(new Game("Zelda:Ocarina of time",Genere.ADVENTURE,30,4));
		int juego=0;
	
		
		
		do {
		juego=sc.nextInt();
		
	
		switch(juego) {
		case 1:
			System.out.println(" "+tienda1.getGames());
			break;
		case 2:
			System.out.println("Dame un id de un juego");
			int id_game=sc.nextInt();
			Game juegoid=null;
			try {
				
			 juegoid=tienda1.buscarjuego(id_game);
			 System.out.println(juegoid.toString());
			}catch(exceptionnoencuentraid et) {
				System.out.println(et.getMessage());
				
			}
			
		

			
			break;
		case 3:
			
			
		}
			
			
			
		}while(juego<11);
		
		
		
		
		
		
		
		
	}
	
	
	

}
