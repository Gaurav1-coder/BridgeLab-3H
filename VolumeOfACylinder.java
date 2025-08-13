import java.util.Scanner;

public class VolumeOfACylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.printf("Volume of the cylinder with radius %.2f and height %.2f is: %.2f%n", radius, height, volume);
        
    }
}