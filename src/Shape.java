public class Shape {
    private  static String name;
    private  static double area;
    public Shape(String name) {
        this.name = name;
    }
    public void draw() {
        IO.println(String.format("Drawing Shape %s", name));
    }
    public double area() {
        return area;
    }
}
