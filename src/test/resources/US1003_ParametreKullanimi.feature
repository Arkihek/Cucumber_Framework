Feature: US1003 Amazonda parametre olarak urun arama


  Scenario: TC07 Parametre olarak girilen urun aratilabilmeli

    Given kullanici "amazonUrl" anasayfaya gider
    Then arama kutusuna "Banana" yazip, ENTER tusuna basar
    And arama sonuclarinin "Banana" icerdigini test eder
    And 2 saniye bekler
    Then sayfayi kapatir

    # step yazarken sayi kullanilirsa
    # otomatik olarak parametre kabul eder.