void main() {
    Shape square = new Square(5);
    Shape triangle = new Triangle(5,6);
    Shape circle = new Circle(5);
    Shape[] figureArray = { square, triangle, circle };
    double sumOfAllAreas = 0.0;
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
