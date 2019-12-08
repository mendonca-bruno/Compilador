/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.util.HashMap;

/**
 *
 * @author Bruno
 */
public class TabelaSimbolos {
    private HashMap <Tipo,ControleContexto> tabelaSimbolo;
    
    public TabelaSimbolos(){
        tabelaSimbolo = new HashMap<>();
    }
    
    public void adicionaTabela(Tipo tipo, ControleContexto controle){
        tabelaSimbolo.put(tipo, controle);
        
    }
    
    public int tamanhoTabela(){
        return tabelaSimbolo.size();
    }   
    
}
