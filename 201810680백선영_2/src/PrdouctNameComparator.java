
public class PrdouctNameComparator implements Comparator<Prdouct> {
	
	@Override
	public int compare(Product p1, Product p2) {
		String productName1 = p1.getProductName();
		String productName2 = p2.getProductName();
		
		return productName1.compareToIgnoreCase(productName2);
	}
	
}
