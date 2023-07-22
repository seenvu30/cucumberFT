$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featurefiles/loginPage.feature");
formatter.feature({
  "name": "To verfy Login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate login function valid and invalid datas",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To user launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "To user enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "To user Click loginbutton",
  "keyword": "And "
});
formatter.step({
  "name": "To user verify valid",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "java",
        "111"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate login function valid and invalid datas",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.toUserLaunchChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user enter \"java\" and \"111\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDef.toUserEnterAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user Click loginbutton",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDef.toUserClickLoginbutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user verify valid",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.toUserVerifyValid()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[contains(text(),\u0027Find\u0027)]\"}\n  (Session info: chrome\u003d114.0.5735.199)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-RIGKATV\u0027, ip: \u0027192.168.1.56\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 114.0.5735.199, chrome: {chromedriverVersion: 114.0.5735.16 (7e1ff058633f..., userDataDir: C:\\Users\\zubee\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60183}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: f3efa45c5bd0c3097e0259a8ebe36cad\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(),\u0027Find\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.stepdefiniton.StepDefinition.toUserVerifyValid(StepDefinition.java:51)\r\n\tat ✽.To user verify valid(file:src/test/resources/Featurefiles/loginPage.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Featurefiles/loginfunction.feature");
formatter.feature({
  "name": "To validate Login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@loginPage"
    }
  ]
});
formatter.scenario({
  "name": "To validate invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@loginPage"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.toUserLaunchChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user enter valid url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.toUserEnterValidUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user pass invalid username and invalid password",
  "rows": [
    {
      "cells": [
        "email",
        "phno",
        "password"
      ]
    },
    {
      "cells": [
        "java@123",
        "1111",
        "java"
      ]
    },
    {
      "cells": [
        "sql@111",
        "2222",
        "sql"
      ]
    },
    {
      "cells": [
        "selenium@123",
        "3333",
        "selenium"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.toUserPassInvalidUsernameAndInvalidPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.toUserClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user Close chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.toUserCloseChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});