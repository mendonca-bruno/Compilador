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
    boolean global;
    boolean funcao;
    String nomeFuncao;
    
    public ControleContexto(boolean global, boolean funcao, String nomeFuncao){
        this.global = global;
        this.funcao = funcao;
        this.nomeFuncao = nomeFuncao;
    }
}
