public class Shape {

    private Point location ;

    public Shape(Point location) {
        this.location = location;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "location=" + location +
                '}';
    }

    public int area(){
        return 0;
    }

    public premeter(){

        return 0;
    }
}
