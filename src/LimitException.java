public class LimitException extends Exception{
    double remainingAmount;

    public LimitException(String message , double remainingAmount){
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public void getRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }
}
