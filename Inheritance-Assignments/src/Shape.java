public class Shape {
    private String color = "red";
    private Boolean filled = true;

    public Shape(){}

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if (filled == true)
        {
            return ("A shape with color of " + color + ", and filled" );
        }
        else
        {
            return ("A shape with color of " + color + ", and not filled" );
        }
    }
}
