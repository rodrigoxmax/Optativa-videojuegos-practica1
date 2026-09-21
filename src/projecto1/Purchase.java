package projecto1;

public class Purchase {
	private Customer customer;
	private Game game;
	private int quantity;
	private double preciofianl;
	
public  Purchase(Customer customer,Game game,int quantity) {
	this.customer=customer;
	this.game=game;
	this.quantity=quantity;
	this.preciofianl=Calcularpreciofinal(quantity,game);
	
}
public Customer getclient() {
	return customer;
	
}
public Game getgame() {
	return game;
	
}
public int getquantity() {
	return quantity;
	
}
public double getpreciofinal () {
	return preciofianl;
}
public double Calcularpreciofinal(int q, Game G) {
	
	return q*game.getprecio();
	
}
@Override
public String toString() {
	return "Purchase [customer=" + customer + ", game=" + game + ", quantity=" + quantity + ", preciofianl="
			+ preciofianl + "]";
}



}
