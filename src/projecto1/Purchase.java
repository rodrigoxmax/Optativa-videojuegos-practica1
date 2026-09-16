package projecto1;

public class Purchase {
	private Customer customer;
	private Game game;
	private int quantity;
	private double preciofianl;
	
public Purcharse(Customer customer,Game game,int quantity,double preciofianl) {
	this.customer=customer;
	this.game=game;
	this.quantity=quantity;
	this.preciofianl=quantity*game.getprecio();
	
}
public Customer getclient() {
	return customer;
	
}
public game getgame() {
	return customer;
	
}
public int getquantity() {
	return quantity;
	
}
public double getpreciofinal () {
	return preciofianl;
}

}
