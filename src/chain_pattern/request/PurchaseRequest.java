package chain_pattern.request;

public class PurchaseRequest {
	private int Type = 0;//请求类型
	private int Number = 0;//购买的数量
	private float Price = 0;//购买的价格
	private int ID = 0;//请求的id号

	public PurchaseRequest(int Type, int Number, float Price) {
		this.Type = Type;
		this.Number = Number;
		this.Price = Price;
	}

	public int GetType() {
		return Type;
	}

	public float GetSum() {
		return Number * Price;
	}

	public int GetID() {
		return (int) (Math.random() * 1000);
	}
}
