public class Circles {
    private double radius;
    private String color;
    private double area;
    // Constructor
    public Circles(double radius, String color) {
        setRadius(radius);
        setColor(color);
        setArea(area);
    }

        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;

    }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
}
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        double radSquare = radius*radius;
        this.area = 3.141592653589793*radSquare;
            }
    }
