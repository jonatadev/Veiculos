package br.uem.din.veiculos.modelo;

public class Automovel extends Veiculo {

    private final int KM = 10;
    private final int VELOCIDADE = 5;

    @Override
    public void deslocar() {
        if (this.getEstado().equals(Estado.PARADO)) {
            this.setEstado(Estado.MOVIMENTO);
        }
        this.setQuilometragem(KM);
    }

    @Override
    public void acelerar() {
        if (this.getEstado().equals(Estado.MOVIMENTO)) {
            this.setVelocidade(VELOCIDADE);
        }
    }

    @Override
    public void frear() {
        this.setEstado(Estado.PARADO);
    }
}
