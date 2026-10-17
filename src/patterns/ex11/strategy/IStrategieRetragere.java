package patterns.ex11.strategy;

import patterns.ex11.chainOfResponsability.Bancnota;
import patterns.ex11.chainOfResponsability.HandlerBancnote;

public interface IStrategieRetragere {
    HandlerBancnote configureazaLant(Bancnota b50, Bancnota b20, Bancnota b10);
}
