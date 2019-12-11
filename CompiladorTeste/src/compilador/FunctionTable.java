/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.util.HashMap;

/**
 *
 * @author kags_
 */
public class FunctionTable {
    private static FunctionTable instance;
    
    public static FunctionTable getInstace(){
        if(instance == null){
            instance = new FunctionTable();
        }
        return instance;
    }
    private HashMap<String,FunctionControl> tabelaFuncoes;
    
    public FunctionTable(){
        tabelaFuncoes = new HashMap<>();
    }
    
    public void adicionaTabelaFuncoes(String nomeFuncao, FunctionControl contextoFuncao){
        tabelaFuncoes.put(nomeFuncao, contextoFuncao);
    }
    
    public FunctionControl getFunc(String nomeFuncao){
        return tabelaFuncoes.get(nomeFuncao);
    }
    
}
