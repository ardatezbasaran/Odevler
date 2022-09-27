package classesWithAttributes;

public class main {

	public static void main(String[] args) {
		Product product = new Product(782378,"Laptop","Laptop", 5000, 349,"Siyah");
		/*Product product = new Product();
		product.set_name("Laptop");
		product.setId(1);
		product.set_description("Asus Laptop");
		product.set_price(5000);
		product.set_stockAmount(349);*/
	
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		System.out.println(product.get_name());
		System.out.println(product.getId());
		System.out.println(product.get_description());
		System.out.println(product.get_price());
		System.out.println(product.get_stockAmount());
		System.out.println(product.getKod());
		
	}

}
