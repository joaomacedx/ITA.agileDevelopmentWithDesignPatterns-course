package park.calculators;

import park.calculators.interfaces.ICalculator;

public class HourCalc implements ICalculator {

    private int hourValue;

    public HourCalc(int hourValue) {
        this.hourValue = hourValue;
    }
    
    @Override
    public int calc(int hoursParked) {
        return  hoursParked * hourValue;       
    }
}
