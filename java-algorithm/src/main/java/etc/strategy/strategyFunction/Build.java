package etc.strategy.strategyFunction;

import etc.strategy.strategyInterface.WorkStrategy;

public class Build implements WorkStrategy {

    @Override
    public void work() {
        System.out.println("건물을 짓는다 !!");
    }
}
