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
	preciofianl=quantity*game.getprecio();
	
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

}
