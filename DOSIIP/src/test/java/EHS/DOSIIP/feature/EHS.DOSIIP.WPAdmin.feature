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
 
 
 
 
 
 
  #Sprint-4
  #Story: DOS-42 State by State Landing Page: Overview + Map
  @Reg
  Scenario: As a user I shall be able to see the fully designed State Map page.
    Given the user is in state.gov
    When the user is in United State Impact Overview page
    Then the user shall be able to see the United State Impact Overview header
    And the Select a State for State-Specific Impact title
    And the Plain Text Version hyperlink
    When the user click on the Plain Text Version Hyperlink
    Then the impact overview map shall disappear
    And the View Impact by State list shall appear
    And the Interactive Map version hyperlink shall replace Plain Text Version hyperlink
    When the user click on Interactive Map Version hyperlink
    Then the View Impact By State list shall disappear
    And the Impact Overviw map shall reappear
    When the user hover over the mouse to California in the map
    Then the user shall be able to see the tooltip having the full State name

 
  #Sprint - 6
  #Story: DOS-244 Biography Template: Create Biography collection template
  @Regn @InProgress
  Scenario: As a user I shall be able to create a Biography page using biography templete.
    Given the user is "Add New Page" page having biography templete
    When the user Insert Page Title in "Enter Title Here" edit box
    And insert Collection: Header Description edit box
    And select Breadcrumb from the dropown menu
    And Select eleven personal from the Curated Biography list
    And publish the page
    And Click on "view Page" button for preview
    Then the biography page should have a Breadcrumb hyperlink
    And the page title
    And the description
    And ten personal selected
    And "Next" hyperlink to navigate to next page
