/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria.dos.grafos.Model;

/**
 *
 * @author betto
 */
public class Aresta {
    
    private boolean direcionado;
    private Vertice origem;
    private Vertice destino;
    private String nome;
    private double valor;
    
    public Aresta(Vertice origem, Vertice destino) {
        setOrigem(origem);
        setDestino(destino);
        setValor(0);
        setDirecionado(false);
    }

    public Aresta(boolean direcionado, Vertice origem, Vertice destino) {
        setDirecionado(direcionado);
        setOrigem(origem);
        setDestino(destino);
        setValor(0);
    }

    public Aresta(boolean direcionado, Vertice origem, Vertice destino, String nome, double valor) {
        setDirecionado(direcionado);
        setOrigem(origem);
        setDestino(destino);
        setNome(nome);
        setValor(valor);
    }
    
    public Aresta (){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean isDirecionado() {
        return direcionado;
    }

    public void setDirecionado(boolean direcionado) {
        this.direcionado = direcionado;
    }
    
    public Vertice getOrigem() {
        return origem;
    }
    
    public String getNomeOrigem() {
        return origem.getNome();
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice getDestino() {
        return destino;
    }
    
    public String getNomeDestino() {
        return destino.getNome();
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    

}
