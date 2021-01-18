public class Square extends Rectangle implements Colorable{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public void howtoColor(){
        System.out.println("Color all four sides...");
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    public static void main(String[] args) {
        Shape shapes[] = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(2.5,3.5);
        shapes[2] = new Square(2.7);

        for(Shape shape : shapes){
            if(shape instanceof Colorable){
                ((Colorable) shape).howtoColor();
            } else {
                System.out.println(shape.toString());
            }
        }
    }
}
