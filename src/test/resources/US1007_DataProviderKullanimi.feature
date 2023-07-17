Feature: US1007 Amazonda toplu olarak verilen kelimeleri aratir

  Scenario Outline: TC13 Kullanici listedeki tum urunler icin testi tekrarlayabilmeli

    Given kullanici "amazonUrl" anasayfaya gider
    Then arama kutusuna "<aranacakKelime>" yazip, ENTER tusuna basar
    And arama sonuclarinin "<aranacakKelime>" icerdigini test eder
    And 3 saniye bekler
    Then sayfayi kapatir

    Examples:
    |aranacakKelime|
    |Nutella|
    |Java   |
    |Samsung|
    |Cannes |
    |Nederland|
