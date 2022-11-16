package Kodlamaio.language.dataAccess.abstracts;

import java.util.List;

import Kodlamaio.language.entities.Language;

public interface LanguageRepository {

	/*
	 * ekleme
	 * silme
	 * güncelleme
	 * listeleme
	 * id ile getirme
	 * 
	 */
	
	public void add(Language language);
	public void delete(int id);
	public void update(int id ,Language language);
	List<Language> getAll();
	Language getById(int id);
}
