package org.example;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3,4,3.3);

        System.out.println("\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                           "\t\t⠀⠀⠀⠀⠀⠀⠀⢀⣠⠶⠞⠛⠋⠉⠉⠉⠉⠙⠛⠳⠶⣄⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                           "\t\t⠀⠀⠀⠀⠀⣠⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢷⣄⠀⠀⠀⠀⠀\n" +
                           "\t\t⠀⠀⠀⢀⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢷⡀⠀⠀⠀\n" +
                           "\t\t⠀⠀⢠⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⡄⠀⠀\n" +
                           "\t\t⠀⠀⣾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣷⠀⠀\n" +
                           "\t\t⠀⢸⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡇⠀\n" +
                           "\t\t⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀\n" +
                           "\t\t⠀⢸⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡇⠀\n" +
                           "\t\t⠀⠀⢿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡿⠀⠀\n" +
                           "\t\t⠀⠀⠘⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠃⠀⠀\n" +
                           "\t\t⠀⠀⠀⠈⢷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡾⠁⠀⠀⠀\n" +
                           "\t\t⠀⠀⠀⠀⠀⠙⢷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡾⠋⠀⠀⠀⠀⠀\n" +
                           "\t\t⠀⠀⠀⠀⠀⠀⠀⠈⠙⠶⢦⣤⣄⣀⣀⣀⣀⣠⣤⡴⠶⠋⠁⠀⠀⠀⠀⠀⠀⠀\n" +
                           "\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("this is a circle\nwith a radius of "+circle.getRadius());
        System.out.println("the area of this circle is "+ circle.calculateArea());
        System.out.println("the circumference of this circle is "+ circle.calculateCircumference());

        System.out.println("\n ------------------------------------------------------\n");

        Rectangle rectangle = new Rectangle(2,2,2.2,4.4);
        System.out.println( "\t\t+----------------+\n" +
                            "\t\t|                |\n" +
                            "\t\t|                |\n" +
                            "\t\t|                |\n" +
                            "\t\t+----------------+\n");
        System.out.println("this is an rectangle\nwith a width of "+rectangle.getWidth()+" and a height of "+rectangle.getHeight());
        System.out.println("the area of this rectangle is "+ rectangle.calculateArea());
        System.out.println("the perimeter of this rectangle is "+ rectangle.calculateCircumference());

        System.out.println("\n ------------------------------------------------------\n");

        Triangle triangle = new Triangle(2,2,2.2,4.4);

        System.out.println("\t\t\t     /\\\n" +
                           "\t\t\t    /  \\\n" +
                           "\t\t\t   /    \\\n" +
                           "\t\t\t  /      \\\n" +
                           "\t\t\t /________\\");
        System.out.println("\nthis is an equilateral triangle\nwith a base of "+triangle.getBase()+" and a height of "+triangle.getHeight());
        System.out.println("the area of this equilateral triangle is "+ triangle.calculateArea());
        System.out.println("the Perimeter of this equilateral triangle is "+ triangle.calculateCircumference());


    }
}