class AnnoP{
	@Deprecated
	public void depM()
	{
		System.out.println("Deprected Method...");
	}
	public void ovR(){
		System.out.println("Annop");
	}
}
class AnnoC extends AnnoP{
	@Override
	public void ovR(){
		System.out.println("Annoc");
	}
}
public class Lab6P2{
	@SuppressWarnings("Deprecation")
	public static void main(String...args){
		AnnoC ac = new AnnoC();	
		ac.ovR();
		ac.depM();
	}	
}					
