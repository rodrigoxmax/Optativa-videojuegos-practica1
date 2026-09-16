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
	return nombre;
}
public double getbalace() {
	return id_customer;
}
public void añadirb (double d) {
	 this.balance+añadirb;
}
public void retirarbalance(double balanceresto) {
	
		try {
			this.balance-=balanceresto;
		}catch(Exception bloque) {
			System.out.println("Error no puedes hacer eso");
			
		}
	}else {
		this.balance-=balanceresto;
	}
}
public void comprobar (double precio) throws Exception {
	
		
	if(saldo<precio) {
		throws new Exception("no puedes comprar con el saldo actual que tienes ");
	}
	
}
public String toString() {
	return "Nombre"+nombre+"saldo"+balance;
	
}

}
