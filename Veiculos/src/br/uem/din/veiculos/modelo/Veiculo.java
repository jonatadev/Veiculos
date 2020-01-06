package br.uem.din.veiculos.modelo;

public abstract class Veiculo {

    private int velocidade;
    private int quilometragem;
    private Estado estado;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade += velocidade;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem += quilometragem;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public abstract void deslocar();

    public abstract void acelerar();

    public abstract void frear();
}
