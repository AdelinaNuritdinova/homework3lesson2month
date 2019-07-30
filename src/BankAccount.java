public class BankAccount {
    double vallet; //счет
    double amount; //остаток денег

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){ // положить деньги на счет

        this.vallet = vallet + sum;

    }

    public void withDraw(double sum) throws LimitException { //снять деньги со счета

        this.vallet = vallet - sum;

        if (vallet < 0)
            throw new LimitException("Error" , vallet);
        }



    }


