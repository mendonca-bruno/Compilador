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
public class ConteudoContexto {
    String tipo;
    String id;
    Object valor;
    
    public ConteudoContexto(String tipo, String id, Object valor){
        this.tipo = tipo;
        this.id = id;
        this.valor = valor;
    }
}
