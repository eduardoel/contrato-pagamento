
package services;
//Serviços do Paypal
public class PaypalService implements OnlinePaymentService {

	private static final double FEE_PERCENTAGE = 0.02; //Taxa
	private static final double MONTHLY_INTEREST = 0.01; //Taxa

	@Override
	public double paymentFee(double amount) {
		return amount * FEE_PERCENTAGE;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * MONTHLY_INTEREST * months;
	}
}