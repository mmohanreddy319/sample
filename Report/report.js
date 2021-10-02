$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "education form",
  "description": "",
  "id": "education-form",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "enter the education form",
  "description": "",
  "id": "education-form;enter-the-education-form",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest,"
    },
    {
      "line": 3,
      "name": "@regression,"
    },
    {
      "line": 3,
      "name": "@endtoend"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I enter the name a Primary_School \"\u003cprimary_School\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the name a Secondary_School \"\u003csecondary_School\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter the name a Intermediate \"\u003cintermediate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter the name a Engineering \"\u003cengineering\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter the name a University \"\u003cuniversity\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter the intermediate_Percentage \"\u003cintermediate_Percentage\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on gender",
  "keyword": "When "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "education-form;enter-the-education-form;",
  "rows": [
    {
      "cells": [
        "primary_School",
        "secondary_School",
        "intermediate",
        "engineering",
        "University",
        "intermediate_Percentage"
      ],
      "line": 15,
      "id": "education-form;enter-the-education-form;;1"
    },
    {
      "cells": [
        "model mission high school",
        "model mission high school",
        "sri chaitanya",
        "pulla reddy engineering college",
        "JNTU",
        "Intermediate Percentage"
      ],
      "line": 16,
      "id": "education-form;enter-the-education-form;;2"
    },
    {
      "cells": [
        "model mission high school",
        "model mission high school",
        "sri chaitanya",
        "pulla reddy engineering college",
        "JNTU",
        "Intermediate Percentage"
      ],
      "line": 17,
      "id": "education-form;enter-the-education-form;;3"
    },
    {
      "cells": [
        "model mission high school",
        "model mission high school",
        "sri chaitanya",
        "pulla reddy engineering college",
        "JNTU",
        "Intermediate Percentage"
      ],
      "line": 18,
      "id": "education-form;enter-the-education-form;;4"
    },
    {
      "cells": [
        "model mission high school",
        "model mission high school",
        "sri chaitanya",
        "pulla reddy engineering college",
        "JNTU",
        "Intermediate Percentage"
      ],
      "line": 19,
      "id": "education-form;enter-the-education-form;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7142864805,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "enter the education form",
  "description": "",
  "id": "education-form;enter-the-education-form;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression,"
    },
    {
      "line": 3,
      "name": "@SmokeTest,"
    },
    {
      "line": 3,
      "name": "@endtoend"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I enter the name a Primary_School \"model mission high school\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the name a Secondary_School \"model mission high school\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter the name a Intermediate \"sri chaitanya\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter the name a Engineering \"pulla reddy engineering college\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter the name a University \"\u003cuniversity\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter the intermediate_Percentage \"Intermediate Percentage\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on gender",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "model mission high school",
      "offset": 35
    }
  ],
  "location": "Steps.i_enter_the_name_a_Primary_School(String)"
});
formatter.result({
  "duration": 342954223,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "model mission high school",
      "offset": 37
    }
  ],
  "location": "Steps.i_enter_the_name_a_Secondary_School(String)"
});
formatter.result({
  "duration": 191160376,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sri chaitanya",
      "offset": 33
    }
  ],
  "location": "Steps.i_enter_the_name_a_Intermediate(String)"
});
formatter.result({
  "duration": 89690639,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pulla reddy engineering college",
      "offset": 32
    }
  ],
  "location": "Steps.i_enter_the_name_a_Engineering(String)"
});
formatter.result({
  "duration": 157517591,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cuniversity\u003e",
      "offset": 31
    }
  ],
  "location": "Steps.i_enter_the_name_a_University(String)"
});
formatter.result({
  "duration": 151191443,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Intermediate Percentage",
      "offset": 37
    }
  ],
  "location": "Steps.i_enter_the_intermediate_Percentage(String)"
});
formatter.result({
  "duration": 4353348227,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_gender()"
});
formatter.result({
  "duration": 64918889,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 281823322,
  "status": "passed"
});
formatter.after({
  "duration": 126071585,
  "status": "passed"
});
formatter.before({
  "duration": 4980960946,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "enter the education form",
  "description": "",
  "id": "education-form;enter-the-education-form;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression,"
    },
    {
      "line": 3,
      "name": "@SmokeTest,"
    },
    {
      "line": 3,
      "name": "@endtoend"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I enter the name a Primary_School \"model mission high school\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the name a Secondary_School \"model mission high school\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter the name a Intermediate \"sri chaitanya\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter the name a Engineering \"pulla reddy engineering college\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter the name a University \"\u003cuniversity\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter the intermediate_Percentage \"Intermediate Percentage\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on gender",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "model mission high school",
      "offset": 35
    }
  ],
  "location": "Steps.i_enter_the_name_a_Primary_School(String)"
});
formatter.result({
  "duration": 186380935,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "model mission high school",
      "offset": 37
    }
  ],
  "location": "Steps.i_enter_the_name_a_Secondary_School(String)"
});
formatter.result({
  "duration": 168170690,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sri chaitanya",
      "offset": 33
    }
  ],
  "location": "Steps.i_enter_the_name_a_Intermediate(String)"
});
formatter.result({
  "duration": 160490598,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pulla reddy engineering college",
      "offset": 32
    }
  ],
  "location": "Steps.i_enter_the_name_a_Engineering(String)"
});
formatter.result({
  "duration": 204338538,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cuniversity\u003e",
      "offset": 31
    }
  ],
  "location": "Steps.i_enter_the_name_a_University(String)"
});
formatter.result({
  "duration": 104912497,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Intermediate Percentage",
      "offset": 37
    }
  ],
  "location": "Steps.i_enter_the_intermediate_Percentage(String)"
});
formatter.result({
  "duration": 4336372814,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_gender()"
});
formatter.result({
  "duration": 52939285,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 269786077,
  "status": "passed"
});
formatter.after({
  "duration": 129248499,
  "status": "passed"
});
formatter.before({
  "duration": 4657054723,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "enter the education form",
  "description": "",
  "id": "education-form;enter-the-education-form;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression,"
    },
    {
      "line": 3,
      "name": "@SmokeTest,"
    },
    {
      "line": 3,
      "name": "@endtoend"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I enter the name a Primary_School \"model mission high school\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the name a Secondary_School \"model mission high school\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter the name a Intermediate \"sri chaitanya\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter the name a Engineering \"pulla reddy engineering college\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter the name a University \"\u003cuniversity\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter the intermediate_Percentage \"Intermediate Percentage\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on gender",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "model mission high school",
      "offset": 35
    }
  ],
  "location": "Steps.i_enter_the_name_a_Primary_School(String)"
});
formatter.result({
  "duration": 177250468,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "model mission high school",
      "offset": 37
    }
  ],
  "location": "Steps.i_enter_the_name_a_Secondary_School(String)"
});
formatter.result({
  "duration": 209687620,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sri chaitanya",
      "offset": 33
    }
  ],
  "location": "Steps.i_enter_the_name_a_Intermediate(String)"
});
formatter.result({
  "duration": 88306284,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pulla reddy engineering college",
      "offset": 32
    }
  ],
  "location": "Steps.i_enter_the_name_a_Engineering(String)"
});
formatter.result({
  "duration": 175804981,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cuniversity\u003e",
      "offset": 31
    }
  ],
  "location": "Steps.i_enter_the_name_a_University(String)"
});
formatter.result({
  "duration": 113602595,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Intermediate Percentage",
      "offset": 37
    }
  ],
  "location": "Steps.i_enter_the_intermediate_Percentage(String)"
});
formatter.result({
  "duration": 4317906173,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_gender()"
});
formatter.result({
  "duration": 58382061,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 271729838,
  "status": "passed"
});
formatter.after({
  "duration": 129237731,
  "status": "passed"
});
formatter.before({
  "duration": 4650725331,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "enter the education form",
  "description": "",
  "id": "education-form;enter-the-education-form;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression,"
    },
    {
      "line": 3,
      "name": "@SmokeTest,"
    },
    {
      "line": 3,
      "name": "@endtoend"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I enter the name a Primary_School \"model mission high school\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the name a Secondary_School \"model mission high school\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter the name a Intermediate \"sri chaitanya\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter the name a Engineering \"pulla reddy engineering college\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter the name a University \"\u003cuniversity\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter the intermediate_Percentage \"Intermediate Percentage\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on gender",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "model mission high school",
      "offset": 35
    }
  ],
  "location": "Steps.i_enter_the_name_a_Primary_School(String)"
});
formatter.result({
  "duration": 184860300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "model mission high school",
      "offset": 37
    }
  ],
  "location": "Steps.i_enter_the_name_a_Secondary_School(String)"
});
formatter.result({
  "duration": 263970149,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sri chaitanya",
      "offset": 33
    }
  ],
  "location": "Steps.i_enter_the_name_a_Intermediate(String)"
});
formatter.result({
  "duration": 155692643,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pulla reddy engineering college",
      "offset": 32
    }
  ],
  "location": "Steps.i_enter_the_name_a_Engineering(String)"
});
formatter.result({
  "duration": 152614551,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cuniversity\u003e",
      "offset": 31
    }
  ],
  "location": "Steps.i_enter_the_name_a_University(String)"
});
formatter.result({
  "duration": 104656671,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Intermediate Percentage",
      "offset": 37
    }
  ],
  "location": "Steps.i_enter_the_intermediate_Percentage(String)"
});
formatter.result({
  "duration": 4321834716,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_gender()"
});
formatter.result({
  "duration": 58431650,
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 266477481,
  "status": "passed"
});
formatter.after({
  "duration": 135775863,
  "status": "passed"
});
});