package com.demo.test;
import java.util.Scanner;
import com.demo.service.ShapeService;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int choice=0;
        do {
        	System.out.println("1.Add New Shape\n2.Display All Shapes\n3.Display Shape By ID\n4.Calculate Area & Circumference\n6.Exit\nEnter Choice...");
        	choice = sc.nextInt();
        	switch(choice) {
        	case 1:
        		ShapeService.addNewShape();
        		break;
        	case 2:
        		ShapeService.displayAllShapes();
        		break;
        	case 3:
        		ShapeService.displayShapesByID();
        		break;
        	case 4:
        		String ca = ShapeService.calAreaAndCircum();
        		System.out.println(ca);
        		break;
        	case 6:
        		sc.close();
        		System.out.println("Thank You !!!");
        		break;
        	default:
        		System.out.println("Invalid Input");
        		break;
        	}
        }while(choice!=6);
	}

}
