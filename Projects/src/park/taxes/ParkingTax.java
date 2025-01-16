package park.taxes;

import park.calculators.interfaces.ICalculator;

public class ParkingTax {
  private int hoursParked;
  private ICalculator calculator;

  public ParkingTax(int hoursParked, ICalculator calculator) {
    this.hoursParked = hoursParked;
    this.calculator = calculator;
  }

  public int value() {
    return calculator.calc(hoursParked);
  }
}
