package exam28;

public class ProductDTO {
	private String itemName;
	private int itemPrice;
	private int itemCount;
	private int total;
	
	
	public ProductDTO(String itemName, int itemPrice, int itemCount) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemCount = itemCount;
		this.total = itemPrice * itemCount;
	}
	
	public void display() {
		System.out.printf("%s \t %d \t %d \t %d \n",itemName,itemPrice,itemCount,total);
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
