import java.util.Scanner;
class Lab3P3{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String y = sc.next();
	 	Lab3P4 l = new Lab3P4();
	 	l.display();
	 	l.display(x);
    l.display(y);
	 	l.display(x,y);
	 	}
	 	public  void display(){
	 		System.out.println("Method without parameters");
	 	        }
	 		public void display(int x){
	 			System.out.println("Method with int parameter:"+ x);
	 		}
      public void display(String s){
              System.out.println("Method with string parameter:"+y);
              }
	 			public void display(int x,String y){
	 				System.out.println("Method with two parameters: " + x + " "+y);
	 		}
	 			
	
	
}
