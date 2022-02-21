
public class Dollar extends Currency {
// Non public String Attribute which contains name of 
	private String type = "Dollar";

	// Default constructor for Dollar
	public Dollar() {
		super();
	}

	// Copy constructor for Dollar
	public Dollar(Dollar x) {
		this.setUnit(x.getUnit());
		this.setFraction(x.getFraction());
	}

	// Constructor based on one single input of type double
	public Dollar(double z) {
		super(z);
	}

	// Getter for String attribute
	public String getType() {
		return type;
	}

	// add method

	public Dollar subtract(Dollar a, Dollar b) {
		double one = a.getUnit() * 100 + a.getFraction() / 100;
		double two = b.getUnit() * 100 + b.getFraction() / 100;
		if (one >= two) {
			Dollar x = new Dollar(one - two);
			return x;
		} else {
			Dollar x = new Dollar(two - one);
			return x;
		}

	}

	public boolean isEqual(Dollar a, Dollar b) {
		if (a.getUnit() == b.getUnit() && a.getFraction() == b.getFraction()) {
			return true;
		}
		return false;
	}

	public Dollar isGreater(Dollar a, Dollar b) {
		if (a.getUnit() > b.getUnit() || a.getUnit() >= b.getUnit() && a.getFraction() > b.getFraction()) {
			return a;
		}
		return b;
	}

	public void print() {
		System.out.println(this.getUnit() + "." + this.getFraction() + " " + type);
	}

	//CHANGES HERE
	@Override
	public Currency add(Currency a, Currency b) {
		Dollar x = new Dollar(((a.getUnit() + b.getUnit()) * 100 + a.getFraction() + b.getFraction()) / 100.0);
		return x;
	}

	//CHANGES HERE
	@Override
	public Currency subtract(Currency a, Currency b) {

		double one = a.getUnit() * 100 + a.getFraction() / 100;
		double two = b.getUnit() * 100 + b.getFraction() / 100;
		if (one >= two) {
			Dollar x = new Dollar(one - two);
			return x;
		} else {
			Dollar x = new Dollar(two - one);
			return x;
		}

	}

}
