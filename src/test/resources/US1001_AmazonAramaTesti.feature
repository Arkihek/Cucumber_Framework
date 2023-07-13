Feature: US1001 Amazon arama testi

  Scenario: TC01 Kullanici amazonda Nutella arayabilmeli

    Given kullanici amazon anasayfaya gider
    Then arama kutusuna Nutella yazip, ENTER tusuna basar
    And arama sonuclarinin Nutella icerdigini test eder
    Then sayfayi kapatir

  Scenario: TC02 Kullanici amazonda Samsung aratabilmeli

    Given kullanici amazon anasayfaya gider
    Then arama kutusuna Samsung yazip, ENTER tusuna basar
    And arama sonuclarinin Samsung icerdigini test eder
    Then sayfayi kapatir

  Scenario: TC03 Kullanici amazonda Java arayabilmeli

    Given kullanici amazon anasayfaya gider
    Then arama kutusuna Java yazip, ENTER tusuna basar
    And arama sonuclarinin Java icerdigini test eder
    Then sayfayi kapatir