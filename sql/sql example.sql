create DATABASE OBS2

use OBS2

 create table ogrenci 

 (
    tcNo decimal (11) not null,
	ad varchar (50),
	soyad varchar (50),
	cinsiyet  char(1),                            --burada ogrenci ad�nda yeni bir tablo yapt�k
	dtarih datetime,
	email varchar (50),
	telefon  varchar (50),
	ktarih datetime,
	constraint pk_tcNo primary key(tcNo),    --sabit terimli primary key ve unique anahtar tan�mlad�k
	constraint uq_telefon unique(telefon)

 )



	create table dersler

(
	dersKod varchar(58) not null,       --burada dersler ad�nda yeni bir tablo yapt�k
	dersAd VARCHAR (50)
    constraint pk_dersKod primary key(dersKod) --sabit terimli primary key ve unique anahtar tan�mlad�k

)




update 

create table deneme1
(
    sutun1 int,
	sutun2 char(50),                --deneme ad�nda tablo olu�turduk 
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
   alter table deneme1 drop column sutun4        --burada tabloya ekled�g�m�z sutunu siler 
   alter table deneme1 add sutun5 int			 --burada tabloya yeni sutun ekledik
   
   alter table deneme1 alter column sutun5 varchar null  --burada tabloya ekledi�imiz sutun5
                                                         --yerini int yerine varchar olarak  de�i�tirdik
	
   alter table deneme1 add unique (sutun5)        --burada sutun 5'i unique anahtar olarak tan�mlad�k 
   alter table deneme1 add sutun4 varchar(50)     --burada tabloya yeni sutun ekledik
  
   alter table deneme1 add foreign key (sutun4) references ogrenci(telefon) --deneme1 tablosundaki 
                                                                           --sutun4 ile ogrenci 
																		   --tablosundaki telefon 
																		   --aras�nda foreign anahtar 
  																	       --baglant� olu�turduk 
   alter table deneme1 add sutun6 int    --burada tabloya yeni sutun ekledik




            ------------anahtar terimlerini silmek i�in sabit tan�mlanmal�--------------

--�rn--
  
  alter table deneme1 add constraint uq_sutun6 unique(sutun6) --deneme1 tablosunda sutun6 ya sabit
                                                              --terimli unique anahtar baglad�k  

     
  alter table deneme1  drop constraint uq_sutun6    --�st tarafta sutun6'ya sabit terimli unique anahtar
                                                    --vermi�tik �imdi anahtar� siler 


-----------------------------------------------------------------------------------


--drop database OBS   --database dosyas�ndaki obs veritaban�n� siler 




----- sorgular---------------


SELECT * FROM ogrenci                  --��renci tablosundaki verileri getirme

SELECT * FROM dersler                   --dersler tablosunu g�ster 

SELECT tcNo FROM ogrenci                --tc no g�sterir

SELECT tcNo, ad, soyad FROM ogrenci     -- tc no ad soyad g�sterir

SELECT * FROM ogrenci WHERE ad='Eyl�l'  --girilen ki�inin bilgilerini ekrana getirme 

SELECT * FROM ogrenci WHERE cinsiyet='E'    --cinsiyeti erkek olanlar� g�ster 

SELECT * FROM notlar WHERE final<50         --final notu 50 den k���k olanlar� ekrana getirdi

SELECT * FROM  notlar WHERE vize>50 AND final<50    --vizesi iyi olup finalden d���k alan ��renciyi g�sterir

SELECT * FROM  notlar WHERE vize=50 OR vize=60      --vizesi 50 olan veya 60 olan� ekrana getirdi ayn� �eylerde kullan vize vize

SELECT * FROM notlar where final>=60 AND final<=90  --final notu 60dan b�y�k 90dan k���k olanlar� g�sterir

SELECT * FROM notlar where final BETWEEN 60 AND 90  --final notu 60dan b�y�k 90dan k���k olanlar� g�sterir farkl� y�ntem ile

SELECT * FROM dersler where dersKod IN ('BLP110', 'BLP112')   --ders kodu 110 ve 112 olan� getirdi(filtreleme sistemi)

SELECT * FROM notlar where dKod IN ('BLP110', 'BLP112')       -- notlar tablosundaki dKodu blp110 ve 112 olan verileri getirdi

SELECT * FROM ogrenci where dtarih BETWEEN '1992-01-01' and '1993-12-31'   --bu y�lar aras�nda olan do�anlar� ekranra getir 

SELECT * FROM ogrenci where telefon LIKE '0555%'     --BA�LANGICI BELL� SONU BELL� OLMAYAN KAYITLARI L�STELED�

SELECT * FROM ogrenci where telefon LIKE '%0'        --TELEFON NUMARASI 0 �LE BA�LAYAN K���LER� G�STER

SELECT * FROM ogrenci where telefon LIKE '____1'     --5�NC� KARAKTER� 1 OLAN K���Y� g�sterir

SELECT * FROM notlar where (vize=50 OR vize=60) AND dKod IN ('BLP-110', 'BPL-111')      --�U DERS KODLARINDAN V�ZES� 50 VEYA 60 OLANI g�sterir

SELECT * FROM notlar where vize <> 60                -- V�ZES� 60 OLMAYANLARI g�sterir 

SELECT * FROM ogrenci where email LIKE '%edu%'       --mail adresi EDU  olan ��rencileri g�ster

SELECT * FROM notlar --dersler kay�d�n� g�sterir

SELECT * FROM dersler WHERE dersKod='' --BO� KAYITLARI g�sterir

DELETE FROM dersler WHERE dersKod IS NULL --BO� KAYITI S�LME

DELETE FROM dersler WHERE dersKod LIKE 'G%' --ders kodu g ile ba�layan kay�d� siler

UPDATE dersler SET dersAd='Masa�st� Programlama' WHERE dersKod='BLP103' --G�NCELEME 103 DEK� KAYIDIN ADINI G�NCELEME


---tabloya veri ekleme-------

----dersleri ekledik---------
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP111', 'G�rsel Programlama')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP112', 'Teknik Resim')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP103', 'G�rsel Programlama')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP104', 'C Programlama')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP109', 'Java Programlama')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP110', 'G�rsel Sanatlar')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP105', 'Mobil Programlama')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP101', 'Programlama Temelleri') 
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP102', 'Programlama Dilleri')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP106', 'Matematik')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP107', '�ngilizce')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP108', 'Web Tasar�m Temelleri')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP111', 'Mesleki Geli�im')
INSERT INTO dersler(dersKod, dersAd) VALUES ('BLP113', 'M�zik')


