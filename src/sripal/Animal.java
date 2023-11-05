package sripal;





class Dog{

public void color(){

System.out.println("black and white");

}
}
class Puppydog extends Dog{



public void color(){

super.color();
System.out.println("red");

}

}

public class Animal {
	public static void main(String[]args){

		Dog d = new Puppydog();

		d.color();

		}

}
