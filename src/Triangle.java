public class Triangle extends Shape{

    private Point topLeft;
    private double sideA , sideB;
    public static double counter = 0;
    public double  coubterForobject = 0;


    public Triangle(Point topLeft, int sideA, int sideB) {
        super(topLeft);
        setSideA(sideA);
        setSideB(sideB);
    }

    public Triangle(Point topLeft, int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            throw new IllegalArgumentException("Side cant be negative ");
        }
        else {
            this.sideA = sideA;
        }
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            throw new IllegalArgumentException("Side cant be negative")
        } else {
            this.sideB = sideB;
        }
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideB(Int sideC) {
        if (sideC < 0) {
            throw new IllegalArgumentException("Side cant be negative")
        } else {
            this.sideC = sideC;
        }
    }
    public double perimeter(){
        return  (sideA + sideB+ sideC);
    }
    public double area(){
        return (sideA*sideB)/2;
    }

    @Override
    public int perimeter(){

        return sideA + sideB+ sideC;
    }
}
}
