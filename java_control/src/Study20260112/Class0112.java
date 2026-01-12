package Study20260112;

public class Class0112 {
	
	private String itemName;
	private int itemPrice;
	private String category;
	private int count;
	
	public Class0112(String itemName, int itemPrice, String category, int count) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.category = category;
		this.count = count;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "상품명 : " + itemName + "\n상품가격 : " +
	itemPrice + "원 \n카테고리 : " + category + "\n수량 : "+ count + " 개";
	}
	
	
	
	

}
