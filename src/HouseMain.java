import java.util.ArrayList;
import java.util.List;

public class HouseMain {
  public static void main(String[] args) {
    List<House> houses = new ArrayList<>();
    House private1 = new PrivateHouse("Avenue 1");
    houses.add(private1);
    House private2 = new PrivateHouse("Avenue 2");
    houses.add(private2);
    House apartment1 = new ApartmentHouse("Street 1", 3);
    houses.add(apartment1);

  }
}
