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


public ArrayList<Game> getGames() {
	return games;
}


public ArrayList<Customer> getCustomers() {
	return customers;
}


public ArrayList<Purchase> getPurcharse() {
	return purcharse;
}


public void añadirjuego(Game game) throws Exception {
	for(Game juego: games) {
		if(game.getid()==juego.getid()) throw new Exception("El juego no puede tener el mismo id");
	}
	games.add(game);
}
public void añadircliente(Customer cliente) {
	customers.add(cliente);
}
public Game buscarjuego(int id) throws exceptionnoencuentraid {
	
	for(Game E: games) {
		if(E.getid()==id) {
			return E;
		}
		
	}
	
	throw new exceptionnoencuentraid();
	
	
	
	
	
	
}


public Customer buscarCliente (int id_cliente ) throws Exception {
	for(Customer C: customers) {
		if(C.getid_costumer()==id_cliente) {
			return C;
		}
		
	}
	
	throw new Exception("No se encontro el cliente");
	
}
public ArrayList<Game> buscarjuegoporn(String N) {
	ArrayList<Game> busquedaj=new ArrayList<Game>();
	String Nombre=N.toLowerCase();
	for(Game G:games) {
		if(G.gettitulo().toLowerCase().contains(N.trim())) {
			 busquedaj.add(G);
		}
	}
	System.out.println("no se encontro Ningun juego");
	return busquedaj ;
	
	
	
}
public ArrayList<Game> busacalojuegos(Genere g1) {
	ArrayList<Game> busqueda=new ArrayList<Game>();
	for (Game  B: games ) {
		if (B!=null && B.getGnere()!=null && B.getGnere().equals(g1)) {
			busqueda.add(B);
		}
	}
	return busqueda;
	
}

public void comprarjuego(int c, int g, int s) throws Exception  {
	
	Customer cliente = buscarCliente(c);
    Game juego = buscarjuego(g);
    
    
    if (!customers.contains(cliente)) {
    	System.out.println("El cliente no existe");
        
    }
    
    if (!games.contains(juego)) {
    	System.out.println("juego no encontrado ");
        
    }
    

   
   boolean disponiblidad=juego.Combrobardis(s); 
  
    
    if(!disponiblidad) {
    	System.out.println("El no hay stock disponible");
    	
    }
    
    double preciof=juego.getprecio()*s;
    if(cliente.comprobar(preciof)) throw  new Exception("no hay stock");
    
    juego.restarStock(s);
    cliente.retirarbalance(preciof);
    
    
    Purchase nuevaCompra = new Purchase(cliente, juego, s);
    
 
    purcharse.add(nuevaCompra);
    
    System.out.println("Compra realizada con éxito.");
	

	
	
}	
}
