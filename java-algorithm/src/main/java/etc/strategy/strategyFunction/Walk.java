package etc.strategy.strategyFunction;

import etc.strategy.strategyInterface.MoveStrategy;

public class Walk implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("걸어서 이동합니다 !!");
    }
}
