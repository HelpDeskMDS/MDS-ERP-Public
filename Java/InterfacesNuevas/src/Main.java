import principal.FigGeo;
import principal.Rompecabezas;
import principal.figreg.CalArea;
import principal.figreg.Rectangulo;
import principal.figreg.TrianguloRectangulo;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FigGeo figura1=new FigGeo(10,2.5);
        figura1.priDescription();

        Rectangulo rectangulo=new Rectangulo(2,5,7,9);
        //  System.out.println("Area rectangulo: "+rectangulo.getArea());

        Rectangulo rectangulo2=new Rectangulo(5,6,2,3);
        // System.out.println(rectangulo2.toString());

        TrianguloRectangulo trianguloRectangulo=new TrianguloRectangulo(5,6,2,3);
        //System.out.println(trianguloRectangulo.toString());

        Rompecabezas rompecabezas=new Rompecabezas();
        rompecabezas.pentagono= rompecabezas.new Pentagono(5,5);

        //Rompecabezas.Pentagono pentagono= new Rompecabezas.Pentagono(5,5);



        List<FigGeo> figuras=new ArrayList<FigGeo>();
        figuras.add(figura1);
        figuras.add(rectangulo2);
        figuras.add(rectangulo);
        figuras.add(trianguloRectangulo);

        for (FigGeo figura : figuras) {
            figura.priDescription();
        }

        List<CalArea> area= new ArrayList<CalArea>();
        area.add(rectangulo);
        area.add(rectangulo2);
        area.add(trianguloRectangulo);
        area.add(rompecabezas.pentagono);

        for (CalArea area1 : area) {

            System.out.println(area1.toString()+": "+ area1.calArea());
        }





    }
}