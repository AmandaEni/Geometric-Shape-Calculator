public class Triangle extends GeometricObject{
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle(){}

    public Triangle(double side1, double side2, double side3){
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    public double getSide1(){
        return this.side1;
    }

    public double getSide2(){
        return this.side2;
    }

    public double getSide3(){
        return this.side3;
    }

    public double getArea(){
        double s = (this.side1 + this.side2 + this.side3) / 2;
        double Area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
        return Area;
    }
    public double getPerimeter(){
        return (this.side1 + this.side2 + this.side3);
    }

    @Override
    public String toString(){
        if (super.isFilled() == false){
            return "triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
        }
        else{
            return super.getColor() + " triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
        }
    }

    public boolean equals(Object obj){
        if ((obj instanceof Triangle)){
            Triangle other = (Triangle) obj;
            return (other.getPerimeter() == this.getPerimeter()) && (other.getArea() == this.getArea());
        }
        else{
            return false;
        }
    }
}
