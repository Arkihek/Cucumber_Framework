Feature: US1008 liste olarak verilen kullanicilar ile negatif login testi

  Scenario Outline: TC14 liste olarak verilen kullanicilar ile negatif login testi yapilabilmeli

    Given kullanici "qdUrl" anasayfaya gider
    Then anasayfada login linkine click yapar
    And email kutusuna listeden "<kullaniciAdi>" yazar
    And password kutusuna listeden "<password>" yazar
    When login butonuna basar
    And basarili olarak giris yapilamadigini test eder
    Then sayfayi kapatir

    Examples:
    |kullaniciAdi|password|
    |selgun      |123     |
    |iy          |321     |
    |aysegul     |34561   |
    |yusuf       |yusufyusuf|