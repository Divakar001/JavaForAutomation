package polymorphism;

public class Waywetalk {

	//method overloading examples

	public void talk(Parents styleofTalking) {
		System.out.println("My son");
	}
	public void talk(Partner styleofTalking) {

		System.out.println("im single");
	}
	public void talk(Boss styleofTalking) {
		System.out.println("hai how are you");

	}

	public static void main(String[] args) {
		
		Waywetalk talk=new Waywetalk();
		Parents parents=new Parents();
		talk.talk(parents);

		Boss boss=new Boss();
		talk.talk(boss);
		
		Partner partner=new Partner();
		talk.talk(partner);
		
		
		
	}

}
