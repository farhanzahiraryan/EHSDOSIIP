$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EHS.DOSIIP.WPAdmin.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: faryan@eagleharborsolutions.com"
    },
    {
      "line": 2,
      "value": "#Project: DOS IIP"
    },
    {
      "line": 3,
      "value": "#Owner: Eagle Harbor Solutions"
    },
    {
      "line": 4,
      "value": "#Epic: DOS-4 Ensure admin users are able to edit necessary fields in wp-admin dashboard"
    }
  ],
  "line": 5,
  "name": "EHSDOSIIP WP-Admin Functionalities.",
  "description": "",
  "id": "ehsdosiip-wp-admin-functionalities.",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 7,
      "value": "#Sprint-3"
    },
    {
      "line": 8,
      "value": "#Story: DOS-44 Ambasador Feed"
    }
  ],
  "line": 10,
  "name": "As a Admin I shall be able to to pull ambassador information from embassy site by JSON Rest URL.",
  "description": "",
  "id": "ehsdosiip-wp-admin-functionalities.;as-a-admin-i-shall-be-able-to-to-pull-ambassador-information-from-embassy-site-by-json-rest-url.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Regrassion"
    },
    {
      "line": 9,
      "name": "@Sprint-3"
    },
    {
      "line": 9,
      "name": "@Demo"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "the admin is in Country edit page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "the admin enter JSON Rest URL and Update",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the Country page in State.gov must have the Ambassador\u0027s Official Portrait,Name and Biography",
  "keyword": "Then "
});
formatter.match({
  "location": "EGHSDOSIIP_DOS4_AmbassadorFeed.the_admin_is_in_Country_edit_page()"
});
formatter.result({
  "duration": 6556611957,
  "status": "passed"
});
formatter.match({
  "location": "EGHSDOSIIP_DOS4_AmbassadorFeed.the_admin_enter_JSON_Rest_URL_and_Update()"
});
formatter.result({
  "duration": 6363537566,
  "status": "passed"
});
formatter.match({
  "location": "EGHSDOSIIP_DOS4_AmbassadorFeed.the_Country_page_in_State_gov_must_have_the_Ambassador_s_Official_Portrait_Name_and_Biography()"
});
formatter.result({
  "duration": 11959698696,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c...our-relationship/our[-]ambassador/\u003e but was:\u003c...our-relationship/our[]ambassador/\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat EHS.DOSIIP.EGHSDOSIIP_DOS4_AmbassadorFeed.the_Country_page_in_State_gov_must_have_the_Ambassador_s_Official_Portrait_Name_and_Biography(EGHSDOSIIP_DOS4_AmbassadorFeed.java:91)\r\n\tat ✽.Then the Country page in State.gov must have the Ambassador\u0027s Official Portrait,Name and Biography(EHS.DOSIIP.WPAdmin.feature:13)\r\n",
  "status": "failed"
});
formatter.scenario({
  "comments": [
    {
      "line": 15,
      "value": "#Sprint-4"
    },
    {
      "line": 16,
      "value": "#Story: DOS-38 State by State Landing Page: By the Numbers"
    }
  ],
  "line": 18,
  "name": "AS a Admin I shall be able to edit States By The Number sections.",
  "description": "",
  "id": "ehsdosiip-wp-admin-functionalities.;as-a-admin-i-shall-be-able-to-edit-states-by-the-number-sections.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Regrassion"
    },
    {
      "line": 17,
      "name": "@Sprint-4"
    },
    {
      "line": 17,
      "name": "@Demo"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "a admin is in a state edit page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "the admin insert Number and Label for Number into Numbers section",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "update the State",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "the Number and Label for Number shall display in the state.gov page",
  "keyword": "Then "
});
formatter.match({
  "location": "EHSDOSIIP_DOS38_StateByState_ByTheNumber.a_admin_is_in_a_state_edit_page()"
});
formatter.result({
  "duration": 9639875766,
  "status": "passed"
});
formatter.match({
  "location": "EHSDOSIIP_DOS38_StateByState_ByTheNumber.the_admin_insert_Number_and_Label_for_Number_into_Numbers_section()"
});
formatter.result({
  "duration": 1266059766,
  "status": "passed"
});
formatter.match({
  "location": "EHSDOSIIP_DOS38_StateByState_ByTheNumber.update_the_State()"
});
formatter.result({
  "duration": 39601007,
  "status": "passed"
});
formatter.match({
  "location": "EHSDOSIIP_DOS38_StateByState_ByTheNumber.the_Number_and_Label_for_Number_shall_display_in_the_state_gov_page()"
});
formatter.result({
  "duration": 2880921939,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c253,46[8]\u003e but was:\u003c253,46[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat EHS.DOSIIP.EHSDOSIIP_DOS38_StateByState_ByTheNumber.the_Number_and_Label_for_Number_shall_display_in_the_state_gov_page(EHSDOSIIP_DOS38_StateByState_ByTheNumber.java:99)\r\n\tat ✽.Then the Number and Label for Number shall display in the state.gov page(EHS.DOSIIP.WPAdmin.feature:22)\r\n",
  "status": "failed"
});
formatter.scenario({
  "comments": [
    {
      "line": 24,
      "value": "#Sprint -4"
    },
    {
      "line": 25,
      "value": "#Story: DOS-75 State by State Landing Page: Impact Highlights."
    }
  ],
  "line": 27,
  "name": "As a user I shall be able to edit State Impact Highlight section.",
  "description": "",
  "id": "ehsdosiip-wp-admin-functionalities.;as-a-user-i-shall-be-able-to-edit-state-impact-highlight-section.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@Regression1"
    },
    {
      "line": 26,
      "name": "@Demo"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "the user is in State edit page in WP-Admin",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "the user insert text title and url link for Economic Impact topic",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "the user insert text title and url link for Education and Exchange Impact topic",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "the user insert text title and url link for Travel Impact topic",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "the user insert text title and url link for Diplomacy Impact topic",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "the user click on Update button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "the user is in Domestic Impact Overview page",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "the State Impact Highlights appears",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "the Economic Impact inputs are in display",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "the user click on the \u0027more\u0027 in Econimic Impact input",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "it should navigate the user to Impact Highlights URL input",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "the user click on Education \u0026 Exchange",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "the inputs for Education \u0026 Exchange are in display",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "the user click on the \u0027more\u0027 in Education \u0026 Exchange input",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "it should navigate the user to Education \u0026 Exchange URL input",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "the user click on Travel",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "the inputs for Travel are in display",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "the user click on the \u0027more\u0027 in Travel input",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "it should navigate the user to Travel URL input",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "the user click on Diplomacy",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "the inputs for Diplomacy are in display",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "the user click on the \u0027more\u0027 in Diplomacy input",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "it should navigate the user to Diplomacy URL input",
  "keyword": "Then "
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_user_is_in_State_edit_page_in_WP_Admin()"
});
formatter.result({
  "duration": 16975652500,
  "status": "passed"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_user_insert_text_title_and_url_link_for_Economic_Impact_topic()"
});
formatter.result({
  "duration": 9593234055,
  "status": "passed"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_user_insert_text_title_and_url_link_for_Education_and_Exchange_Impact_topic()"
});
formatter.result({
  "duration": 8824825860,
  "status": "passed"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_user_insert_text_title_and_url_link_for_Travel_Impact_topic()"
});
formatter.result({
  "duration": 7830995600,
  "status": "passed"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_user_insert_text_title_and_url_link_for_Diplomacy_Impact_topic()"
});
formatter.result({
  "duration": 8006251899,
  "status": "passed"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_user_click_on_Update_button()"
});
formatter.result({
  "duration": 43912103,
  "status": "passed"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_user_is_in_Domestic_Impact_Overview_page()"
});
formatter.result({
  "duration": 3812823129,
  "status": "passed"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_State_Impact_Highlights_appears()"
});
formatter.result({
  "duration": 87292106,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003cFlorid[]\u003e but was:\u003cFlorid[a]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat EHS.DOSIIP.EHSDIOSIIP_DOS75_State_ImpactHighlights.the_State_Impact_Highlights_appears(EHSDIOSIIP_DOS75_State_ImpactHighlights.java:108)\r\n\tat ✽.Then the State Impact Highlights appears(EHS.DOSIIP.WPAdmin.feature:35)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_Economic_Impact_inputs_are_in_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_user_click_on_the_more_in_Econimic_Impact_input()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.it_should_navigate_the_user_to_Impact_Highlights_URL_input()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_user_click_on_Education_Exchange()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_inputs_for_Education_Exchange_are_in_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_user_click_on_the_more_in_Education_Exchange_input()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.it_should_navigate_the_user_to_Education_Exchange_URL_input()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_user_click_on_Travel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_inputs_for_Travel_are_in_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_user_click_on_the_more_in_Travel_input()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.it_should_navigate_the_user_to_Travel_URL_input()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_user_click_on_Diplomacy()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_inputs_for_Diplomacy_are_in_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.the_user_click_on_the_more_in_Diplomacy_input()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EHSDIOSIIP_DOS75_State_ImpactHighlights.it_should_navigate_the_user_to_Diplomacy_URL_input()"
});
formatter.result({
  "status": "skipped"
});
});