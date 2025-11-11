import java.util.Scanner;
class Lab3P4{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String y = sc.next();
	 	Lab3P5 l = new Lab3P4();
	 	Lab3P5 l1 = new Lab3P4(x);
	 	Lab3P5 l2= new Lab3P4(x,y);
	 	
	 
	 	}
	 	Lab3P4(){
	 		System.out.println("Constructor without params ");
	 	}
	 	Lab3P4(int x){
	 		System.out.println("Constructor with int params : "+ x);
	 	} 	
    Lab3P4(String y){
       	 		System.out.println("Constructor with String params : "+ y);
    }
	 	Lab3P4(int x,String y){
	 		System.out.println("Constructor with int , string params : "+x+" , "+y);
	 	}
	 	
}	 	
	 	
	 	
