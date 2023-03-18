public class PrivateHouse extends House {

  public PrivateHouse(String address) {
    super(address);
  }

  @Override
  public String toString() {
    String output = String.format("Private house, address: $s ", getAddress());
    return output;
  }
}

