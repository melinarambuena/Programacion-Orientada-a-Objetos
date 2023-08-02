
package pooej2circunferencia;

import Entidades.Circunferencia;
import Servicio.CircunferenciaServicio;


public class POOEj2Circunferencia {

    
    public static void main(String[] args) {
        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferencia c1 = cs.altaCircunferencia();
//        cs.mostrarInfo(c1, radio, perimetro, area);
       double area = CircunferenciaServicio.area(c1.getRadio());
       double perimetro = CircunferenciaServicio.perimetro(c1.getRadio());
       cs.mostrarInfo(c1, perimetro, area);
//        mostrarInfo( c1,    perimetro,  area);
    }
    
}
