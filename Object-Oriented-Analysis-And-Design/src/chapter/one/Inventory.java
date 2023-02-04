package chapter.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Inventory {

	private List<Guitar> guitars;
	
	
	/*
	 * Constructor
	 */
	public Inventory() {
		guitars = new ArrayList<>();
	}

	/*
	 * returns a @Guitar with a specific serialNumber
	 */
	public Optional<Guitar> getGuitar(String serialNumber) {
		return 	guitars.stream()
				.filter(guitar -> guitar.getSerialNumber().equals(serialNumber))
				.findFirst();
	}

	/*
	 * Adds @Guitar to the @Inventory
	 */
	public void addGuitar(String serialNumber, double price, GuitarSpec specs) {
		Guitar guitar =  new Guitar(serialNumber, price, specs);
		guitars.add(guitar);
	}

	/*
	 * This method searches for the @Guitar in the 
	 * @Inventory which match the @GuitarSpec
	 * and return List<@Guitar>
	 */
	public List<Guitar> search(GuitarSpec spec) {
		return guitars.stream()
			.filter(guitar -> guitar.getSpecs().equals(spec))
			.collect(Collectors.toList());
	}

}
