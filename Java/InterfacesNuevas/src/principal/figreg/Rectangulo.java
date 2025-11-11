package principal.figreg;

import lombok.AllArgsConstructor;
import lombok.ToString;
import principal.FigGeo;

@AllArgsConstructor
@ToString
public class Rectangulo extends FigGeo implements CalArea{

    private double ancho;
    private double largo;

    public Rectangulo(double area, double perimetro, double ancho, double largo ) {
        //Se trae el constructor de la clase padre con la palabra super
        super(area, perimetro);
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public double calArea() {
        return ancho*largo;
    }

    public void priDescription(){
        System.out.println("El area del rectangulo es: " + this.getArea());
    }
}
