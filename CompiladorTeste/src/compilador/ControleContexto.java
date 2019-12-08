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
public class ControleContexto {
    private static ControleContexto instance;
    
    public static ControleContexto getInstance(boolean global, boolean funcao, String nomeFuncao){
        if(instance == null) instance = new ControleContexto(global, funcao, nomeFuncao);
        return instance;
    }
    
    boolean global;
    boolean funcao;
    String nomeFuncao;
    
    public ControleContexto(boolean global, boolean funcao, String nomeFuncao){
        this.global = global;
        this.funcao = funcao;
        this.nomeFuncao = nomeFuncao;
    }
}
