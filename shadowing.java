public class Shadowing  
{  
String car_name = "Ferrari";  
double price = 50000000;  
public void showCar()  
{  
String car_name = "Bugatti";  
long price = 43000000;  
System.out.println("Car Name: "+car_name);  
System.out.println("Price: "+price);  
}  
public static void main(String args[])  
{  
new Shadowing().showCar();  
}  
} 