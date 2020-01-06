package br.uem.din.veiculos.controladores;

import br.uem.din.veiculos.modelo.Estado;
import br.uem.din.veiculos.modelo.Veiculo;
import br.uem.din.veiculos.modelo.Automovel;

public class Controlador {

    Veiculo veiculo;

    public void criarAutomovel() {
        veiculo = new Automovel();
        veiculo.setEstado(Estado.PARADO);
        System.out.println("Veiculo criado com sucesso");
    }

    public void deslocar(Veiculo v) {
        v.deslocar();
        System.out.println("Percorridos " + v.getQuilometragem() + "km");
    }

    public void acelerar(Veiculo v) {
        if (v.getEstado().equals(Estado.MOVIMENTO)) {
            v.acelerar();
            System.out.println("Velocidade = " + v.getVelocidade() + "km/h");
        } else {
            System.out.println("Impossivel acelerar – veiculo parado");
        }
    }

    public void frear(Veiculo v) {
        v.frear();
        System.out.println("Veiculo freou");
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}
