/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import gram.CompiladorParser;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kags_
 */
public class FunctionControl {
    
    private String nomeFuncao;
    private ArrayList<String> variaveis;
    private ArrayList<String> parametros;
    private Object valorRetorno;
    private CompiladorParser.VoidFuncContext voidContexto;
    private CompiladorParser.FuncContext contexto;
    
    public FunctionControl(String nomeFuncao,ArrayList<String> variaveis, ArrayList<String> parametos, CompiladorParser.VoidFuncContext ctx){
        this.nomeFuncao = nomeFuncao;
        this.variaveis = variaveis;
        this.parametros = parametos;
        this.voidContexto = ctx;
        this.valorRetorno = null;        
    }

    public CompiladorParser.VoidFuncContext getVoidContexto() {
        return voidContexto;
    }

    public void setVoidContexto(CompiladorParser.VoidFuncContext voidContexto) {
        this.voidContexto = voidContexto;
    }

    public CompiladorParser.FuncContext getContexto() {
        return contexto;
    }

    public void setContexto(CompiladorParser.FuncContext contexto) {
        this.contexto = contexto;
    }
    
    
    public FunctionControl(String nomeFuncao,ArrayList<String> variaveis, ArrayList<String> parametos, CompiladorParser.FuncContext ctx){
        this.nomeFuncao = nomeFuncao;
        this.variaveis = variaveis;
        this.parametros = parametos;
        this.contexto = ctx;
        this.valorRetorno = null;        
    }

    public String getNomeFuncao() {
        return nomeFuncao;
    }

    public void setNomeFuncao(String nomeFuncao) {
        this.nomeFuncao = nomeFuncao;
    }

    public ArrayList<String> getVariaveis() {
        return variaveis;
    }

    public void setVariaveis(ArrayList<String> variaveis) {
        this.variaveis = variaveis;
    }

    public ArrayList<String> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<String> parametros) {
        this.parametros = parametros;
    }

    public Object getValorRetorno() {
        return valorRetorno;
    }

    public void setValorRetorno(Object valorRetorno) {
        this.valorRetorno = valorRetorno;
    }
    
}
