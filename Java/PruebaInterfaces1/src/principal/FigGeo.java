package principal;



public class FigGeo {

	private double perimetro;
	private double area;
	
	public FigGeo() {
		
	}

	public FigGeo(double perimetro, double area) {
		this.perimetro = perimetro;
		this.area = area;
	}
	
	public void priDescription() {
		System.out.println("FigGeo Perimetro: "+perimetro+" Area: "+area);
	}
	
	
	
	
	
}
