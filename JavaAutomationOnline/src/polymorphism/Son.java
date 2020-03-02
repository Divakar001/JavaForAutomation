package polymorphism;

public class Son extends Parents {
	
	//method overriding example
@Override
public void marriage() {
	System.out.println("my marriage my rules");
}
	public static void main(String[] args) {
		Parents parent=new Son();
		parent.properties();
		parent.marriage();
		

	}

}
 