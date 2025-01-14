package park.calculators;

import park.calculators.interfaces.ICalculator;

public class HourCalc implements ICalculator {

    private int hourPrice;

    public HourCalc(int hourPrice) {
        this.hourPrice = hourPrice;
    }
    
    @Override
    public int calc(int hoursParked) {
        return  hoursParked * hourPrice;       
    }
}
