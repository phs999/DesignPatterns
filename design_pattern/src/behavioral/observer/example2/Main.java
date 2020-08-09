package behavioral.observer.example2;

public class Main {
	public static void main(String[] args) {
		Child child=new Child();
		Mum mum=new Mum();
		Dad dad=new Dad();
		Dog dog=new Dog();
		child.addObserver(dog);
		child.addObserver(dad);
		child.addObserver(mum);
		
		child.wakeUp();
	}
}
