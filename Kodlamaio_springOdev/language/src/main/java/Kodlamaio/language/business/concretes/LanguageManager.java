package Kodlamaio.language.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.language.business.abstracts.LanguageService;
import Kodlamaio.language.dataAccess.abstracts.LanguageRepository;
import Kodlamaio.language.entities.Language;

@Service
public class LanguageManager  implements LanguageService{

	LanguageRepository languageRepository;
	
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}



	@Override
	public void add(Language language) {
		if(language.equals(null))
		{
			System.out.println("Programlama dili adı boş olamaz.");
		}
		else
		{
			languageRepository.add(language);
			System.out.println(language + " Adlı programlama dili listeye eklendi.");
		}
	}



	@Override
	public void delete(int id) {
		String LanguageName = languageRepository.getById(id).getName();
		languageRepository.delete(id);
		System.out.println(LanguageName + " Adlı kayıt Listeden silindi.");
	}



	@Override
	public void update(int id, Language language) {
		if(language.equals(null))
		{
			System.out.println("Programlama dili adı boş olamaz.");
		}
		else
		{
			languageRepository.update(id, language);
			System.out.println(language + "Adlı programlama dili Güncellendi. ");
		}
	}



	@Override
	public List<Language> getAll() {
		List<Language> returnLanguage = languageRepository.getAll();
		if(returnLanguage!=null)
		{
			System.out.println("Programlama dilleri listesi getirildi.");
		}
		else
		{
			System.out.println("Liste Oluşturulmadı.");
		}
		
		return returnLanguage;
	}



	@Override
	public Language getById(int id) {
		Language language = languageRepository.getById(id);
		if(language==null)
		{
			System.out.println("programlama dili bulunamadı");
			
		}
		else
		{
			System.out.println(language.getName() + "dil getirildi.");
		}
		
		return language;
	}
	
	
	
}
