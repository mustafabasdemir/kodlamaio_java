package dataAccess;

import section.category;

public class MySqlCategoryDal implements IDataAccessCategoryDal,IDataListView{

	@Override
	public void add(category category) {
		// TODO Auto-generated method stub
		System.out.println("Kategori MySql veri tabanına eklendi : " + category.getCategoryId() + ")" + category.getCategoryName());
		IDataAccessCategoryDal.categoryArrayList.add(category);
	}

	@Override
	public void ViewList() {
		// TODO Auto-generated method stub
		for (int i = 0; i < IDataAccessCategoryDal.categoryArrayList.size(); i++) {
			System.out.println(IDataAccessCategoryDal.categoryArrayList.get(i).getCategoryName());
		}
	}

}
