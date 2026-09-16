package projecto1;

public class Game {
	private int id_game;
	private String titulo;
	private Genere gnere;
	private double price;
	private int stock;
public Game (String titulo, Genere gnere, double price, int stock) {
	this.id_game=id_game;
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
public void setstock( int stock) {
	stock=stock;
	
}
public int aumentStock(int aument) {
	int subida=stock+aument;
	return subida;
}
public int restarStock(int dis) {
	int disminu;
	if (stock >=0) {
		disminu=stock-=dis;
	}
	return disminu;
	
}
public boolean Combrobardis(int stock) {
	if ( stock <=1) {
		return false;
	}else {
		return true;
	}
	
}
public toString() {
	"nombre "+titulo+"/ "+
	"genero"+gnere+"/"+
	"precio "+price+"/ "+
	"Stock"+stock+"/"+
}

}
