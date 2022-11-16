package Kodlamaio.language.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.language.business.abstracts.LanguageService;
import Kodlamaio.language.entities.Language;

@RestController
@RequestMapping("api/languages")
public class LanguagesController {

	private LanguageService languageService;
	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Language language) 
	{
		languageService.add(language);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody int id, Language language) 
	{
		languageService.update(id, language);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") int id) 
	{
		languageService.delete(id);
	}
	
	@GetMapping("/getall")
	public List<Language> getAll() 
	{
		return languageService.getAll();
	}
	
	@GetMapping("/get/{id}")
	public Language getById(@PathVariable (name = "id") int id ) throws Exception 
	{
		return languageService.getById(id);
	}
	
}
