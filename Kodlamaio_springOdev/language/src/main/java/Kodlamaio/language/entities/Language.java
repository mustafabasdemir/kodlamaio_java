package Kodlamaio.language.entities;

public class Language {

	//dil eklemek için id ve name yaratalım  
	
	private int id;
	private String name;
	
	public Language() {
		
	}

	public Language(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
