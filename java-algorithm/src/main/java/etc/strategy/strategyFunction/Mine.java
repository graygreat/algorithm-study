package etc.strategy.strategyFunction;

import etc.strategy.strategyInterface.WorkStrategy;

public class Mine implements WorkStrategy {

    @Override
    public void work() {
        System.out.println("미네랄을 채굴합니다 !!");
    }
}
