package chapter.one;

import java.util.Objects;

public class GuitarSpec{
	
	
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private int numString;
	
	
	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
		
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numString = numString;
	}
	
	
	public Builder getBuilder() {
		return builder;
	}
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}
	public int getNumString() {
		return numString;
	}
	public void setNumString(int numString) {
		this.numString = numString;
	}


	@Override
	public int hashCode() {
		return Objects.hash(backWood, builder, model, topWood, type, numString);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GuitarSpec other = (GuitarSpec) obj;
		return backWood == other.backWood 
				&& builder == other.builder 
				&& Objects.equals(model, other.model)
				&& topWood == other.topWood 
				&& type == other.type
				&& numString == other.numString;
	}
	

}
