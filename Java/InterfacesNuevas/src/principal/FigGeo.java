package principal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FigGeo {

    private double perimetro;
    private double area;




    public void priDescription(){
        System.out.println("FigGeo Perimetro: " + perimetro+ " Area: " + area);

    }

}
