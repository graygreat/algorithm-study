package etc.strategy.strategyFunction;

import etc.strategy.strategyInterface.WorkStrategy;

public class Wait implements WorkStrategy {

    @Override
    public void work() {
        System.out.println("대기중입니다 !!");
    }
}
