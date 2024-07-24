# Getting Started

1. adım: Entegre olması için dosya dizinine komut ile java dosyaları çekilmiştir.
   ~/IdeaProjects/sekerBank/src/main/java/com/example/sekerbank/test
   wsimport -p client -keep "http://www.dneonline.com/calculator.asmx?wsdl"
2. adım: Kullanılacak servis methodları için testler yazılmıştır.
3. adım: Kullanılacak servisin methodları yazılıp, client de bulunan soap dosyaları servise entegre edilmiştir.
4. adım: Test edilebilmesi için controller katmanı eklenmiştir.
5. adım: eklenen kontroller katmanını test edebilmek için aşağıda ki endpointler hazırlanmıştır.

#### Toplama işlemi
http://localhost:8080/add?a=5&b=3

#### Çıkarma işlemi
http://localhost:8080/subtract?a=5&b=3

#### Çarpma işlemi
http://localhost:8080/multiply?a=5&b=3

#### Bölme işlemi
http://localhost:8080/divide?a=6&b=3
