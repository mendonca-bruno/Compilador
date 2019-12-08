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
    private static HashMap <ControleContexto,ArrayList<ConteudoContexto>> tabelaSimbolo;
    
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
    
    public void mostraTabela(ControleContexto controle){
        if(controle.isFuncao()){
            System.out.println("Escopo Funcao: " +controle.nomeFuncao);
        }else System.out.println("Escopo Global:");
        for(ConteudoContexto c : tabelaSimbolo.get(controle)){
            System.out.println("Id: " +c.id);
            System.out.println("Tipo: " +c.tipo);
            System.out.println("Valor: " +(Number)c.valor);
        }
    }
    
    public Object achaValor(ControleContexto cc, String var){
        Object valor = null;
        
        if(cc!=null){
            for (ConteudoContexto conteudo : tabelaSimbolo.get(cc)){
                if(conteudo.id.equals(var)){
                    valor = conteudo;
                    return valor;
                }
            }
        }
        
        return valor;
    }
}
