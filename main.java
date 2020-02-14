import java.util.ArrayList;

import com.sun.javafx.geom.Area;
public class main {

    public static void main(String[] args) {
      
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("B", 3.0);
        shapes[1] =  new Circle("C", 4.0); 
        shapes[2] =  new Circle("D", 5.0); 


    System.out.println("max Name is: "+main.findBiggest(shapes).getName());
    }


    private static Shape findBiggest(Shape[] shapes){
       // double max;
       Shape max = new Shape("");
        for(int i = 0 ;i < shapes.length;i++)
        {
            if(max.getArea() < shapes[i].getArea()){
                max = shapes[i];
            }
        }
        return max;
        // for(int i = 0; i < shapes.size();i++)
        // {
        //     if(shapes[i] > max)
        //     max = shapes[i].getClass();
        // }
    }
}