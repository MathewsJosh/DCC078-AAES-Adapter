package padroesestruturais.adapter;

public class SistemaMilhas implements InterfaceSistemaInternacional {

    private float valor;

    public float getMilhas() {
        return this.valor;
    }

    @Override
    public void setMilhas(float valor) {
        this.valor = valor;
    }
}
