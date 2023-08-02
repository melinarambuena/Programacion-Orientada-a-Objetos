
package pooej3operacionSRMD;

import Entidades.Operacion;
import Servicio.OperacionServicio;


public class POOEJ3OperacionSRMD {

    
    public static void main(String[] args) {
        OperacionServicio os = new OperacionServicio();
        Operacion o1 = os.crearOperacion();
        
//        OperacionServicio.divide(num1, num2);
        
        System.out.println( "El resultado de la suma es: " +OperacionServicio.suma(o1.getNum1(),o1.getNum2() )); 
        System.out.println( "El resultado de la resta es: " +OperacionServicio.resta(o1.getNum1(),o1.getNum2() )); 
        System.out.println( "El resultado de la division es: " +OperacionServicio.divide(o1.getNum1(),o1.getNum2() )); 
        System.out.println( "El resultado de la multiplicación es: " +OperacionServicio.multiplica(o1.getNum1(),o1.getNum2() )); 
        
OperacionServicio.suma(o1.getNum1(),o1.getNum2() );

    }
    
}
