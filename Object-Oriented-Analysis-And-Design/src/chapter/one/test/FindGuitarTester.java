package chapter.one.test;

import chapter.one.Builder;
import chapter.one.GuitarSpec;
import chapter.one.Inventory;
import chapter.one.Type;
import chapter.one.Wood;

public class FindGuitarTester {
	
	public static void main(String[] args) {
		
		Inventory inventory = new Inventory();
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);
		
		inventory.addGuitar("sn1111", 100.0, whatErinLikes);
		
	}

}
