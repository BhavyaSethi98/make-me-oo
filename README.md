So Shivam had just learned about OOP. He had written a program before that did two things,
- Find distance between two points
- Find direction (angle) between two points in Radians.

He has this code in the `org.procedural.DistanceAndDirectionCalculator` It looks like this for the reference - 

```java
public class DistanceAndDirectionCalculator {
    public static double distance(double x1, double y1, double x2, double y2) {
        double xDistance = x1 - x2;
        double yDistance = y1 - y2;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(double x1, double y1, double x2, double y2) {
        double xDistance = x2 - x1;
        double yDistance = y2 - y1;
        return Math.atan2(yDistance, xDistance);
    }
}
```
He thought it'll be a good idea to convert this to Object Oriented Programming. So he wrote a new implementation in package `org.oop`, he got 2 classes - 
- `org.oop.DistanceAndDirectionCalculator`
- `org.oop.Point`

However, his trainer told him that what he did is not Object Oriented programming and asked Shivam to try again. 
- Try to articulate problems with Shivam's OOP solution. (Write it somewhere and share it with your trainer)
- Fork the project and fix the design related problem with Shivam's OOP solution. Share that with your trainer too.

-------------------------------------------------------------------------------------------------------------------
Problems With Shivam's OOP Solution

1-There is no Encapsulation as there is a file in source code named point that doesn't have any related methods it has only properties of that class on the other hand class named DistanceAndDirectionCalculator has only related methods and no properties of that class.
2-Abstraction :setters and getters breaks abstraction and is also not a good practice to follow this is because even if the the class fields are made private these fields can be accessed outside the class.
3-Setters are unused
4-Point class fields are not made final thus can be changed
5-AAA format is not followed in test case file named DistanceAndDirectionCalculatorTest
