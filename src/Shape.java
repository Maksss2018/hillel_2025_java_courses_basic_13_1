public class Shape {
    //protected String name;
    protected double area;

    public void draw(Shape obj) {

        IO.println(String.format("Drawing Shape "+obj.getClass().getName()));
    }
    public double area() {
        return this.area;
    }
}
