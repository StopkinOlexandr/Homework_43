public class ApartmentHouse extends House {
  private int entrances;

  public void setEntrances(int entrances) {
    this.entrances = entrances;
  }

  public int getEntrances() {
    return entrances;
  }

  public ApartmentHouse(String address, int entrances) {
    super(address);
    this.entrances = entrances;
  }

  @Override
  public void demolish() {
    super.demolish();
    System.out.printf("Вы снесли многоквартирный дом. %d подъездов!%n", getEntrances());
  }

  @Override
  public String toString() {
    String output = String.format("Apartment house, address: %s, entrances: %d",
        getAddress(), getEntrances());
    return output;
  }
}

