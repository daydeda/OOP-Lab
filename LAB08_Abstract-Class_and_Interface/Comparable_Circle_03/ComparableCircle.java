package Comparable_Circle_03;

class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override // Implement the compareTo method defined in Comparable
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius())
            return 1;
        else if (getRadius() < o.getRadius())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "ComparableCircle with radius: " + getRadius();
    }
}