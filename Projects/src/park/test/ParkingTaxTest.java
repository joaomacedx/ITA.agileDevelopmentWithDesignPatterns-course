package park.test;
import static org.junit.Assert.assertEquals;

import org.junit.*;

import park.calculators.HourCalc;
import park.calculators.HourCalcWithInitialValue;
import park.taxes.*;

public class ParkingTaxTest {
  @Test
  public void fixedPerHourTax(){
      // Arrange
      int hoursParked = 3;
      int hoursPrice = 4;
      ParkingTax tax =   
          new ParkingTax(hoursParked, new HourCalc(hoursPrice));
      // Act 
      int value = tax.value();
      // Assert
      assertEquals(12, value);
  }
  @Test
  public void rateWithInitialValueAndAfterSpecificTimeFixedPerHour(){
    // Arrange
    int hoursParked = 5;
    int initialValue = 5;
    int toleranceTime = 3;
    int valuePerHour = 2;
    ParkingTax tax =   
      new ParkingTax(hoursParked,
        new HourCalcWithInitialValue(
          initialValue, 
          toleranceTime, 
          valuePerHour
        )
      );
    // Act 
    int value = tax.value();
    // Assert
    assertEquals(9, value);
  }
  @Test
  public void rateWithInitialValueAndAtTheHourLimit(){
    // Arrange
    int hoursParked = 2;
    int initialValue = 5;
    int toleranceTime = 3;
    int valuePerHour = 2;
    ParkingTax tax =   
        new ParkingTax(hoursParked,
            new HourCalcWithInitialValue(initialValue, toleranceTime, valuePerHour));
    // Act 
    int value = tax.value();
    // Assert
    assertEquals(5, value);
  }
}
