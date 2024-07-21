package org.group.dcost.util;

import java.util.Random;
import java.util.UUID;

public class Util {

    public static Integer getRandomValue() {
        Random random = new Random();
        return random.nextInt(50000) + 1000;
    }

    public static String getRandomUUID() {
        return UUID.randomUUID().toString();
    }


}
