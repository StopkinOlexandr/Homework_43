public class PrivateHouse extends House {

  public PrivateHouse(String address) {
    super(address);
  }

  @Override
  public void demolish() {
    super.demolish();
    System.out.println("Вы снесли частный дом");
  }

  @Override
  public String toString() {
    return String.format("Private house, address: %s ", getAddress());
  }
}

