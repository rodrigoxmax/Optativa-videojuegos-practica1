package projecto1;
import java.io.File;
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
		if(G.gettitulo().toLowerCase().contains(N)) {
			 busquedaj.add(G);
		}
	}
	System.out.println("no se encontro Ningun juego");
	return busquedaj ;
	
	
	
}
public void loadGAmes(String filename) throws Exception {
	File f=new File (filename);
	try(Scanner scanner =new Scanner(f)) {
		String line=null;
		while(scanner.hasNextLine()) {
			
			line= scanner.nextLine();
			String [] spliteline=line.split(";");
			int id=Integer.parseInt(spliteline[0]);
			String name=spliteline[1];
			Genere genere=Genere.valueOf(spliteline[2]);
			double price=Double.parseDouble(spliteline[3]);
			int stock=Integer.parseInt(spliteline[4]);
			Game g=new Game(id,name,genere,price,stock);
			games.add(g);
		}
		
	}
	catch(Exception e) {
		
	}
	
}
public void loadCustomers(String filename)throws Exception {
	File f1=new File (filename);
	try(Scanner scanner =new Scanner(f1)) {
		String line2=null;
		while(scanner.hasNextLine()) {
			
			line2= scanner.nextLine();
			String [] spliteline2=line2.split(";");
			int id1=Integer.parseInt(spliteline2[0]);
			String name1=spliteline2[1];
			
			double price1=Double.parseDouble(spliteline2[2]);
			
			Customer c=new Customer(id1,name1,price1);
			customers.add(c);
		}
		
	}
	catch(Exception e) {
		
	}
	
	
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
    if(!cliente.comprobar(preciof)) throw  new Exception("No hay stock");
    
    juego.restarStock(s);
    cliente.retirarbalance(preciof);
    
    
    Purchase nuevaCompra = new Purchase(cliente, juego, s);
    
 
    purcharse.add(nuevaCompra);
    
    System.out.println("Compra realizada con éxito.");
	

	
	
}	
}
