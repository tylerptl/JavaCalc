import java.util.List;

public class SubtractInteger extends BinaryOperator<Double>{

    @Override
    protected Double calc(Double a, Double b){
        double total = a-b;

        if (total > Double.MAX_VALUE){
            throw new ArithmeticException("Integer overflow");
        }
        if (total < Double.MIN_VALUE){
            throw new ArithmeticException("Integer underflow");
        }
        return total;
    }

}
