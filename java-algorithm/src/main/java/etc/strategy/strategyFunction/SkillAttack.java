package etc.strategy.strategyFunction;

import etc.strategy.strategyInterface.AttackStrategy;

public class SkillAttack implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("스킬 공격을 합니다 !!");
    }
}
