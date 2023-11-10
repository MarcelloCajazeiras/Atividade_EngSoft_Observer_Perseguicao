package org.example;

public class CarroRoubado extends VeiculoObservado {
    private boolean turboAtivado = false;


    public void ativarTurbo() {
        turboAtivado = true;
        notificarObservadores("Carro roubado ativou o turbo!");
    }

    public void desativarTurbo() {
        turboAtivado = false;
        notificarObservadores("Carro roubado desativou o turbo.");
    }

    public boolean isTurboAtivado() {
        return turboAtivado;
    }
}

