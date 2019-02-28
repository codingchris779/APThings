class EquilateralTriangle extends Triangle{
    public EquilateralTriangle( double side) {
        super( side);
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) / 4 * side * side;
    }
}