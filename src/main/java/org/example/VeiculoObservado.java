package org.example;

import java.util.ArrayList;
import java.util.List;


public class VeiculoObservado {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    protected void notificarObservadores(String acao) {
        for (Observador observador : observadores) {
            observador.notificar(acao);
        }
    }

    public void virarEsquerda() {
        notificarObservadores("Veículo virou à esquerda...");
    }

    public void virarDireita() {
        notificarObservadores("Veículo virou à direita...");
    }

    public void parar() {
        notificarObservadores("Veículo parou...");
    }
}
