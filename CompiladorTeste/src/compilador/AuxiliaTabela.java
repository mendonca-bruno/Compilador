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
public class AuxiliaTabela {
    Tipo tipo;
    boolean retorno;
    String ID;
    
    public AuxiliaTabela(Tipo tipo, boolean retorno, String id){
        this.tipo = tipo;
        this.retorno = retorno;
        this.ID = id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public boolean isRetorno() {
        return retorno;
    }

    public void setRetorno(boolean retorno) {
        this.retorno = retorno;
    }
    
}
