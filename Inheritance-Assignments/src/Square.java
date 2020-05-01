public class Square extends Rectangle {
    private double side;

    public Square(){}

    public Square(double side){
        this.side = side;
    }

    public Square(double side,String color, boolean filled)
    {
        this.side = side;
        super.setColor(color);
        super.setFilled(filled);

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLength(side);
    }

    public String toString(){
        return ( "A square with side = " + side + "which is a subclass of " + super.toString());
    }







}
