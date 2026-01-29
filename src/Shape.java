public class Shape {
    protected String name;
    protected double area;
    Shape(String shapeName) {
        this.name = shapeName;
    }
    public void draw() {
        IO.println(String.format("Drawing Shape %s", name));
    }
    public double area() {
        return this.area;
    }
}
