package principal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import principal.figreg.CalArea;
import principal.figreg.Rectangulo;
import principal.figreg.TrianguloRectangulo;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Rompecabezas {
    private Rectangulo rectangulo;
    private TrianguloRectangulo triangulo;
    public  CalArea pentagono = new CalArea () {
        private double lado;
        private double apotema;


        public double calArea(){
            return lado*apotema*5/2;
        }


    };;



}
