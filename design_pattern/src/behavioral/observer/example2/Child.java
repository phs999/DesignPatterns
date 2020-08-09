package behavioral.observer.example2;

import java.util.ArrayList;
import java.util.List;

public class Child {
	private boolean cry = false;
	  private List<Observer> obs = new ArrayList<>();

		 public synchronized void addObserver(Observer o) {
		        if (o == null)
		            throw new NullPointerException();
		        if (!obs.contains(o)) {
		            obs.add(o);
		        }
		    }
  
//    {
//        observers.add(new Dad());
//        observers.add(new Mum());
//        observers.add(new Dog());
//        observers.add((e)->{
//            System.out.println("ppp");
//        });
//        //hook callback function
//    }
    
    


    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;

        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed", this);

        for(Observer o : obs) {
            o.actionOnWakeUp(event);
        }
    }
}
