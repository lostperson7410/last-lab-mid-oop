public class Circle extends Shape {
     
    double r ;
    double PI = 3.14; 
    double area;


    public Circle(String name ,double r){
        super(name);
        this.area = Math.PI*r*r;    
    }

    /**
     * @param r the r to set
     */
    public void setR(double r) {
        this.r = r;
    }
    
    /**
     * @return the r
     */
    public double getR() {
        return r;
    }

    public double getArea(){
        return area; 
        }

}