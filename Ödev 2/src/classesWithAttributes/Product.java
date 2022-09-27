package classesWithAttributes;

public class Product {
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı blok çalıştı.");
		this._id=id;
		this._name=name;
		this._description=description;
		this._price=price;
		this._stockAmount=stockAmount;
		this._renk=renk;
		
	}

	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
    private String _kod;
    
    public int getId() {
    	return _id;
    }
	public void setId(int id) {
		_id=id;
	}
	
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String _description) {
		_description = _description;
	}
	public double get_price() {
		return _price;
	}
	public void set_price(double _price) {
		_price = _price;
	}
	public int get_stockAmount() {
		return _stockAmount;
	}
	public void set_stockAmount(int _stockAmount) {
		_stockAmount = _stockAmount;
	}
	public String get_renk() {
		return _renk;
	}
	public void set_renk(String _renk) {
		_renk = _renk;
	}
    public String getKod() {
    	return this._name.substring(0,3)+_id;
    }

}
