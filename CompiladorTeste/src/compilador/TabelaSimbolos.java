/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Bruno
 */
public class TabelaSimbolos {
    private HashMap <ControleContexto,ArrayList<ConteudoContexto>> tabelaSimbolo;
    
    public TabelaSimbolos(){
        tabelaSimbolo = new HashMap<>();
    }
    
    public void adicionaTabela(ControleContexto controle, ConteudoContexto conteudo){
        if(tabelaSimbolo.get(controle)==null){
            ArrayList<ConteudoContexto> cont = new ArrayList<>();
            cont.add(conteudo);
            tabelaSimbolo.put(controle, cont);
            return;
        }
        tabelaSimbolo.get(controle).add(conteudo);
        
    }
    
    public int tamanhoTabela(){
        return tabelaSimbolo.size();
    }   
    
}