--�grenci eklemeleri yapt�k 


INSERT INTO ogrenci(tcNo, ad, soyad, cinsiyet, dTarih, email, telefon, ktarih) VALUES ('11111111111', 'Celal Tolga', '�zgent�rk', 'E', '1993-01-05', 'tolgaozgenturk21@gmail.com', '05553334546', '2000-08-28')

INSERT INTO ogrenci(tcNo, ad, soyad, cinsiyet, dTarih, email, telefon, ktarih) VALUES ('11111111112', 'Mustafa', 'Ba�demir', 'E', '1993-04-05', 'mustafaba�demir@msn.com', '05553334558', '1999-01-10')

INSERT INTO ogrenci(tcNo, ad, soyad, cinsiyet, dTarih, email, telefon, ktarih) VALUES ('11111111113', 'elif', 'kaya', 'K', '1995-05-08', 'elifkaya@outlook.com', '0555333454', '2000-12-18')

INSERT INTO ogrenci(tcNo, ad, soyad, cinsiyet, dTarih, email, telefon, ktarih) VALUES ('11111111114', 'esra', 'er', 'K', '1995-01-06', 'esraer@hotmail.com', '05553334548', '1999-11-18')

INSERT INTO ogrenci(tcNo, ad, soyad, cinsiyet, dTarih, email, telefon, ktarih) VALUES ('11111111115', 'Mustafa', 'Ek�i', 'E', '1993-01-05', 'mustafaek�i2@gmail.com', '05553334526', '1997-08-28')

INSERT INTO ogrenci(tcNo, ad, soyad, cinsiyet, dTarih, email, telefon, ktarih) VALUES ('11111111116', 'berna', 'akku�', 'K', '1993-09-07', 'bernaaku�@gmail.com', '05553338596', '1997-07-11')



---�grenci notlar� giri�leri 

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111111', 'BLP101', '100', '100')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111111', 'BLP102', '95', '95')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111111', 'BLP103', '90', '90')   --��renci notlar�

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111111', 'BLP104', '85', '85')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111111', 'BLP105', '80', '80')


INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP101', '95', '100')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP102', '85', '95')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP103', '70', '85')  --��renci notlar�

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP104', '90', '99')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP105', '88', '85')


INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP101', '55', '20')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP102', '68', '75')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP103', '77', '45')  --��renci notlar�

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP104', '69', '96')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111112', 'BLP105', '03', '25')


INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111113', 'BLP101', '45', '66')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111113', 'BLP102', '25', '95')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111113', 'BLP103', '50', '65')  --��renci notlar�

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111113', 'BLP104', '95', '85')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111113', 'BLP105', '99', '19')


INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111114', 'BLP101', '96', '76')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111114', 'BLP102', '35', '65')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111114', 'BLP103', '60', '65')  --��renci notlar�

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111114', 'BLP104', '85', '88')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111114', 'BLP105', '26', '99')


INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111115', 'BLP101', '56', '06')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111115', 'BLP102', '45', '08')  --��renci notlar�

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111115', 'BLP103', '85', '75')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111115', 'BLP104', '77', '50')

INSERT INTO notlar(tcNo, dKod, vize, final) VALUES ('11111111115', 'BLP105', '35', '97')


--sorgular 

SELECT * FROM notlar


DELETE FROM dersler WHERE dersKod LIKE 'B%'  --B harfi ile ba�layan dersleri siler

SELECT * FROM ogrenci WHERE soyad='kaya' -- Soyad� kaya olan 

SELECT * FROM ogrenci where telefon LIKE '05%' --TELEFON NUMARASI 05 �LE BA�LAYAN NUMARALAR

SELECT * FROM notlar where (vize=45 OR vize=85) AND dKod IN ('BLP101', 'BPL102') --SE��L� DERSLERDE NOTLARI 45 VE 85 OLANLARI G�STERME

SELECT * FROM dersler where dersKod IN ('BLP102', 'BLP103') --ders kodu 102 ve 103 olan� getirdi(filtreleme sistemi)

SELECT * FROM notlar WHERE vize<50  -- vize zay�f alan �grenciler 

SELECT * FROM ogrenci WHERE tcNo='11111111112'  --girilen tc kimlik sahibinin bilgilerini ekrana getirme 

SELECT * FROM ogrenci where cinsiyet LIKE 'K' -- ��RENC� TABLOSUNDAK� KIZ ��RENC�LER� G�STERME

SELECT * FROM ogrenci where email LIKE '%outlook%' --mail adresleri outlook olan kay�tlar� g�sterme

SELECT * FROM ogrenci where dtarih BETWEEN '1992-01-01' and '1998-12-31'  --1992 ile 1998 aras� do�an ��renciler

SELECT * FROM  notlar WHERE vize>50 AND final<50 --vizesi iyi olup finalden d���k alan ��renciler



