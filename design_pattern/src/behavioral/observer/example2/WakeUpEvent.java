package behavioral.observer.example2;

public class WakeUpEvent extends Event<Child>{
	 long timestamp;
	    String loc;
	    Child source;

	    public WakeUpEvent(long timestamp, String loc, Child source) {
	        this.timestamp = timestamp;
	        this.loc = loc;
	        this.source = source;
	    }

	    @Override
	    Child getSource() {
	        return source;
	    }
}
