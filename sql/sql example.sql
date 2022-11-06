create DATABASE OBS2

use OBS2

 create table ogrenci 

 (
    tcNo decimal (11) not null,
	ad varchar (50),
	soyad varchar (50),
	cinsiyet  char(1),                            --burada ogrenci adýnda yeni bir tablo yaptýk
	dtarih datetime,
	email varchar (50),
	telefon  varchar (50),
	ktarih datetime,
	constraint pk_tcNo primary key(tcNo),    --sabit terimli primary key ve unique anahtar tanýmladýk
	constraint uq_telefon unique(telefon)

 )



	create table dersler

(
	dersKod varchar(58) not null,       --burada dersler adýnda yeni bir tablo yaptýk
	dersAd VARCHAR (50)
    constraint pk_dersKod primary key(dersKod) --sabit terimli primary key ve unique anahtar tanýmladýk

)




update 

create table deneme1
(
    sutun1 int,
	sutun2 char(50),                --deneme adýnda tablo oluþturduk 
	sutun3 datetime,
	primary key(sutun1,sutun2)

	)



create table notlar
(

    tcNo DECIMAL(11) NOT NULL,
	dKod VARCHAR(8) NOT NULL,
	vize INT CHECK(vize>=0 AND vize<=100),
	final INT CHECK(final>=0 AND final<=100),
	CONSTRAINT pk_tcNo_dKod PRIMARY KEY(tcNo, dKod),
	CONSTRAINT fk_tcNo FOREIGN KEY (tcNo) REFERENCES ogrenci(tcNo),
	CONSTRAINT fk_dKod FOREIGN KEY (dKod) REFERENCES dersler(dersKod)

	)



   alter table deneme1 add sutun4 int not null   --burada tabloya yeni sutun ekledik 
   alter table deneme1 drop column sutun4        --burada tabloya ekledýgýmýz sutunu siler 
   alter table deneme1 add sutun5 int			 --burada tabloya yeni sutun ekledik
   
   alter table deneme1 alter column sutun5 varchar null  --burada tabloya eklediðimiz sutun5
                                                         --yerini int yerine varchar olarak  deðiþtirdik
	
   alter table deneme1 add unique (sutun5)        --burada sutun 5'i unique anahtar olarak tanýmladýk 
   alter table deneme1 add sutun4 varchar(50)     --burada tabloya yeni sutun ekledik
  
   alter table deneme1 add foreign key (sutun4) references ogrenci(telefon) --deneme1 tablosundaki 
                                                                           --sutun4 ile ogrenci 
																		   --tablosundaki telefon 
																		   --arasýnda foreign anahtar 
  																	       --baglantý oluþturduk 
   alter table deneme1 add sutun6 int    --burada tabloya yeni sutun ekledik




            ------------anahtar terimlerini silmek için sabit tanýmlanmalý--------------

--örn--
  
  alter table deneme1 add constraint uq_sutun6 unique(sutun6) --deneme1 tablosunda sutun6 ya sabit
                                                              --terimli unique anahtar bagladýk  

     
  alter table deneme1  drop constraint uq_sutun6    --üst tarafta sutun6'ya sabit terimli unique anahtar
                                                    --vermiþtik þimdi anahtarý siler 


-----------------------------------------------------------------------------------


--drop database OBS   --database dosyasýndaki obs veritabanýný siler 




----- sorgular---------------


SELECT * FROM ogrenci                  --öðrenci tablosundaki verileri getirme

SELECT * FROM dersler                   --dersler tablosunu göster 

SELECT tcNo FROM ogrenci                --tc no gösterir

SELECT tcNo, ad, soyad FROM ogrenci     -- tc no ad soyad gösterir

SELECT * FROM ogrenci WHERE ad='Eylül'  --girilen kiþinin bilgilerini ekrana getirme 

SELECT * FROM ogrenci WHERE cinsiyet='E'    --cinsiyeti erkek olanlarý göster 

SELECT * FROM notlar WHERE final<50         --final notu 50 den küçük olanlarý ekrana getirdi

