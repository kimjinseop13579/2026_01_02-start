package Sangsog2;

import Common2.Tree;
import Products2.BaobabTree;
import Products2.BeechTree;
import Products2.GiantSequoia;
import Products2.PineTree;

public class MainMathod {
	

	public static void main(String[] args) {
		
		
		Tree[] tree = {
				new BaobabTree("바오밥나무"), 
				new GiantSequoia("자이언트 세퀘이아"),
				new BeechTree("너도밤나무"),
				new PineTree("소나무")
		};
		
		for (Tree a : tree ) {
			
			a.treeName();
			a.tall();
			a.barkColor();
			
			a.life();
			System.out.println();
		}

	}

}
