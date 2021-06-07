package etc.strategy.strategyFunction;

import etc.strategy.strategyInterface.MoveStrategy;

public class Run implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("뛰어서 이동합니다 !!");
    }
}
