
class Multithread extends Thread

{

public void run()

{

	try{

		System.out.println("Thread"+Thread.currentThread().getId()+"is running");

	}

	

	catch(Exception e){

		System.out.println("Exception is caught");

	}

	}

}



public class manisha

{

public static void main(String[] args)

{

int i,n=5;

for(i=0;i<5;i++)

{

Multithread m=new Multithread();

m.start();

}

}

}