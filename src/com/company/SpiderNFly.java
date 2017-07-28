package com.company;

/**
 * Created by user on 28.07.2017
 */
public class SpiderNFly {

    static double findRoute(double[] sizeArray, double flyX, double flyY, double spiderX, double spiderY, double spiderZ) {
        if (spiderZ == 0) {
            return findDistance(flyX, flyY, spiderX, spiderY);
        } else if (spiderX == 0) {
            return findDistance(-spiderZ, spiderY, flyX, flyY);
        } else if (spiderX == sizeArray[0]) {
            return findDistance(sizeArray[0] + spiderZ, spiderY, flyX, flyY);
        } else if (spiderY == 0) {
            return findDistance(flyX, flyY, spiderX, -spiderZ);
        } else if (spiderY == sizeArray[1]) {
            return findDistance(flyX, flyY, spiderX, spiderZ + sizeArray[1]);
        } else {
            return findDistance(3 * sizeArray[1] - spiderX, spiderY, flyX, flyY);
        }
    }

    static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
