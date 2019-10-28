public class Triangle{
    private double base;
    private double height;

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    public Triangle(){

    }

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return 0.5 * base * height;
    }
}