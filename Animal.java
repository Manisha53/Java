import java.lang.*;
import java.util.*;
class Animal{                                    //class
	Animal(){									//constructor
		System.out.println("Animal");
	}
	void name(String a){					   //method
		System.out.println("This is: "+a);
	}
	public static void main(String[] args) {	//main
		Animal animal=new Animal();				//object
		Scanner scan=new Scanner(System.in);
		String n=scan.nextLine();
		animal.name(n);

	}
}