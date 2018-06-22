package com.github.fworks.screenfullgwt.client.ui;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.DOM;

/**
 * ScreenFull class test.<br/>
 * Just testing the methods calls.<br/>
 * The proper methods will not really be tested because they are written in JSNI.
 * 
 * 
 * @author flaviolcastro
 *
 */
public class ScreenFullTest extends GWTTestCase {

  @Override
  public String getModuleName() {
    return "com.github.fworks.screenfullgwt.ScreenFullGWT";
  }

  public void testElement() {
    //
    assertTrue(ScreenFull.element() == null);
  }

  public void testEnabled() {
    //
    assertFalse(ScreenFull.enabled());
  }

  public void testIsFullScreen() {
    //
    assertFalse(ScreenFull.isFullScreen());
  }

  public void testExitFullScreen() {
    //
    ScreenFull.exitFullScreen();
  }
  
  public void testRequestFullScreen() {
    //
    ScreenFull.requestFullScreen();
  }
  
  public void testRequestFullScreenElement() {
    //
    ScreenFull.requestFullScreen(DOM.createButton());
  }
  
  public void testToggleFullScreen() {
    //
    ScreenFull.toggleFullScreen();
  }
  
  public void testRaw() {
    //
    assertTrue(ScreenFull.raw() == null);
  }

}
