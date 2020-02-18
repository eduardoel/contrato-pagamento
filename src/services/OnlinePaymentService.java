package services;

public interface OnlinePaymentService {
    //Taxa de pagamento
    double paymentFee(double amount);

    double interest(double amount, int months);

}
