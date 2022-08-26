# language: en

  Feature: Finder digital Ebooks
    Me as a reader
    I want to select digital ebooks on the website

    @digital-ebooks
    Scenario: Finder digital ebooks
      Given I'm on the website
      When I click on digital ebooks
      Then  the digital ebook is shown

    @no-ebooks
    Scenario: Access non-ebook area
      Given I'm on the website
      When I click on the non-books area
      Then  the ebook area is no shown


