/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ndebwoha.oop_examination;

/**
 *
 * @author Ndebwoha
 */
class QuadraticEquation {

    private double a;
     private  double b;
     private  double c;
 // Constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void calculateRoots() {
        double discriminant = b * b - 4 * a * c;
        double sqrtDiscriminant = Math.sqrt(Math.abs(discriminant));
        if (discriminant > 0) {
            // Two real and distinct roots
            double root1 = (-b + sqrtDiscriminant) / (2 * a);
            double root2 = (-b - sqrtDiscriminant) / (2 * a);
            System.out.println("The roots are real and distinct:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // One real root
            double root = -b / (2 * a);
            System.out.println("The root is real and repeated:");
            System.out.println("Root: " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = sqrtDiscriminant / (2 * a);
            System.out.println("The roots are complex and imaginary:");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
