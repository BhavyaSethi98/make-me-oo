package org.oop;

public class Point {
    private final double x;
    private final double y;

    public static double distance(Point from, Point to) {
        double xDistance = getDistance(to.x, from.x);
        double yDistance = getDistance(to.y, from.y);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    private static double getDistance(double point1, double point2) {
        return point1 - point2;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double direction(Point from, Point to) {
        double xDistance = getDistance(to.x, from.x);
        double yDistance = getDistance(to.y, from.y);
        return Math.atan2(yDistance, xDistance);
    }
}
