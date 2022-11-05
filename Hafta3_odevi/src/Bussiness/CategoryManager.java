package Bussiness;

import dataAccess.IDataAccessCategoryDal;
import dataAccess.IDataListView;
import log.ICategoryLogger;
import section.category;

public class CategoryManager {

	IDataAccessCategoryDal iDataAccessCategoryDal;
	IDataListView iDataListView;
	ICategoryLogger[] categoryLoggers;
	
	public CategoryManager(IDataAccessCategoryDal iDataAccessCategoryDal,ICategoryLogger[] iCategoryLogger)
	{
		this.iDataAccessCategoryDal=iDataAccessCategoryDal;
		this.categoryLoggers=iCategoryLogger;
		
	}
	
	public void add(category category){

	

			iDataAccessCategoryDal.add(category);
			

		for (ICategoryLogger categoryLogger : categoryLoggers) {

			categoryLogger.log(category);
		}

		System.out.println(" ");
		}
	
	
	public void CategoryList() {

		iDataListView.ViewList();
	}
}
