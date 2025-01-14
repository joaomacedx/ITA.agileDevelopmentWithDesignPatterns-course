package park.test;
import static org.junit.Assert.assertEquals;

import org.junit.*;

import park.calculators.HourCalc;
import park.taxes.*;
public class ParkingTaxTest {
    
    @Test
    public void fixedPerHourTax(){
        // Arrange
        ParkingTax tax =   
            new ParkingTax(3, new HourCalc(4));
        // Act 
        int value = tax.value();
        // Assert
        assertEquals(12, value);
    }

    @Test
    public void rateWithInitialValueAndAfterSpecificTimeFixedPerHour(){
        // Arrange
        ParkingTax tax =   
            new ParkingTax(3, new HourCalcWithInitialValue(5, 3, 2));
        // Act 
        int value = tax.value();
        // Assert
        assertEquals(12, value);
    }
}
