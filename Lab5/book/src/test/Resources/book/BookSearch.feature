Feature: Book search
  To allow a customer to find his favourite books quickly, the library must offer multiple ways to search for a book.
 
  Scenario: Search books by author
    Given a book with the title 'One good book', written by 'Anonymous'
      And another book with the title 'Some other book', written by 'Tim Tomson'
      And another book with the title 'other book', written by 'Tim Tomson'
      And another book with the title 'How to cook a dino', written by 'Fred Flintstone'
    When the customer searches for books published by 'Tim Tomson'
    Then 2 books should have been found
      And Book 1 should have the title 'Some other book'
      And Book 2 should have the title 'other book'