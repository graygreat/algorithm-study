package etc.strategy;

import etc.strategy.strategyInterface.AttackStrategy;
import etc.strategy.strategyInterface.MoveStrategy;
import etc.strategy.strategyInterface.WorkStrategy;

public class Unit {

    private WorkStrategy workStrategy;
    private MoveStrategy moveStrategy;
    private AttackStrategy attackStrategy;

    public Unit(WorkStrategy workStrategy, MoveStrategy moveStrategy, AttackStrategy attackStrategy) {
        this.workStrategy = workStrategy;
        this.moveStrategy = moveStrategy;
        this.attackStrategy = attackStrategy;
    }

    public void work() {
        workStrategy.work();
    }

    public void move() {
        moveStrategy.move();
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void setWorkStrategy(WorkStrategy workStrategy) {
        this.workStrategy = workStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}
