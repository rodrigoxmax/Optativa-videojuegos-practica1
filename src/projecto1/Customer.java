package projecto1;

public class Customer extends Exception {
	private int id_customer;
	private String name;
	private double balance;
public Customer ( String name, double balance) {
	this.name=name;
	this.balance=balance;
}
public int getid_costumer() {
	return id_customer;
}
public String  getnombre() {
	return name;
}
public double getbalace() {
	return id_customer;
}
public void añadirb (double d) {
	 this.balance=+d;
}
public void retirarbalance(double balanceresto) {
	
		

		this.balance-=balanceresto;
}

public void comprobar (double precio) throws Exception {
	
		
	if(balance<precio) {
		throws new  Exception ("no puedes comprar con el saldo actual que tienes ");
	}
	
}
public String toString() {
	return "Nombre"+name+"saldo"+balance;
	
}

}
