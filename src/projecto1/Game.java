package projecto1;

public class Game {
	private static int contador=1;
	private int id_game;
	private String titulo;
	private Genere gnere;
	private double price;
	private int stock;
public Game (String titulo, Genere gnere, double price, int stock) {
	this.id_game=contador++;
	this.titulo=titulo;
	this.gnere=gnere;
	this.price=price;
	this.stock=stock;
	
}
public Game (int id_game,String titulo, Genere gnere, double price, int stock) {
	this.id_game=contador++;
	this.titulo=titulo;
	this.gnere=gnere;
	this.price=price;
	this.stock=stock;
	
}


public int getid() {
	return id_game;
}
public String gettitulo() {
	return titulo;
}
public double getprecio() {
	return price;
}
public int getstock() {
 return stock;
}

public Genere getGnere() {
	return gnere;
}

public void setGnere(Genere gnere) {
	this.gnere = gnere;
}

public void setstock( int stock) {
	this.stock=stock;
	
}
public void aumentStock(int aument) throws Exception {
	if(aument<0) throw new Exception("cantidad invalida");
	this.stock+=aument;
	}
public void restarStock(int dis)throws Exception {
	
	if (dis<0) throw new Exception("cantidad invalida");
	if (dis>stock) throw new Exception("cantidad invalida");
		this.stock-=dis;
	

		
	
}

public void modificarStock(int cantidad) throws Exception {
	if (cantidad<0) return;
	this.stock=cantidad;
}
public boolean Combrobardis(int cantidad) {
	return stock >=cantidad;
}

@Override
public String toString() {
	return "Game [id_game=" + id_game + ", titulo=" + titulo + ", gnere=" + gnere + ", price=" + price + ", stock="
			+ stock + "]";
}




}
