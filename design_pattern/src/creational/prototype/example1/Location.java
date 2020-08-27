package creational.prototype.example1;

public class Location implements Cloneable {
    StringBuilder street;
    int roomNo;

    @Override
    public String toString() {
        return "Location{" +
                "street.hashCode='" + street.hashCode() + '\'' +
                ", roomNo=" + roomNo +
                '}'+super.toString();
    }

    public Location(String street, int roomNo) {
        this.street = new StringBuilder("123");
        this.roomNo = roomNo;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
