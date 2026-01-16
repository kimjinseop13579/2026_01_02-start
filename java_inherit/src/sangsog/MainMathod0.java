package sangsog;

import common.Fruit;
import products.Apple;
import products.Grape;
import products.Orange;
import products.Pear;

public class MainMathod0 {

	public static void main(String[] args) {
		
		Fruit[] fruits = {
				new Apple("사과"),
				new Pear("배"),
				new Orange("오렌지"),
				new Grape("포도")
		};
		
		for (Fruit a:fruits) {
			a.tree();
			a.taste();
			a.color();
			System.out.println();
		}

	}

}
