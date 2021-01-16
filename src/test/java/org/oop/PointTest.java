package org.oop;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PointTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);

        double actualDistance = Point.distance(origin, origin);

        assertEquals(0, actualDistance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);

        double distanceFromPoint1 = Point.distance(origin, point1);
        double distanceFromPoint2 = Point.distance(origin, point2);

        assertEquals(1, distanceFromPoint1);
        assertEquals(1, distanceFromPoint2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        double actualDistance = Point.distance(point1, point2);

        assertEquals(2, actualDistance);
    }

    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        double directionOfPoint1FromOrigin = Point.direction(origin, point1);
        double directionOfPoint2FromOrigin = Point.direction(origin, point2);

        assertEquals(0, directionOfPoint1FromOrigin);
        assertEquals(0, directionOfPoint2FromOrigin);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        double directionOfPoint1FromOrigin = Point.direction(origin, point1);
        double directionOfPoint2FromOrigin = Point.direction(origin, point2);

        assertEquals(Math.PI, directionOfPoint1FromOrigin);
        assertEquals(Math.PI, directionOfPoint2FromOrigin);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        double directionOfPoint1FromOrigin = Point.direction(origin, point1);
        double directionOfPoint2FromOrigin = Point.direction(origin, point2);

        assertEquals(Math.PI / 2, directionOfPoint2FromOrigin);
        assertEquals(Math.PI / 2, directionOfPoint1FromOrigin);
    }
}
