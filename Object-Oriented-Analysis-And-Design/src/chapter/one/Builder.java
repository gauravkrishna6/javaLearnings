package chapter.one;

public enum Builder {

	FENDER("Fender"),
	MARTIN("Martin"),
	COLLINS("Collins"),
	GIBSON("Gibson"),
	OLSON("Olson"),
	PRS("Prs"),
	RYAN("Ryan"),
	ANY("Any");
	
	private final String value ;

	Builder(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}
