package intro;

public class odev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		System.out.print("merhaba java");
		System.out.println("merhaba java");  // println ile yazma işleminden sonra bir alt satıra geçer 
		
		
		int sayi=15;
		String isim="Mustafa";
		Boolean havaGuzelMi=true;    //veri tipleri 
		double sonuç=12.5;
		char karakter='M';
		
		//if kosulları 
		
		int Sayac=18;
		if(Sayac>15)
		{
			System.out.print("sayı 15'den büyük");
		}
		else if(Sayac<15)
		{
			System.out.print("sayı 15'den küçük");
		}
		else
		{
			System.out.print("sayı 15'e eşit");
		}
		
		
		// if ile en büyük sayıyı bulma 
		
		int s1=10;
		int s2=5;
		int s3=15;
		int enBuyuk=s3;
		
		if(enBuyuk<s1)
		{
			enBuyuk=s1;
		}
		if(enBuyuk<s2)
		{
			enBuyuk=s2;
		}
		
		System.out.print("En büyük sayı : "+enBuyuk);
		
		
		
		//switch case ile çalışmak 
		
		int  gun=1;
		
		switch (gun) {
		case 1:
			System.out.print("pazartesi");
			break;
		case 2:
			System.out.print("salı");
			break;
		case 3:
			System.out.print("carsamba");
			break;
		case 4:
			System.out.print("persembe");
			break;
		case 5:
			System.out.print("cuma");
			break;
		case 6:
			System.out.print("cumartesi");
			break;
		case 7:
			System.out.print("pazar");
			break;

		default:
			System.out.print("Hatalı sayı girdin");
			break;
		}
		
	
		// for dongusu 
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);			
		}
		
		
		//while dongusu 
		 * 
		int a=2;
		while(a<15)
		{
			System.out.println(a);	
			a+=2;
		}
	
		
		
		// sayı asal mı 
		
		 int sayi = 15;
         int sayac = 0;
		
		  for(int i = 2; i < sayi; i++)
	        {
	            if(sayi % i == 0) {
	                sayac++;
	            }
	        }
	        if(sayac == 0) {
	            System.out.println(sayi + " Asal bir sayidir.");
	        }
	        else {
	            System.out.println(sayi + " Asal bir sayi degildir.");
	        }
		
		
		// Mükemmel sayı bulma 
		    int toplam = 0;
	        int sayi = 20;
	        
	        for(int i = 1; i < sayi; i++)
	        {
	            if(sayi % i == 0) {
	                toplam += i;
	            }
	        }
	        if(sayi == toplam) {
	            System.out.println(sayi + " Mükemmel bir sayidir");
	        }
	        else {
	            System.out.println(sayi + " Mükemmel bir sayi degildir.");
	        }
		*/
		
		// diziden eleman bulma
		
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

}
