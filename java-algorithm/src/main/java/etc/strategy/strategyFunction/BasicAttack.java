package etc.strategy.strategyFunction;

import etc.strategy.strategyInterface.AttackStrategy;

public class BasicAttack implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("기본 공격을 합니다 !!");
    }
}
