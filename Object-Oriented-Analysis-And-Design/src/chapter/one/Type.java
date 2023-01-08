package chapter.one;

public enum Type {
	ACCOUSTIC ("Accoustic"),
	ELECTRIC ("Electric");
	
	private String value ;
	
	Type(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	

}
