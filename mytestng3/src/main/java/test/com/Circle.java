/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com;

/**
 *
 * @author Sweta
 */
public class Circle {
 private int radious;

    @Override
    public String toString() {
        return "Circle{" + "radious=" + radious + '}';
    }

    public Circle() {
    }

    public Circle(int radious) {
        this.radious = radious;
    }

    public int getRadious() {
        return radious;
    }

    public void setRadious(int radious) {
        this.radious = radious;
    }
 public float getArea(){
     return 3.14f * this.radious * this.radious;
     
 }
    
}
