package org.example;

public class ViaturaPolicial extends VeiculoObservado implements Observador {
    private String nome;

    public ViaturaPolicial(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificar(String acao) {
        System.out.println(nome + " " + acao);
    }
}

