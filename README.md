# screenfullgwt
[![Build Status](https://travis-ci.org/fworks/screenfullgwt.svg?branch=master)](https://travis-ci.org/fworks/screenfullgwt)

Simple gwt wrapper for the screenfull.js (cross-browser usage of the JavaScript Fullscreen API  http://sindresorhus.com/screenfull.js)

# maven

```
<dependency>
  <groupId>com.github.fworks</groupId>
  <artifactId>screenfullgwt</artifactId>
  <version>3.0</version>
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

# Note

Note that it is just a wrapper for the screenfull.js file defined here.
Please go to http://sindresorhus.com/screenfull.js to see more details about the js.            

