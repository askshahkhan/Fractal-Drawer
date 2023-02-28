// Written by Ahmed Shahkhan, shahk005 and Akshay Peddi, peddi022

import java.awt.Color;
import java.lang.Math;

class Circle{

    double x;
    double y;
    double radius;
    Color color;

    public Circle(double x, double y, double radius, Color color){ // constructor
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public double calculatePerimeter(){ // Returns rectangle perimeter
        return 2*Math.PI*radius;
    }

    public double calculateArea(){ // Returns rectangle area
        return Math.PI*radius*radius;
    }

    public void setColor(Color newColor){ // Color setter
        color = newColor;
    }

    public void setPos(double newX, double newY){ // x and y position setter
        x = newX;
        y = newY;
    }

    public void setRadius(double newRadius){ // Setter for radius
        radius = newRadius;
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

    public double getRadius(){ // returns radius
        return radius;
    }

}