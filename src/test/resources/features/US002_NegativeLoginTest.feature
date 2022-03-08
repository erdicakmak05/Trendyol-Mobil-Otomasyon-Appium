@smoke @us02
Feature: US1002 Negative login testi
  @tc02
  Scenario: TC02 Dogru mail yanlis password ile negative login testi
    Given kullanici trendyol uygulamasını acar
    And kullanici hesabım tab ina tiklar
    Then kullanici mail olarak "ValidEmail" girer
    And kullanici password olarak "InvalidPassword" girer
    And kullanici giris yap butonuna tiklar
    And kullanicinin giris yapamadigini test eder
    And kullanici uygulamayi kapatir
  @tc03
  Scenario: TC03 Yanlis mail dogru password ile negative login testi
    Given kullanici trendyol uygulamasını acar
    And kullanici hesabım tab ina tiklar
    Then kullanici mail olarak "InvalidEmail" girer
    And kullanici password olarak "ValidPassword" girer
    And kullanici giris yap butonuna tiklar
    And kullanicinin giris yapamadigini test eder
    And kullanici uygulamayi kapatir
  @tc04
  Scenario: TC04 Yanlis mail yanlis password ile negative login testi
    Given kullanici trendyol uygulamasını acar
    And kullanici hesabım tab ina tiklar
    Then kullanici mail olarak "InvalidEmail" girer
    And kullanici password olarak "InvalidPassword" girer
    And kullanici giris yap butonuna tiklar
    And kullanicinin giris yapamadigini test eder
    And kullanici uygulamayi kapatir
