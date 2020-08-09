package behavioral.observer.example2;

public class Dad implements Observer {
	public void hug() {
        System.out.println("dad hugging...");
	}
	@Override
	public void actionOnWakeUp(WakeUpEvent event) {
		hug();
	}

}
