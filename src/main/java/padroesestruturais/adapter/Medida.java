package padroesestruturais.adapter;

public class Medida {

    InterfaceSistemaInternacional sistema;
    SistemaInternacionalAdapter persistencia;

    public Medida() {
        sistema = new SistemaMilhas();
        persistencia = new SistemaInternacionalAdapter(sistema);
    }

    public void setMilhas(float valor) {
        sistema.setMilhas(valor);
        //persistencia.salvarAvaliacao();
    }

    public void setKM(float valor) {
        //sistema.setKM(valor);
        persistencia.setKM(valor);
    }

    public float getMilhas(float valor) {
        return persistencia.ConverteParaMilhas(valor);
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public float getKM(float valor) {
        return persistencia.ConverteParaKM(valor);
    }
}
