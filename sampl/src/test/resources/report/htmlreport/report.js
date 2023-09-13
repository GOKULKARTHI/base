$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/amazonlogin.feature");
formatter.feature({
  "name": "To verify login function in amazon application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@amazon"
    }
  ]
});
formatter.scenario({
  "name": "To verify valid emailid",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@amazon"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
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
formatter.step({
  "name": "To user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user enter url",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.toUserEnterUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user enter valid emaild",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.toUserEnterValidEmaild()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click continue butttton",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.toClickContinueButttton()"
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
formatter.uri("file:src/test/resources/FeatureFiles/login.feature");
formatter.feature({
  "name": "To Verify login function in facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@facebook"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "location": "StepDefinition.to_user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify valid email and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@facebook"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To user pass url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.to_user_pass_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user pass invaild username and invalid password",
  "rows": [
    {
      "cells": [
        "username-1",
        "red@gmail.com"
      ]
    },
    {
      "cells": [
        "password-1",
        "1111"
      ]
    },
    {
      "cells": [
        "username-2",
        "blue@gmail.com"
      ]
    },
    {
      "cells": [
        "password-2",
        "2222"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.toUserPassInvaildUsernameAndInvalidPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user click continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.toUserClickContinueButton()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[@name\u003d\u0027logn\u0027]\"}\n  (Session info: chrome\u003d111.0.5563.65)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-RIGKATV\u0027, ip: \u0027192.168.1.52\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 111.0.5563.65, chrome: {chromedriverVersion: 111.0.5563.64 (c710e93d5b63..., userDataDir: C:\\Users\\zubee\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:63301}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 40d8f144504d931565127960fda8ff88\n*** Element info: {Using\u003dxpath, value\u003d//button[@name\u003d\u0027logn\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat org.baseclass.UtilClass.elementClick(UtilClass.java:58)\r\n\tat org.stepdefinition.StepDefinition.toUserClickContinueButton(StepDefinition.java:47)\r\n\tat ✽.To user click continue button(file:src/test/resources/FeatureFiles/login.feature:16)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
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