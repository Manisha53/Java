import java.util.*;
class abbre{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of words:");
		int n=sc.nextInt();
		System.out.println("Enter the words:");
		for(int i=0;i<=n;i++){
		String a=sc.nextLine();
		int l=a.length();
		if(l<=10){
			System.out.println(a);
		}
		else{
			System.out.print(a.charAt(0));
			System.out.print(String.valueOf(l-2));
			System.out.println(a.charAt(l-1));
		}

		}
		
	}
}