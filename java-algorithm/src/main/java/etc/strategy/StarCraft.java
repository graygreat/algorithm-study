package etc.strategy;

import etc.strategy.strategyFunction.*;

import java.util.ArrayList;
import java.util.List;

public class StarCraft {

    public List<Unit> startGame() {
        List<Unit> drones = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            drones.add(new Unit(new Mine(), new Walk(), new BasicAttack()));
        }
        return drones;
    }

    public void mineMineral(List<Unit> units) {
        // 이동 후 미네랄 채굴
        for (int i = 0; i < 4; i++) {
            System.out.println("======== 일꾼" + (i + 1) + " ========");
            units.get(i).move();
            units.get(i).work();
        }
        System.out.println();
    }


    public void makeBuilding(List<Unit> unit, int number) {
        // 스포닝풀 생산
        System.out.println((number + 1) + "번째 유닛 건물 생성");
        unit.get(number).setWorkStrategy(new Build());
        unit.get(number).work();
        System.out.println();
    }

    // 유닛 생산
    public void produceUnit(int unitNumber) {
        List<Unit> zerglings = new ArrayList<>();

        System.out.println("저글링 " + unitNumber + "마리 생성");
        for (int i = 0; i < unitNumber; i++) {
            zerglings.add(new Unit(new Wait(), new Run(), new BasicAttack()));
        }

        for (int i = 0; i < unitNumber; i++) {
            System.out.println("======== 저글링" + (i + 1) + " ========");
            zerglings.get(i).attack();
        }
    }

    public void run() {
        List<Unit> initUnit = startGame();
        mineMineral(initUnit);

        makeBuilding(initUnit, 1);
        produceUnit(6);
    }

    public static void main(String[] args) {
        StarCraft starCraft = new StarCraft();
        starCraft.run();
    }
}