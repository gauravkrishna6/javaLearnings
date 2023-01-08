package chapter.one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Inventory {

	private List<Guitar> guitars;
	
	

	public Inventory() {
		
		guitars = new ArrayList<>();
	}

	public Optional<Guitar> getGuitar(String serialNumber) {
		
	return 	guitars.stream()
			.filter(guitar -> guitar.getSerialNumber().equals(serialNumber))
			.findFirst();
		
	}

	public void addGuitar(String serialNumber, double price, GuitarSpec specs) {
		
		Guitar guitar =  new Guitar(serialNumber, price, specs);
		
		guitars.add(guitar);
	}
	
	public List<Guitar> search(GuitarSpec spec) {
		

		return guitars.stream()
			.filter(guitar -> guitar.getSpecs().equals(spec))
			.collect(Collectors.toList());
		

	}

}
