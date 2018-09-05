/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria.dos.grafos.Model;

import java.util.ArrayList;

/**
 *
 * @author betto
 */
public class Vertice {

    private String nome;
    ArrayList<Aresta> ligacoes;

    public Vertice(String nome) {
        this.nome = nome;
        this.ligacoes = new ArrayList<Aresta>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aresta> getLigacoes() {
        return ligacoes;
    }

    public void setLigacoes(ArrayList<Aresta> ligacoes) {
        this.ligacoes = ligacoes;
    }

    void adicionaLigacoes(Aresta aresta) {
        this.ligacoes.add(aresta);
    }

}
