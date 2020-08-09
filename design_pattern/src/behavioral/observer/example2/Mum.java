package behavioral.observer.example2;

public class Mum implements Observer {

	public void feed() {
        System.out.println("mum feeding...");
    }
	@Override
	public void actionOnWakeUp(WakeUpEvent event) {
		feed();
	}

}
