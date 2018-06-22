package com.github.fworks.screenfullgwt.client.ui;

import com.google.gwt.dom.client.Element;

/**
 * ScreenFull utilization class.<br>
 * It should be called by static methods.
 * 
 * @author flaviolcastro
 *
 */
public class ScreenFull {

  /**
   * Private constructor, avoiding instantiation.
   */
  private ScreenFull() {}

  /**
   * Toggle fullscreen.
   */
  public static native void toggleFullScreen() /*-{
    if ($wnd.screenfull && $wnd.screenfull.enabled) {
      $wnd.screenfull.toggle();
    }
  }-*/;

  /**
   * Request fullscreen for the page.
   */
  public static native void requestFullScreen() /*-{
    if ($wnd.screenfull && $wnd.screenfull.enabled) {
      $wnd.screenfull.request();
    }
  }-*/;

  /**
   * Request fullscreen for an element.
   * 
   * @param elem element
   */
  public static native void requestFullScreen(Element elem) /*-{
    if ($wnd.screenfull && $wnd.screenfull.enabled) {
      $wnd.screenfull.request(elem);
    }
  }-*/;

  /**
   * Exit fullscreen mode.
   */
  public static native void exitFullScreen() /*-{
    if ($wnd.screenfull && $wnd.screenfull.enabled) {
      $wnd.screenfull.exit();
    }
  }-*/;

  /**
   * Returns a boolean whether fullscreen is active.
   * 
   * @return is active
   */
  public static native boolean isFullScreen() /*-{
    if ($wnd.screenfull && $wnd.screenfull.enabled) {
      return $wnd.screenfull.isFullscreen;
    }
    return false;
  }-*/;

  /**
   * Returns the element currently in fullscreen, otherwise null.
   * 
   * @return element
   */
  public static native Element element() /*-{
    if ($wnd.screenfull && $wnd.screenfull.enabled) {
      return $wnd.screenfull.element;
    }
    return null;
  }-*/;

  /**
   * Returns a boolean whether you are allowed to enter fullscreen.<br>
   * If your page is inside an iframe you will need to add a allowfullscreen attribute (+
   * webkitallowfullscreen and mozallowfullscreen).
   * 
   * @return is enabled
   */
  public static native boolean enabled() /*-{
    if ($wnd.screenfull && $wnd.screenfull.enabled) {
      return $wnd.screenfull.enabled;
    }
    return false;
  }-*/;

  /**
   * Exposes the raw properties (prefixed if needed) used internally.<br>
   * Properties: requestFullscreen, exitFullscreen, fullscreenElement, fullscreenEnabled,
   * fullscreenchange, fullscreenerror
   * 
   * @return element
   */
  public static native Element raw() /*-{
     if ($wnd.screenfull && $wnd.screenfull.enabled) {
       return $wnd.screenfull.raw;
     }
     return null;
   }-*/;
}
