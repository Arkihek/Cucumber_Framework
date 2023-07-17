Feature: US1006 Kullanici yanlis bilgilerle giris yapamaz
  @wip
  Scenario: TC10 kullanici gecerli username ve gecersiz password ile giris yapamamali

    Given kullanici "qdUrl" anasayfaya gider
    Then anasayfada login linkine click yapar
    And email kutusuna "qdID" yazar
    And password kutusuna "qdGecersizPassword" yazar
    When login butonuna basar
    Then basarili olarak giris yapilamadigini test eder
    And 3 saniye bekler
    And sayfayi kapatir
  @wip
  Scenario: TC11 kullanici gecersiz username ve gecerli password ile giris yapamamali

    Given kullanici "qdUrl" anasayfaya gider
    Then anasayfada login linkine click yapar
    And email kutusuna "qdGecersizID" yazar
    And password kutusuna "qdPassword" yazar
    When login butonuna basar
    Then basarili olarak giris yapilamadigini test eder
    And 3 saniye bekler
    And sayfayi kapatir

  @wip
  Scenario: TC12 kullanici gecersiz username ve gecersiz password ile giris yapamamali

    Given kullanici "qdUrl" anasayfaya gider
    Then anasayfada login linkine click yapar
    And email kutusuna "qdGecersizID" yazar
    And password kutusuna "qdGecersizPassword" yazar
    When login butonuna basar
    Then basarili olarak giris yapilamadigini test eder
    And 3 saniye bekler
    And sayfayi kapatir
