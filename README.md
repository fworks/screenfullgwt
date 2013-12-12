screenfullgwt
=============

Simple gwtwrapper for the screenfull.js (cross-browser usage of the JavaScript Fullscreen API  http://sindresorhus.com/screenfull.js)


maven
=============

    <dependency>
      <groupId>com.github.fworks</groupId>
      <artifactId>screenfullgwt</artifactId>
      <version>1.0</version>
    </dependency>


How to use
==========


1) Inherit the module

        <!-- fullscreen -->
        <inherits name="com.github.fworks.screenfullgwt.ScreenFullGWT" />
        

2) Just call the static class methods

        ScreenFull.toggleFullScreen();
        
Example (adding the toggle fullscreen on a button click handler:

            getView().getFullscreen().addClickHandler(new ClickHandler() {
                @Override
                public void onClick(ClickEvent event) {
                    ScreenFull.toggleFullScreen();
                }
            });
            
            
            
