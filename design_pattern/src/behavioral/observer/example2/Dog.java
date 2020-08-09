package behavioral.observer.example2;

public class Dog implements Observer {

	public void wang() {
        System.out.println("dog wang...");
    }
	@Override
	public void actionOnWakeUp(WakeUpEvent event) {
		wang();
	}

}
