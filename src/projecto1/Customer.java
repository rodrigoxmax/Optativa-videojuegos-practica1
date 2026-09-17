package projecto1;

public class Customer extends Exception {
	private static int cust=1;
	private int id_customer;
	private String name;
	private double balance;
public Customer ( String name, double balance) {
	this.id_customer=cust++;
	this.name=name;
	this.balance=balance;
}

public void setId_customer(int id_customer) {
	this.id_customer = id_customer;
}

public void setName(String name) {
	this.name = name;
}

public void setBalance(double balance) {
	this.balance = balance;
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
		throw new  Exception ("no puedes comprar con el saldo actual que tienes ");
	}
	System.out.println("puedes comprar");
	
}
public String toString() {
	return "Nombre"+name+"saldo"+balance;
	
}

}
