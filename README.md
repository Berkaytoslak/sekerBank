# Getting Started

1. adım: Entegre olması için dosya dizinine komut ile java dosyaları çekilmiştir.
   ~/IdeaProjects/sekerBank/src/main/java/com/example/sekerbank/test
   wsimport -p client -keep "http://www.dneonline.com/calculator.asmx?wsdl"
2. adım: Kullanılacak servis methodları için testler yazılmıştır.
3. adım: Kullanılacak servisin methodları yazılıp, client de bulunan soap dosyaları servise entegre edilmiştir.
4. adım: Test edilebilmesi için controller katmanı eklenmiştir.
5. adım: eklenen controller katmanını test edebilmek için aşağıda ki end-pointler hazırlanmıştır.

#### Toplama işlemi
http://localhost:8080/add?firsDigit=12&secondDigit=9

#### Çıkarma işlemi
http://localhost:8080/subtract?firsDigit=7&secondDigit=5

#### Çarpma işlemi
http://localhost:8080/multiply?firsDigit=12&secondDigit=5

#### Bölme işlemi
http://localhost:8080/divide?firsDigit=8&secondDigit=2
