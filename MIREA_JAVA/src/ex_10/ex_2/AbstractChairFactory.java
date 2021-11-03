package ex_10.ex_2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicanChair createMagicChair();
    FunctionalChair createFunctionalChair();

}
