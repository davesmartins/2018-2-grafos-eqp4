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
    private int cor;
    
    public Aresta(Vertice origem, Vertice destino) {
        setOrigem(origem);
        setDestino(destino);
        setValor(0);
        setDirecionado(false);
        setCor(0);
    }

    public Aresta(boolean direcionado, Vertice origem, Vertice destino) {
        setDirecionado(direcionado);
        setOrigem(origem);
        setDestino(destino);
        setValor(0);
        setCor(0);
    }

    public Aresta(boolean direcionado, Vertice origem, Vertice destino, String nome, double valor) {
        setDirecionado(direcionado);
        setOrigem(origem);
        setDestino(destino);
        setNome(nome);
        setValor(valor);
        setCor(0);
    }
    
    public Aresta (){
        setNome("");
        setValor(0.0f);
        setCor(0);
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

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }
    
    
    
    
    

}
