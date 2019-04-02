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
      "line": 77,
      "value": "#Sprint - 6"
    },
    {
      "line": 78,
      "value": "#Story: DOS-244 Biography Template: Create Biography collection template"
    }
  ],
  "line": 80,
  "name": "As a user I shall be able to create a Biography page using biography templete.",
  "description": "",
  "id": "ehsdosiip-wp-admin-functionalities.;as-a-user-i-shall-be-able-to-create-a-biography-page-using-biography-templete.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 79,
      "name": "@Regn"
    },
    {
      "line": 79,
      "name": "@InProgress"
    }
  ]
});
formatter.step({
  "line": 81,
  "name": "the user is \"Add New Page\" page having biography templete",
  "keyword": "Given "
});
formatter.step({
  "line": 82,
  "name": "the user Insert Page Title in \"Enter Title Here\" edit box",
  "keyword": "When "
});
formatter.step({
  "line": 83,
  "name": "insert Collection: Header Description edit box",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "select Breadcrumb from the dropown menu",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "Select eleven personal from the Curated Biography list",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "publish the page",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "Click on \"view Page\" button for preview",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "the biography page should have a Breadcrumb hyperlink",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "the page title",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "the description",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "ten personal selected",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "\"Next\" hyperlink to navigate to next page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Add New Page",
      "offset": 13
    }
  ],
  "location": "EHSDOSIIP_DOS244_Biography_Template.the_user_is_page_having_biography_templete(String)"
});
formatter.result({
  "duration": 16136007910,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enter Title Here",
      "offset": 31
    }
  ],
  "location": "EHSDOSIIP_DOS244_Biography_Template.the_user_Insert_Page_Title_in_edit_box(String)"
});
formatter.result({
  "duration": 64881,
  "status": "passed"
});
formatter.match({
  "location": "EHSDOSIIP_DOS244_Biography_Template.insert_Collection_Header_Description_edit_box()"
});
formatter.result({
  "duration": 17279,
  "status": "passed"
});
formatter.match({
  "location": "EHSDOSIIP_DOS244_Biography_Template.select_Breadcrumb_from_the_dropown_menu()"
});
formatter.result({
  "duration": 10931,
  "status": "passed"
});
formatter.match({
  "location": "EHSDOSIIP_DOS244_Biography_Template.select_eleven_personal_from_the_Curated_Biography_list()"
});
formatter.result({
  "duration": 17278,
  "status": "passed"
});
formatter.match({
  "location": "EHSDOSIIP_DOS244_Biography_Template.publish_the_page()"
});
formatter.result({
  "duration": 12694,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "view Page",
      "offset": 10
    }
  ],
  "location": "EHSDOSIIP_DOS244_Biography_Template.click_on_button_for_preview(String)"
});
formatter.result({
  "duration": 48308,
  "status": "passed"
});
formatter.match({
  "location": "EHSDOSIIP_DOS244_Biography_Template.the_biography_page_should_have_a_Breadcrumb_hyperlink()"
});
formatter.result({
  "duration": 11989,
  "status": "passed"
});
formatter.match({
  "location": "EHSDOSIIP_DOS244_Biography_Template.the_page_title()"
});
formatter.result({
  "duration": 10931,
  "status": "passed"
});
formatter.match({
  "location": "EHSDOSIIP_DOS244_Biography_Template.the_description()"
});
formatter.result({
  "duration": 8816,
  "status": "passed"
});
formatter.match({
  "location": "EHSDOSIIP_DOS244_Biography_Template.ten_personal_selected()"
});
formatter.result({
  "duration": 8816,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Next",
      "offset": 1
    }
  ],
  "location": "EHSDOSIIP_DOS244_Biography_Template.hyperlink_to_navigate_to_next_page(String)"
});
formatter.result({
  "duration": 78986,
  "status": "passed"
});
});