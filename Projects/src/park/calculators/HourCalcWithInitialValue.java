package park.calculators;

import park.calculators.interfaces.ICalculator;

public class HourCalcWithInitialValue implements ICalculator {

     private int initialValue;
     private int toleranceTime; 
     private int valuePerExcessHour;

    public HourCalcWithInitialValue(int initialValue, int toleranceTime, int valuePerExcessHour) {
        this.initialValue = initialValue;
        this.toleranceTime = toleranceTime;
        this.valuePerExcessHour = valuePerExcessHour;
    }

    @Override
    public int calc(int value) {
        int calcValue = this.initialValue;
        if (value > toleranceTime)
            calcValue += (value - toleranceTime) * valuePerExcessHour;
        return calcValue;
    }
}
