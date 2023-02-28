// Written by Ahmed Shahkhan, shahk005 and Akshay Peddi, peddi022
// FractalDrawer class draws a fractal of a shape indicated by user input
// helper function that caculates the areas.

import java.awt.Color;

import java.util.Scanner;

public class FractalDrawer {

    private double totalArea = 0; // member variable for tracking the total area

    Color[] colorArr = {Color.BLUE, Color.GREEN, Color.ORANGE, Color.MAGENTA, Color.DARK_GRAY, Color.BLACK, Color.GRAY, Color.MAGENTA};

    public FractalDrawer() {}
    // Jacob [TA] said leave to this empty.
    
    public double drawFractal(String type) { // draws Fractal based on shape and returns totalArea

        Canvas drawing = new Canvas(800, 800);

        if (type.equals("triangle")) {

            drawTriangleFractal(300, 300, 250, 400, Color.MAGENTA, drawing, 0);
        }

        else if (type.equals("circle")) {

            drawCircleFractal(100, 400, 400, Color.MAGENTA, drawing, 0);
        }

        else if (type.equals("rectangle")) {

            drawRectangleFractal(150, 135, 250, 400, Color.MAGENTA, drawing, 0);
        }

        return totalArea;

    }

    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) { // draws the Triangle Fractal and computes total area of all triangles drawn

        if (level < 7) {

            c = colorArr[level];

            Triangle myTriangle = new Triangle(x, y, width, height, c);

            myTriangle.setColor(c);

            can.drawShape(myTriangle);

            drawTriangleFractal(width / 2, height / 2, x + (width / 4), y + (height / 2), c, can, level + 1);

            drawTriangleFractal(width / 2, height / 2, x - (width / 4), y - (height / 2), c, can, level + 1);

            drawTriangleFractal(width / 2, height / 2, x + (3 * width / 4), y - (height / 2), c, can, level + 1);

            double singleArea = myTriangle.calculateArea();

            totalArea += singleArea;

        }

    }

    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) { // draws the Circle Fractal and computes total area of all circles drawn

        if (level < 7) {

            c = colorArr[level];

            Circle myCircle = new Circle(x, y, radius, c);

            myCircle.setColor(c);

            can.drawShape(myCircle);

            drawCircleFractal(radius / 2, x - ((3*radius)/2), y + 0, c, can, level + 1);

            drawCircleFractal(radius / 2, x + ((3*radius)/2), y + 0, c, can, level + 1);

            drawCircleFractal(radius / 2, x + 0, y - ((3*radius)/2) , c, can, level + 1);

            drawCircleFractal(radius / 2, x + 0, y + ((3*radius)/2), c, can, level + 1);

            double singleArea = myCircle.calculateArea();

            totalArea += singleArea;

        }

    }

    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) { // draws the rectangle Fractal and computes total area of all rectangles drawn

        if (level < 7) {

            c = colorArr[level];

            Rectangle myRectangle = new Rectangle(x, y, width, height, c);

            myRectangle.setColor(c);

            can.drawShape(myRectangle);

            drawRectangleFractal(width/2, height/2, x - (width * 0.5), y - (height * 0.5), c, can, level + 1);

            drawRectangleFractal(width/2, height/2, x - (width * 0.5), y + height, c, can, level + 1);

            drawRectangleFractal(width/2, height/2, x + width, y - (0.5 * height), c, can, level + 1);

            drawRectangleFractal(width/2, height/2, x + width, y + height, c, can, level + 1);

            double singleArea = myRectangle.calculateArea();

            totalArea += singleArea;

        }

    }

    public static void main(String[] args) { // main method to draw Fractal and print out Area

        Scanner s = new Scanner(System.in);
        System.out.println("What shape do you want to draw?");
        String shape = s.next();
        FractalDrawer var = new FractalDrawer();
        System.out.println(var.drawFractal(shape));
        //var.drawFractal(shape);

    }

}