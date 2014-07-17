package training.io;

import java.util.ArrayList;
import java.util.List;

public class CompositionDemo {
	
	class Invoice{
		private List<LineItem>  lineItems = new ArrayList<LineItem>();
		
		public void addItem(Item item, int quantity, int price,int discount){
			
			lineItems.add(new LineItem(lineItems.size(), item,price, discount,quantity));
		
		}
		
		public void generateBill(){
			for (LineItem lineItem : lineItems) {
				System.out.println(lineItem.getLineNo() + "  " + lineItem.getItem().getName() + "  " + lineItem.pricePerItem + "  "  + lineItem.pricePerItem * lineItem.quantity);
			}
			
		}
		
		
	}
	
	class Item{
		
		private int barCode;
		private String name;
		private String category;
		
		Item( int barCode, String name, String category){
			this.barCode = barCode;
			this.name=name;
			this.category = category;
			
		}

		public int getBarCode() {
			return barCode;
		}

		public String getName() {
			return name;
		}

		public String getCategory() {
			return category;
		}
		
	}
	
	class LineItem{
		private int lineNo;
		private Item item;
		private int pricePerItem;
		private int discountPerItem;
		private int quantity;
		
		LineItem(int lineNo, Item item, int pricePerItem, int discontPerItem,int quantity){
			this.lineNo = lineNo;
			this.item = item;
			this.pricePerItem = pricePerItem;
			this.discountPerItem = discontPerItem;
			this.quantity = quantity;
		}

		public int getLineNo() {
			return lineNo;
		}

		public Item getItem() {
			return item;
		}

		public int getPricePerItem() {
			return pricePerItem;
		}

		public int getDiscountPerItem() {
			return discountPerItem;
		}

		public int getQuantity() {
			return quantity;
		}
		
		
		
	}

}
