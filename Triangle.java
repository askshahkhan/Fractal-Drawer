// Written by Ahmed Shahkhan, shahk005 and Akshay Peddi, peddi022
import java.awt.Color;
import java.lang.Math;

class Triangle{

    double x;
    double y;
    double width;
    double height;
    Color color;

    public Triangle(double x, double y, double width, double height, Color color){ //constructor
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double calculatePerimeter(){ // Returns rectangle perimeter
        return width + Math.sqrt((width*width)+4*(height*height));
    }

    public double calculateArea(){ // Returns rectangle area
        return 0.5*width*height;
    }

    public void setColor(Color newColor){ // Color setter
        color = newColor;
    }

    public void setPos(double newX, double newY){ // x and y position setter
        x = newX;
        y = newY;
    }

    public void setHeight(double newHeight){ // Height setter
        height = newHeight;
    }

    public void setWidth(double newWidth){ // Width setter
        width = newWidth;
    }

    public Color getColor(){ // returns color
        return color;
    }

    public double getXPos(){ // returns x position
        return x;
    }

    public double getYPos(){ // returns y position
        return y;
    }

    public double getHeight(){ // returns height
        return height;
    }

    public double getWidth(){ // returns width
        return width;
    }

}