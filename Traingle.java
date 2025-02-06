//here we need to find the area of traingle with using the getter and setter mathod

public class Traingle {
    private double height;
    private double base;
    public Traingle(double height, double base) {
        this.height = height;;
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public double getBase(){
        return base;

    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void Area(double height, double base){
        double area = 0.5*height * base;
        System.out.println("The area of the traingle is " + area);

    }

}
