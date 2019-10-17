package decorator_pattern;

//装饰者模式下的装饰者对象和被装饰者对象都需要继承一个共同的超类
public abstract class Drink {
	public String description="";
	private float price=0f;

	public abstract float cost();

	public void setDescription(String description) {
		this.description=description;
	}
	public String getDescription() {
		return description+"-"+this.getPrice();
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price=price;
	}
}
