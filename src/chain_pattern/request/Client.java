package chain_pattern.request;

import chain_pattern.request.PurchaseRequest;

public class Client {

	public Client() {

	}
	public PurchaseRequest sendRequst(int Type, int Number, float Price) {
		return new PurchaseRequest(Type, Number, Price);
	}

}
