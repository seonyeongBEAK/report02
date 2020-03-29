public class Prdouct implements Comparable<Prdouct> {

   private String productName;
   private int productNum;       

   public Prdouct(String productName, int productNum) {

      this.productName = productName;
      this.productNum = productNum;

   } 

   
   public int compareTo(Prdouct compareProduct) { // override

      // ascending order
      return this.productNum - compareProduct.productNum;

      // descending order
      // return compareProduct.productNum - this.productNum;

   }       

   public String getProductName() {
   return productName;
}

public int getProductNum() {
   return productNum;
}



public String toString() {

      return "productName: " + productName + "productNum: " + productNum;

   }
	

