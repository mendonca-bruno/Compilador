/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class ControleContexto {
    private static ArrayList<ControleContexto> contextos;
    
    public static ControleContexto checaContexto(boolean global, boolean funcao, String nomeFuncao){
        //System.out.println("Nome funcao: "+nomeFuncao);
        ControleContexto novo;
        if(contextos == null){
            contextos = new ArrayList<>();
            novo = new ControleContexto(global, funcao, nomeFuncao);
            contextos.add(novo);
            return novo;
        }
        novo = verificaExistencia(global,funcao,nomeFuncao);
        if(novo == null){
            novo = new ControleContexto(global, funcao, nomeFuncao);
            contextos.add(novo);
            return novo;
        }
        return novo;
        
    }
    
    boolean global;
    boolean funcao;
    boolean chamado = false;
    String nomeFuncao;
    
    public ControleContexto(boolean global, boolean funcao, String nomeFuncao){
        this.global = global;
        this.funcao = funcao;
        this.nomeFuncao = nomeFuncao;
    }
    
    private static ControleContexto verificaExistencia(boolean global, boolean funcao, String nomeFuncao){
        for(ControleContexto cc : contextos){
            if((cc.global == global) && (cc.funcao == funcao) && (cc.nomeFuncao.equals(nomeFuncao))) return cc;
        }
        return null;
    }
    
    public boolean isGlobal() {
        return global;
    }

    public void setGlobal(boolean global) {
        this.global = global;
    }

    public boolean isFuncao() {
        return funcao;
    }

    public void setFuncao(boolean funcao) {
        this.funcao = funcao;
    }

    public String getNomeFuncao() {
        return nomeFuncao;
    }

    public void setNomeFuncao(String nomeFuncao) {
        this.nomeFuncao = nomeFuncao;
    }

    public boolean isChamado() {
        return chamado;
    }

    public void setChamado(boolean chamado) {
        this.chamado = chamado;
    }
}