SELECT * FROM  notlar WHERE vize>50 AND final<50    --vizesi iyi olup finalden düþük alan öðrenciyi gösterir

SELECT * FROM  notlar WHERE vize=50 OR vize=60      --vizesi 50 olan veya 60 olaný ekrana getirdi ayný þeylerde kullan vize vize

SELECT * FROM notlar where final>=60 AND final<=90  --final notu 60dan büyük 90dan küçük olanlarý gösterir

SELECT * FROM notlar where final BETWEEN 60 AND 90  --final notu 60dan büyük 90dan küçük olanlarý gösterir farklý yöntem ile

SELECT * FROM dersler where dersKod IN ('BLP110', 'BLP112')   --ders kodu 110 ve 112 olaný getirdi(filtreleme sistemi)

SELECT * FROM notlar where dKod IN ('BLP110', 'BLP112')       -- notlar tablosundaki dKodu blp110 ve 112 olan verileri getirdi

SELECT * FROM ogrenci where dtarih BETWEEN '1992-01-01' and '1993-12-31'   --bu yýlar arasýnda olan doðanlarý ekranra getir 

SELECT * FROM ogrenci where telefon LIKE '0555%'     --BAÞLANGICI BELLÝ SONU BELLÝ OLMAYAN KAYITLARI LÝSTELEDÝ

SELECT * FROM ogrenci where telefon LIKE '%0'        --TELEFON NUMARASI 0 ÝLE BAÞLAYAN KÝÞÝLERÝ GÖSTER

SELECT * FROM ogrenci where telefon LIKE '____1'     --5ÝNCÝ KARAKTERÝ 1 OLAN KÝÞÝYÝ gösterir

SELECT * FROM notlar where (vize=50 OR vize=60) AND dKod IN ('BLP-110', 'BPL-111')      --ÞU DERS KODLARINDAN VÝZESÝ 50 VEYA 60 OLANI gösterir

SELECT * FROM notlar where vize <> 60                -- VÝZESÝ 60 OLMAYANLARI gösterir 

SELECT * FROM ogrenci where email LIKE '%edu%'       --mail adresi EDU  olan öðrencileri göster

SELECT * FROM notlar --dersler kayýdýný gösterir

SELECT * FROM dersler WHERE dersKod='' --BOÞ KAYITLARI gösterir

DELETE FROM dersler WHERE dersKod IS NULL --BOÞ KAYITI SÝLME

DELETE FROM dersler WHERE dersKod LIKE 'G%' --ders kodu g ile baþlayan kayýdý siler

UPDATE dersler SET dersAd='Masaüstü Programlama' WHERE dersKod='BLP103' --GÜNCELEME 103 DEKÝ KAYIDIN ADINI GÜNCELEME


---tabloya veri ekleme-------

----dersleri ekledik---------
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP111', 'Görsel Programlama')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP112', 'Teknik Resim')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP103', 'Görsel Programlama')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP104', 'C Programlama')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP109', 'Java Programlama')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP110', 'Görsel Sanatlar')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP105', 'Mobil Programlama')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP101', 'Programlama Temelleri') 
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP102', 'Programlama Dilleri')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP106', 'Matematik')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP107', 'Ýngilizce')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP108', 'Web Tasarým Temelleri')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP111', 'Mesleki Geliþim')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP113', 'Müzik')


--ögrenci eklemeleri yaptýk 


INSERT INTO ogrenci(tcNo, ad, soyad, cinsiyet, dTarih, email, telefon, ktarih) VALUES ('11111111111', 'Celal Tolga', 'Özgentürk', 'E', '1993-01-05', 'tolgaozgenturk21@gmail.com', '05553334546', '2000-08-28')

INSERT INTO ogrenci(tcNo, ad, soyad, cinsiyet, dTarih, email, telefon, ktarih) VALUES ('11111111112', 'Mustafa', 'Baþdemir', 'E', '1993-04-05', 'mustafabaþdemir@msn.com', '05553334558', '1999-01-10')

