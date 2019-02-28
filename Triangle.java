// Chapter 12 Question 6

public abstract class Triangle
{
    protected double side;

    public Triangle( double side)
    {

        this.side = side;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public double getRatio()
    {
        return getArea()/getPerimeter();
    }
    public double getCircle() {return getArea()/(getPerimeter()*.5);}


}
