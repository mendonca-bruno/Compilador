/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

/**
 *
 * @author Bruno
 */
public class Util {
    
    public Tipo somar(Tipo tipo1, Tipo tipo2){        
        Number t1 = (Number) tipo1.valor;
        Number t2 = (Number) tipo2.valor;
        
        if(tipo1.tipo.equals("Double") || tipo2.tipo.equals("Double")){
            Double resultado = t1.doubleValue() + t2.doubleValue();
            System.out.println(resultado);
            return new Tipo("Double", resultado);
        }
        
        Integer resultado = t1.intValue() + t2.intValue();
        System.out.println(resultado);
        return new Tipo("Integer", resultado);
    }
}
