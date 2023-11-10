package org.example;

public class App {
    public static void main(String[] args) {

        CarroRoubado carroRoubado = new CarroRoubado();
        ViaturaPolicial viaturaPolicial = new ViaturaPolicial("Viatura 1");


        carroRoubado.adicionarObservador(viaturaPolicial);


        carroRoubado.virarEsquerda();
        carroRoubado.virarDireita();
        carroRoubado.parar();
    }
}