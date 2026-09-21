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
public void aumentStock(int aument) {
	this.stock+=aument;
	}
public void restarStock(int dis) {
	
	if (stock >=0) {
		this.stock-=dis;
	}
	
	
}
public boolean Combrobardis(int stock) {
	if ( stock <=0) {
		return false;
	}else {
		return true;
	}
	
}

@Override
public String toString() {
	return "Game [titulo=" + titulo + ", gnere=" + gnere + ", price=" + price + ", stock=" + stock + "]";
}


}
