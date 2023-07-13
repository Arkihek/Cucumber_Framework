Feature: US1002 Kullanici Background kullanarak amazonda istedigi aramalari yapar

  # Scenariolardaki ortak baslangic adimlari kullanilir

  Background:
    Given kullanici amazon anasayfaya gider

  @smoke
  Scenario: TC04 Kullanici amazonda Nutella arayabilmeli
    Then arama kutusuna Nutella yazip, ENTER tusuna basar
    And arama sonuclarinin Nutella icerdigini test eder
    Then sayfayi kapatir

  @smoke
  Scenario: TC05 Kullanici amazonda Samsung aratabilmeli
    Then arama kutusuna Samsung yazip, ENTER tusuna basar
    And arama sonuclarinin Samsung icerdigini test eder
    Then sayfayi kapatir

  Scenario: TC06 Kullanici amazonda Java arayabilmeli
    Then arama kutusuna Java yazip, ENTER tusuna basar
    And arama sonuclarinin Java icerdigini test eder
    Then sayfayi kapatir