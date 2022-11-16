package Kodlamaio.language.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlamaio.language.dataAccess.abstracts.LanguageRepository;
import Kodlamaio.language.entities.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1,"Java"));
		languages.add(new Language(2,"C#"));
		languages.add(new Language(3,"SQL"));
		languages.add(new Language(4,"PHP"));	
	}
	
	
	@Override
	public void add(Language language) {
		languages.add(language);
	}

	@Override
	public void delete(int id) {
		languages.remove(id);
	}

	@Override
	public void update(int id, Language language) {
		languages.set(id, language);
	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public Language getById(int id) {
		// id ile arama 
				Language returnLanguage = null ;
				for (Language language : languages) {
					if(language.getId()==id)
					{
						returnLanguage=language;
					}
				}
				return returnLanguage;
	}

}
