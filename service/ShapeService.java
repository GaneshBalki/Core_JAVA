package com.demo.service;

import com.demo.beans.Shapes;
import com.demo.beans.Rectangle;
import com.demo.beans.Circle;
import com.demo.beans.Triangle;
import com.demo.beans.Square;
import java.util.Scanner;
public class ShapeService {
   private static Shapes [] sarr;
   private static int count;

   static {
	   sarr = new Shapes[10];
	   count=0;
   }
   
   public static void addNewShape() {
	  Scanner sc = new Scanner(System.in);
	   System.out.println("1.Rectangle\n2.Circle\n3.Triangle\n4.Square\nEnter Shape You Want to Store...");
	   int choice = sc.nextInt();
	   System.out.println("Enter Color For Shape...");
	   String color = sc.next();
	   switch(choice) {
	   case 1:
		   System.out.println("Enter Heigth ");
		   int height = sc.nextInt();
		   System.out.println("Enter Width ");
		   int width = sc.nextInt();
		   sarr[count] = new Rectangle("RTA-"+(count+1),color,height,width);
		   count++;
		   break;
	   case 2:
		   System.out.println("Enter Radius ");
		   int rad= sc.nextInt();
		   sarr[count] = new Circle("CRL-"+(count+1),color,rad);
		   count++;
		   break;
	   case 3:
		   System.out.println("Enter Heigth ");
		   height = sc.nextInt();
		   System.out.println("Enter Base ");
		   int base = sc.nextInt();
		   System.out.println("Enter Side 1 ");
		   int s1 = sc.nextInt();
		   System.out.println("Enter Side 2 ");
		   int s2 = sc.nextInt();
		   sarr[count] = new Triangle("TRI-"+(count+1),color,height,base,s1,s2);
		   count++;
		   break;
	   case 4:
		   System.out.println("Enter Side 1 ");
		   s1 = sc.nextInt();
		   sarr[count] = new Square("SQR-"+(count+1),color,s1);
		   count++;
		   break;
	   }
   }

public static void displayAllShapes() {
	for(int i = 0;i<count;i++) {
		System.out.println(sarr[i]);
	}
	
}
private static int searchObj(String id) {
    for(int i = 0;i<count;i++) {
    	if(sarr[i].getID().equals(id)) {
			return i;
		}
	}
	return -1;
}
 public static void displayShapesByID() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Shape ID...");
	    String id = sc.next();
	 for(int i = 0;i<count;i++) {
			if(sarr[i].getID().equals(id)) {
				System.out.println(sarr[i]);
				return;
			}
		}
	 System.out.println("ID Not Found");
	
}

public static String calAreaAndCircum() {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter Shape ID...");
    String id = sc.next();
    int index = searchObj(id);
    if(index!=-1) {
    	float area=sarr[index].calArea();
    	float cir=sarr[index].calCircum();
    	return "ID : "+id+"\nArea : "+area+"\nCircum : "+cir;
    }
    else {
    	return "ID Not Found";
    }
}

}
