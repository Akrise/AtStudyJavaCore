package homework_solution.lesson9.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Factory {
    static HashMap<Brand, Integer> brandCounter = new HashMap<>();
    static int regularCounter = 0;
    static int premiumCounter = 0;

    public Factory() {
        brandCounter.put(Brand.MERCEDES, 0);
        brandCounter.put(Brand.MITSUBISHI, 0);
        brandCounter.put(Brand.NISSAN, 0);
        brandCounter.put(Brand.RENAULT, 0);
    }

    public Car make() {
        int chance = new Random().nextInt(100);
        if (chance < 40) {
            brandCounter.put(Brand.RENAULT, brandCounter.get(Brand.RENAULT) + 1);
            regularCounter++;
            return new Renault();
        }
        if (40 < chance && chance < 70) {
            brandCounter.put(Brand.NISSAN, brandCounter.get(Brand.NISSAN) + 1);
            regularCounter++;
            return new Nissan();
        }
        if (70 < chance && chance < 90) {
            brandCounter.put(Brand.MITSUBISHI, brandCounter.get(Brand.MITSUBISHI) + 1);
            regularCounter++;
            return new Mitsubishi();
        }
        brandCounter.put(Brand.MERCEDES, brandCounter.get(Brand.MERCEDES) + 1);
        premiumCounter++;
        return new Mercedes();
    }

    public void printStatistics() {
        for (Map.Entry entry : brandCounter.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("Regular cars produced total: " + regularCounter);
        System.out.println("Premium cars produced total: " + premiumCounter);
    }
}
