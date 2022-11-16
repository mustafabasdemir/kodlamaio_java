package kodlama.io.rentAcar.dataAccess.abstracts;

import java.util.List;


import kodlama.io.rentAcar.entities.concretes.Brand;


public interface BrandRepository {
	List<Brand> getAll();
	
}
