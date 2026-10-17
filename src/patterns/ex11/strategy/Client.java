package patterns.ex11.strategy;

import patterns.ex11.chainOfResponsability.Bancnota;
import patterns.ex11.chainOfResponsability.Bancomat;
import patterns.ex11.chainOfResponsability.HandlerBancnote;

public class Client implements IClient {
    private String nume;
    private IStrategieRetragere strategie;

    public Client(String nume) {
        this.nume = nume;
    }

    public void seteazaStrategie(IStrategieRetragere strategie) {
        this.strategie = strategie;
    }

    public void retrage(int suma, Bancnota b50, Bancnota b20, Bancnota b10) {
        HandlerBancnote lant = strategie.configureazaLant(b50, b20, b10);
        Bancomat bancomat = new Bancomat();
        bancomat.seteazaLant(lant);
        System.out.println("\n" + nume + " retrage " + suma + " RON:");
        bancomat.retrage(suma);
    }
}
