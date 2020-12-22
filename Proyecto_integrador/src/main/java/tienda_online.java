public class Tienda {

	
	int dineroEnCaja;
	private Producto p1;
	private Producto p2;
	private Producto p3;
	private Producto p4;
	public static void main(String[] args) {
		Producto p1 = new Producto("Lulo", "SAD", 2.2);
		System.out.println(p1.nombre+": "+p1.precio+": "+p1.codigo);
		
	}
	
	public Producto getP1() {
		return p1;
	}
	public void setP1(Producto p1) {
		this.p1 = p1;
	}
	public Producto getP2() {
		return p2;
	}
	public void setP2(Producto p2) {
		this.p2 = p2;
	}
	public Producto getP3() {
		return p3;
	}
	public void setP3(Producto p3) {
		this.p3 = p3;
	}
	public Producto getP4() {
		return p4;
	}
	public void setP4(Producto p4) {
		this.p4 = p4;
	}
	public Tienda(Producto p1, Producto p2, Producto p3, Producto p4) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
}