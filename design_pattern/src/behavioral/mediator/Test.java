package behavioral.mediator;

public class Test {
	public static void main(String[] args) {
		User tom = new User("Tom");
		User jack = new User("jack");
		tom.sendMessage("hello,everyone!");
		jack.sendMessage("hi,Tom!");
	}

}
