package park.calculators;

import park.calculators.interfaces.ICalculator;

public class DailyCalc implements ICalculator {
  private int dailyTax;

  public DailyCalc(int dailyTax) {
    this.dailyTax = dailyTax;
  }

  @Override
  public int calc(int value) {
    return this.dailyTax * (int) Math.ceil(value / 24.0);
  }
}
