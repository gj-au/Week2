package prereq;

import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      double base1;
      double base2;
      double height1;
      double height2;

      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
      base1 = scnr.nextDouble();
      height1 = scnr.nextDouble();
      triangle1.setBase(base1);
      triangle1.setHeight(height1);

      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
      base2 = scnr.nextDouble();
      height2 = scnr.nextDouble();
      triangle2.setBase(base2);
      triangle2.setHeight(height2);

      // TODO: Determine larger triangle (use getArea())
      
      Triangle largestTriangle;
      if (triangle1.getArea() > triangle2.getArea()) {
            largestTriangle = triangle1;
      } else {
            largestTriangle = triangle2;
      }


      System.out.println("Triangle with larger area:");
      // TODO: Output larger triangle's info (use printInfo())
      largestTriangle.printInfo();
   
      scnr.close();
   }
}
