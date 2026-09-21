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
public void añadirb (double d) throws Exception {
	if (d<0) throw new Exception("cantidad invalida");
	 this.balance=+d;
}
public void retirarbalance(double balanceresto) throws Exception {
	
		if (balanceresto<0) throw new Exception("cantidad invalida");
		if (balanceresto>balance) throw new Exception("cantidad invalida");
		this.balance-=balanceresto;
}

public boolean comprobar (double precio)  {
	return balance>=precio;
	
}

@Override
public String toString() {
	return "Customer [id_customer=" + id_customer + ", name=" + name + ", balance=" + balance + "]";
}


}
