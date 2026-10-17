package patterns.ex11.strategy;

import patterns.ex11.chainOfResponsability.Bancnota;

public interface IClient {
    void seteazaStrategie(IStrategieRetragere strategie);
    void retrage(int suma, Bancnota b50, Bancnota b20, Bancnota b10);
}