INSERT INTO ogrenci(tcNo, ad, soyad, cinsiyet, dTarih, email, telefon, ktarih) VALUES ('11111111113', 'elif', 'kaya', 'K', '1995-05-08', 'elifkaya@outlook.com', '0555333454', '2000-12-18')

INSERT INTO ogrenci(tcNo, ad, soyad, cinsiyet, dTarih, email, telefon, ktarih) VALUES ('11111111114', 'esra', 'er', 'K', '1995-01-06', 'esraer@hotmail.com', '05553334548', '1999-11-18')

INSERT INTO ogrenci(tcNo, ad, soyad, cinsiyet, dTarih, email, telefon, ktarih) VALUES ('11111111115', 'Mustafa', 'Ekþi', 'E', '1993-01-05', 'mustafaekþi2@gmail.com', '05553334526', '1997-08-28')

INSERT INTO ogrenci(tcNo, ad, soyad, cinsiyet, dTarih, email, telefon, ktarih) VALUES ('11111111116', 'berna', 'akkuþ', 'K', '1993-09-07', 'bernaakuþ@gmail.com', '05553338596', '1997-07-11')



---ögrenci notlarý giriþleri 

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111111', 'BLP101', '100', '100')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111111', 'BLP102', '95', '95')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111111', 'BLP103', '90', '90')   --öðrenci notlarý

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111111', 'BLP104', '85', '85')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111111', 'BLP105', '80', '80')


INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP101', '95', '100')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP102', '85', '95')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP103', '70', '85')  --öðrenci notlarý

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP104', '90', '99')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP105', '88', '85')


INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP101', '55', '20')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP102', '68', '75')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP103', '77', '45')  --öðrenci notlarý

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP104', '69', '96')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP105', '03', '25')


INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111113', 'BLP101', '45', '66')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111113', 'BLP102', '25', '95')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111113', 'BLP103', '50', '65')  --öðrenci notlarý

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111113', 'BLP104', '95', '85')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111113', 'BLP105', '99', '19')


INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111114', 'BLP101', '96', '76')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111114', 'BLP102', '35', '65')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111114', 'BLP103', '60', '65')  --öðrenci notlarý

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111114', 'BLP104', '85', '88')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111114', 'BLP105', '26', '99')


INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111115', 'BLP101', '56', '06')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111115', 'BLP102', '45', '08')  --öðrenci notlarý

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111115', 'BLP103', '85', '75')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111115', 'BLP104', '77', '50')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111115', 'BLP105', '35', '97')


--sorgular 

SELECT * FROM notlar


DELETE FROM dersler WHERE dersKod LIKE 'B%'  --B harfi ile baþlayan dersleri siler

SELECT * FROM ogrenci WHERE soyad='kaya' -- Soyadý kaya olan 

SELECT * FROM ogrenci where telefon LIKE '05%' --TELEFON NUMARASI 05 ÝLE BAÞLAYAN NUMARALAR

SELECT * FROM notlar where (vize=45 OR vize=85) AND dKod IN ('BLP101', 'BPL102') --SEÇÝLÝ DERSLERDE NOTLARI 45 VE 85 OLANLARI GÖSTERME

SELECT * FROM dersler where dersKod IN ('BLP102', 'BLP103') --ders kodu 102 ve 103 olaný getirdi(filtreleme sistemi)

SELECT * FROM notlar WHERE vize<50  -- vize zayýf alan ögrenciler 

SELECT * FROM ogrenci WHERE tcNo='11111111112'  --girilen tc kimlik sahibinin bilgilerini ekrana getirme 

SELECT * FROM ogrenci where cinsiyet LIKE 'K' -- ÖÐRENCÝ TABLOSUNDAKÝ KIZ ÖÐRENCÝLERÝ GÖSTERME

SELECT * FROM ogrenci where email LIKE '%outlook%' --mail adresleri outlook olan kayýtlarý gösterme

SELECT * FROM ogrenci where dtarih BETWEEN '1992-01-01' and '1998-12-31'  --1992 ile 1998 arasý doðan öðrenciler

SELECT * FROM  notlar WHERE vize>50 AND final<50 --vizesi iyi olup finalden düþük alan öðrenciler



