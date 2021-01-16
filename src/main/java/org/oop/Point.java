package org.oop;

public class Point {
    private final double x;
    private final double y;

    private static double getDistance(double coordinate1, double coordinate2) {
        return coordinate1 - coordinate2;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point to) {
        Point from = this;
        double xDistance = getDistance(to.x, from.x);
        double yDistance = getDistance(to.y, from.y);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double directionTo(Point to) {
        Point from = this;
        double xDistance = getDistance(to.x, from.x);
        double yDistance = getDistance(to.y, from.y);
        return Math.atan2(yDistance, xDistance);
    }
}
