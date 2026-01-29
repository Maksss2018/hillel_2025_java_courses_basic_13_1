void main() {
    Shape square = new Square(5);
    Shape triangle = new Triangle(5,6);
    Shape circle = new Circle(5);
    Shape[] figureArray = { square, triangle, circle };

    for (Shape s : figureArray) {
        IO.println("=====================================");
        s.draw();
        IO.println("area: "+s.area());
        IO.println("=====================================");
    }
}
