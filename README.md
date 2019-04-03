# screenfullgwt

![Travis (.org) branch](https://img.shields.io/travis/fworks/screenfullgwt/master.svg)
![Maven Central](https://img.shields.io/maven-central/v/com.github.fworks/screenfullgwt.svg)
![GitHub](https://img.shields.io/github/license/fworks/screenfullgwt.svg)

Simple gwt wrapper for the screenfull.js

"Simple wrapper for cross-browser usage of the JavaScript Fullscreen API, which lets you bring the page or any element into fullscreen. Smoothens out the browser implementation differences, so you don't have too." (http://sindresorhus.com/screenfull.js)

# maven

```
<dependency>
  <groupId>com.github.fworks</groupId>
  <artifactId>screenfullgwt</artifactId>
  <version>4.0.1</version>
</dependency>
```

# How to use

1) Inherit the module
```
<!-- fullscreen -->
<inherits name="com.github.fworks.screenfullgwt.ScreenFullGWT" />
```    

2) Just call the static methods
```
ScreenFull.toggleFullScreen();
ScreenFull.requestFullScreen();
ScreenFull.isFullScreen();
ScreenFull.element();
ScreenFull.enabled();
ScreenFull.exitFullScreen();
// and more
```				
        
Example (adding the toggle fullscreen on a button click handler:
```
fullscreenButton.addClickHandler(new ClickHandler() {
  @Override
  public void onClick(ClickEvent event) {
    ScreenFull.toggleFullScreen();
  }
});
```            

# Notes

Note that it is just a wrapper for the screenfull.js file defined here.

Please go to http://sindresorhus.com/screenfull.js to see more details about the js.            

