class test{
	public static void main(String[] args) {
		try{
	int num=Integer.parseInt("Tow thousand");
}catch(NumberFormatException e){
	System.out.println("no");
}catch(Exception e){
	System.out.println("wrong");
}
finally{
	System.out.println("execution");
}
	}
}
