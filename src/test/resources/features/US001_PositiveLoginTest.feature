@smoke @us01
Feature: US1001 Positive login testi
  @tc01
  Scenario: TC01 Email ile Positive Login Testi
    Given kullanici trendyol uygulamasını acar
    And kullanici hesabım tab ina tiklar
    Then kullanici mail olarak "ValidEmail" girer
    And kullanici password olarak "ValidPassword" girer
    And kullanici giris yap butonuna tiklar
    And kullanicinin basarili olarak giris yaptıgı test edilir
    And kullanici uygulamayi kapatir


