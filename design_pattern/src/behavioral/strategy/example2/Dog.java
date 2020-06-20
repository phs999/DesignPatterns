package behavioral.strategy.example2;

public class Dog implements Comparable<Dog>{
	int speed;
	public Dog(int speed) {
		this.speed=speed;
	}
	@Override
	public int compareTo(Dog dog) {
		if (this.speed<dog.speed) {
			return -1;
		}else if (this.speed>dog.speed) {
			return 1;
		}else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "Dog [speed=" + speed + "]";
	}
	
	

}
