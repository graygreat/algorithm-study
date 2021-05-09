package etc.godOfJava.chapter23;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker randomNumberMaker = new RandomNumberMaker();
        for (int i = 0; i < 10; i++) {
            System.out.println(randomNumberMaker.getSixNumber());
        }
    }

    public HashSet<Integer> getSixNumber() {
        HashSet<Integer> randomSet = new HashSet<>();
        Random random = new Random();

        while (randomSet.size() <= 6) {
            int tempNumber = random.nextInt(45);
            randomSet.add(tempNumber);
        }

        return randomSet;
    }
}
