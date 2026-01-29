private final Shape square = new Square(5);
private final Shape triangle = new Triangle(5,6);
private final Shape circle = new Circle(5);
private final Shape[] figureArray = { square, triangle, circle };
private double sumOfAllAreas = 0.0;
public void main() {
    for (Shape s : figureArray) {
        sumOfAllAreas += s.area();
        IO.println("=====================================");
        s.draw(s);
      IO.println("area: "+s.area());
        IO.println("=====================================");
    }
    IO.println("=====================================");
    IO.println("=====================================");
    IO.println("total: "+sumOfAllAreas);
}