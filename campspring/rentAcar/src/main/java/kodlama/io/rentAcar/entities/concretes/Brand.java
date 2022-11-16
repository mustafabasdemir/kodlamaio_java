package kodlama.io.rentAcar.entities.concretes;

public class Brand {  //marka

	private int id;
	private String name;
	
	public Brand() {
	}

	public Brand(int id, String name) {
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
// 1- Anatasyon
// 2- Autowired
// 3- Port
		}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
