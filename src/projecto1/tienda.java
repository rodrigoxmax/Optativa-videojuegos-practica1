package projecto1;
import java.util.*;
public class tienda extends Exception  {
private ArrayList<Game> games=new ArrayList<Game>();
private ArrayList<Customer> customers=new ArrayList<Customer>();
private ArrayList<Purchase> purcharse=new ArrayList<Purchase>();


public tienda() {
	super();
	this.games = games;
	this.customers = customers;
	this.purcharse = purcharse;
}

public void añadirjuego(Game game) {
	games.add(game);
}
public Game buscarjuego(int id) throws Exception {
	
	for(Game E: games) {
		if(E.getid()==id) {
			return E;
		}
		
	}
	
	throw new Exception("Nose encontro un id");
	
	
	
	
	
	
}


public Customer buscarCliente (int id_cliente ) throws Exception {
	for(Customer C: customers) {
		if(C.getid_costumer()==id_cliente) {
			return C;
		}
		
	}
	
	throw new Exception("No se encontro el cliente");
	
}
public Game buscarjuegoporn(String N) {
	String Nombre=" ";
	for(Game G:games) {
		if(G.gettitulo().contains(N.trim())) {
			return G;
		}
	}
	System.out.println("no se encontro Ningun juego");
	return null;
	
	
	
}
public ArrayList<Game> busacalojuegos(Genere g1) {
	ArrayList<Game> busqueda=new ArrayList<Game>();
	for (Game B:games) {
		if( B.getGnere().contains(g1)) {
			busqueda.add(B);
		}
	}
	return busqueda;
	
}

public void comprarjuego(int c, int g, int s) throws Exception {
	
	Customer cliente = buscarCliente(c);
    Game juego = buscarjuego(g);
    
    
    if (c <= 0) {
        throw new Exception("La cantidad solicitada no es válida.");
    }
    
    
    if (juego.getstock() < s) {
        throw new Exception("No hay stock suficiente para este videojuego.");
    }
    
  
    double costoTotal = juego.getprecio() * c ;
   
    if (cliente.getbalace() < costoTotal) {
        throw new Exception("El cliente no tiene saldo suficiente.");
    }
    
    
    juego.restarStock(s);
    cliente.retirarbalance(costoTotal);
    
    
    Purchase nuevaCompra = new Purchase(cliente, juego, s);
    
 
    purcharse.add(nuevaCompra);
    
    System.out.println("Compra realizada con éxito.");
	

	
	
}	
}
