public class TriangleTester {
    public static void main(String args[]){
        EquilateralTriangle tryGuy = new EquilateralTriangle(9);
        System.out.println("perimeter = "+ tryGuy.getPerimeter()+" Area = "+tryGuy.getArea());
        RightTraingle keith = new RightTraingle(9);
        System.out.println("perimeter = "+ keith.getPerimeter()+" Area = "+keith.getArea());
        if (keith.getCircle()>tryGuy.getCircle()){
            System.out.println("right");

        }
        else{System.out.println("equaliateral");}
    }
}
