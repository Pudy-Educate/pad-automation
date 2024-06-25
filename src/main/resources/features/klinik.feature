Feature: Add Klinik

  Scenario: validate user can login
    Given user is on the login page
    When user enters valid credentials
    And user clicks on the login button
    Then user should be redirected to the homepage

  Scenario: Add a new klinik
    Given the user is on home page klinik
    When the user navigates to the klinik section
    And clicks on the Tambah Klinik button
    And enters the klinik name "Klinik Pratama Swa"
    And enters the klinik address "Jl. Raya Bogor No. 1"
    And enters the klinik phone number "087716616639"
    And enters the klinik email "klinikpratamaswa19@gmail.com"
    And enters the password "password123"
    And enters the time klinik open
    And enters the time klinik close
    And enters the description "Klinik Pratama Swa adalah klinik yang berlokasi di Jl. Raya Bogor No. 1"
    And enters image of klinik
    And click the "Tambahkan" button
    Then click klinik confirmation
  Scenario: Delete Klinik
    Given the user is on klinik section
    When the user navigates to the klinik section
    And clicks on the Hapus button on "Klinik Pratama Swa"
    And click delete klinik confirmation
    Then clik OK confirmation

