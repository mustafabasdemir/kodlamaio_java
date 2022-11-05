package odev2;

public class methods {

	public static void main(String[] args) {
		/*
		sayiBul();   
		System.out.println(topla(8, 5));
		System.out.println(topla2(1,2,3,4,5,6,7,8));
		
		// CLASS KULLANIMI  
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add();
		customerManager.remove();
		customerManager.update();
		
		*/
		dortIslem  dortislem = new dortIslem();
		System.out.println(dortislem.bol(8, 2));
		System.out.println(dortislem.topla(8, 2));
		System.out.println(dortislem.carp(8, 2));
		System.out.println(dortislem.cikar(8, 2));
		
		dortislem.add(16, "mustafa", "basdemir");
		dortislem.add(11, "engin", "demirog");
		dortislem.add(13, "muhammed", "basdemir");

		
	}

	public static void sayiBul()
	{
		int[] sayilar  = new int[] {1,2,3,4,5,6,7,8,9,0};
		int aranacak=5;
		boolean varMi=false;
		
		for(int sayi: sayilar)
		{
			if(sayi==aranacak)
			{
				varMi=true;
				break;
			}
		}
		
		
		if(varMi)
		{
			System.out.println("sayi mevcut");
		}
		else 
		{
			System.out.println("sayi mevcut değil");
		}
		
	}

	public static int topla(int s1, int s2)
	{
		return s1+s2;
	}
	
	public static int topla2(int... sayilar)
	{
		int toplam=0;
		for(int sayi : sayilar)
		{
			toplam +=sayi;
		}
		
		return toplam;		
	}

	
	
	
	




}
