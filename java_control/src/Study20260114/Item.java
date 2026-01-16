package Study20260114;

public class Item {
	
	private String itemName;
	private int itemPrice;
	private String itemMainImage;
	private int itemStock;
	
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
	public String getItemMainImage() {
		return itemMainImage;
	}
	public void setItemMainImage(String itemMainImage) {
		this.itemMainImage = itemMainImage;
	}
	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}
	@Override
	public String toString() {
		return "장비 이름 : " + itemName + "\n장비 가격 : " + itemPrice + "원\n장비 이미지 : " + itemMainImage
				+ "\n장비 개수 : " + itemStock + "개 ";
	}
	public Item(String itemName, int itemPrice, String itemMainImage, int itemStock) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemMainImage = itemMainImage;
		this.itemStock = itemStock;
	}
	public Item() {
		super();
	}
	
	

}
