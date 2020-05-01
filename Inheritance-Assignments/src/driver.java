public class driver {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1.getColor());
        s1.isFilled();
        s1.setFilled(false);
        System.out.println(s1.toString());


        Circle c1 = new Circle("blue", false, 7.0);
        c1.setRadius(7.0);
        c1.setColor("Maroon");
        System.out.println("The radius is " + c1.getRadius());
        System.out.println("The perimeter is " + c1.getPerimeter());
        System.out.println(c1.getArea());
        System.out.println(c1.toString());

        System.out.println("\n\n\n\n");
        Rectangle r1 = new Rectangle(10.0,10.0,"Green",true);
        System.out.println("The perimeter is " + c1.getPerimeter());
        System.out.println("The area is " + r1.getArea());
        System.out.println(r1.toString());

        System.out.println("\n\n\n\n");
        Square sq1 = new Square(5.0,"blue",true);
        sq1.setLength(5.0);
        sq1.setWidth(5.0);
        System.out.println("The area is = " + sq1.getArea());
        System.out.println("The parameter is = " + sq1.getPerimeter());
        System.out.println(sq1.toString());


    }
}
