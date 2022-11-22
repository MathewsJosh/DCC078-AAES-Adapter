package padroesestruturais.adapter;

public class SistemaInternacionalAdapter extends SistemaKM {

    private InterfaceSistemaInternacional sistemaMilhas;

    public SistemaInternacionalAdapter(InterfaceSistemaInternacional sistemaMilhas) {
        this.sistemaMilhas = sistemaMilhas;
    }

    public float ConverteParaMilhas(float valor) {
        sistemaMilhas.setMilhas(valor * 0.621371f);
        return sistemaMilhas.getMilhas();
    }

    public float ConverteParaKM(float valor) {
        this.setKM(valor * 1.60934f);
        return this.getKM();
    }
}
