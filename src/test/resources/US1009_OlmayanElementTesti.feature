Feature: US1009 kullanici olmayan bir webelementi test eder

  @wip
  Scenario: TC15 olmayan butonu test edebilmeli

    Given kullanici "heroqaUrl" anasayfaya gider
    When Add Element butonuna basar
    And Delete butonunu gorunceye kadar bekler
    Then Delete butonunun gorunur oldugunu test eder
    And Delete butonuna basarak butonu siler
    And Delete butonunun gorunmedigini test eder
    And sayfayi kapatir
