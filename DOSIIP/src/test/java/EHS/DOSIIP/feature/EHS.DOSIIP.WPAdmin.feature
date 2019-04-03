#Author: faryan@eagleharborsolutions.com
#Project: DOS IIP
#Owner: Eagle Harbor Solutions
#Epic: DOS-4 Ensure admin users are able to edit necessary fields in wp-admin dashboard
Feature: EHSDOSIIP WP-Admin Functionalities.

  #Sprint-3
  #Story: DOS-44 Ambasador Feed
  @Regrassion @Sprint-3 @Demo
  Scenario: As a Admin I shall be able to to pull ambassador information from embassy site by JSON Rest URL.
    Given the admin is in Country edit page
    When the admin enter JSON Rest URL and Update
    Then the Country page in State.gov must have the Ambassador's Official Portrait,Name and Biography

  #Sprint-4
  #Story: DOS-38 State by State Landing Page: By the Numbers
  @Regrassion @Sprint-4 @Demo
  Scenario: AS a Admin I shall be able to edit States By The Number sections.
    Given a admin is in a state edit page
    When the admin insert Number and Label for Number into Numbers section
    And update the State
    Then the Number and Label for Number shall display in the state.gov page

  #Sprint -4
  #Story: DOS-75 State by State Landing Page: Impact Highlights.
  @Regression1 @Demo
  Scenario: As a user I shall be able to edit State Impact Highlight section.
    Given the user is in State edit page in WP-Admin
    When the user insert text title and url link for Economic Impact topic
    And the user insert text title and url link for Education and Exchange Impact topic
    And the user insert text title and url link for Travel Impact topic
    And the user insert text title and url link for Diplomacy Impact topic
    And the user click on Update button
    Given the user is in Domestic Impact Overview page
    Then the State Impact Highlights appears
    And the Economic Impact inputs are in display
    When the user click on the 'more' in Econimic Impact input
    Then it should navigate the user to Impact Highlights URL input
    When the user click on Education & Exchange
    Then the inputs for Education & Exchange are in display
    When the user click on the 'more' in Education & Exchange input
    Then it should navigate the user to Education & Exchange URL input
    When the user click on Travel
    Then the inputs for Travel are in display
    When the user click on the 'more' in Travel input
    Then it should navigate the user to Travel URL input
    When the user click on Diplomacy
    Then the inputs for Diplomacy are in display
    When the user click on the 'more' in Diplomacy input
    Then it should navigate the user to Diplomacy URL input
 
 
 
 
 
 