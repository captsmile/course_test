package ru.parsentev.task_003;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Triangle {
    private static final Logger log = getLogger(Triangle.class);

    protected final Point first;
    protected final Point second;
    protected final Point third;

    public Triangle(final Point first, final Point second, final Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean exists() {
        throw new UnsupportedOperationException();
    }

    public double area() {
        double a = this.first.distanceTo(this.second);
        double b = this.first.distanceTo(this.third);
        double c = this.third.distanceTo(this.second);
        double p = (a+b+c)/2.0;
        double result;
        result = Math.round( Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        System.out.println(result);
        return result;

    }
}
