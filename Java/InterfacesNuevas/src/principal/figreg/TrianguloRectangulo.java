package principal.figreg;
import lombok.AllArgsConstructor;
import lombok.ToString;
import principal.FigGeo;

import java.io.Serializable;

@AllArgsConstructor
@ToString
public class TrianguloRectangulo extends FigGeo implements CalArea{

    private double base;
    private double altura;

    public TrianguloRectangulo(double area, double perimetro, double ancho, double largo ) {
        //Se trae el constructor de la clase padre con la palabra super
        super(area, perimetro);
        base = ancho;
        altura = largo;
    }

    @Override
    public double calArea() {
        return base*altura/2;
    }
}
