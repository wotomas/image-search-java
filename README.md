# About Image Search Java Library
## Introduction
Its a very simple library that gets String Text value as an input to get list of URLs for the image. It was originally made for the purpose to be used in my personal projects that require image URLs from google search. 

## Download
Download the latest JAR or by adding repository to gradle and
```
repositories {
    maven {
        url  "http://dl.bintray.com/wotomas/maven" 
    }
}
```

grabbing via Gradle

```
compile 'info.kimjihyok.maven:ImageSearch:0.2'
```

## Example
Image Search Java Library allows you to grab simple URLs from google by using the following one line of code:
```java
CustomSearch.initialize(TestConstants.TEST_API, TestConstants.TEST_ENGINE_KEY);
ArrayList<String> list = CustomSearch.image("Dog"); 
```

## Frequently Asked Questions
**Where does the TEST.API and TEST_ENGINE_KEY come from?**
  - Search Google Custom Search API
  - Get the API Key and your personal search engine key

