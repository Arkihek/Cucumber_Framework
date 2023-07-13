Feature: US1004 Amazonda listeden ilk urununu dogru oldugunu test eder

  @wip
  Scenario: TC08 ilk urun ismi arttirdigimiz kelimeyi icermeli

    Given kullanici "amazonUrl" anasayfaya gider
    Then arama kutusuna "Nutella" yazip, ENTER tusuna basar
    When ilk urunu tiklar
    Then urun isminde "Nutella" oldugunu test eder
    And sayfayi kapatir