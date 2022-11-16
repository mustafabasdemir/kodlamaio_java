package kodlama.io.rentAcar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentAcar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentAcar.entities.concretes.Brand;

@Repository
public class InMemoryBrandRepository implements BrandRepository {

	List<Brand> brands;
	
	
	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1,"bmw"));
		brands.add(new Brand(2,"mercedes"));
		brands.add(new Brand(3,"audi"));
		brands.add(new Brand(4,"fiat"));
		brands.add(new Brand(5,"reno"));
	}


	@Override
	public List<Brand> getAll() {
		return brands;
	}

}
