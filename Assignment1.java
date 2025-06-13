/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author samue
 */
public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the number of walls, height and width(in order): ");
        double numWalls = input.nextDouble();
        double wallHeight = input.nextDouble();
        double wallWidth = input.nextDouble();
        
        System.out.print("What is the number of doors, height and width(in order): ");
        double numDoor = input.nextDouble();
        double doorHeight = input.nextDouble();
        double doorWidth = input.nextDouble();
        
        System.out.print("What is the number of windows, height and width(in order): ");
        double numWind = input.nextDouble();
        double windHeight = input.nextDouble();
        double windWidth = input.nextDouble();
        
        System.out.print("What is the price of the paint? ");
        double pricePaint = input.nextDouble();
        
        double sqrftWall = numWalls * wallHeight * wallWidth;
        double sqrftDoor = numDoor * doorHeight * doorWidth;
        double sqrftWindow = numWind * windHeight * windWidth;
        double totalPaintArea = sqrftWall - sqrftDoor - sqrftWindow;
        double numGallons = totalPaintArea / 300;
        double durationLabour = numGallons * 8;
        double costPaint = numGallons * pricePaint;
        double labourCharges = durationLabour * 20;
        double priceTotalJob = costPaint + labourCharges;
        
        System.out.printf("The size of your wall in SqrFt is: %.2f\n", sqrftWall);
        System.out.printf("The total area of you door(s) is: %.2f\n", sqrftDoor);
        System.out.printf("The total area of your window(s) is: %.2f\n", sqrftWindow);
        System.out.printf("Resulting in a total of painted area in Square Ft %.2f\n", totalPaintArea);
        System.out.printf("The number of gallons necessary will be: %.2f\n", numGallons);
        System.out.printf("The total duration of the labour is, in hours/minutes: %.2f\n ", durationLabour);
        System.out.printf("The cost on the paint will be: %.2f\n", costPaint);
        System.out.printf("The total for the labour charges is: %.2f\n", labourCharges);
        System.out.printf("So the total for the paint job will be, in dollars: %.2f ", priceTotalJob);
       
        input.close();
    }
}