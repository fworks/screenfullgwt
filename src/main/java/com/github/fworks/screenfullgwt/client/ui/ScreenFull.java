package com.github.fworks.screenfullgwt.client.ui;

import com.google.gwt.dom.client.Element;

public class ScreenFull {


	/**
	 * Toggle fullscreen
	 */
	public static native void toggleFullScreen() /*-{
	  	if ($wnd.screenfull.enabled) {
	  		$wnd.screenfull.toggle();
	  	}
	}-*/;

	/**
	 * Request fullscreen for the page
	 */
	public static native void requestFullScreen() /*-{
	  	if ($wnd.screenfull.enabled) {
	  		$wnd.screenfull.request();
	  	}
	}-*/;

	/**
	 * Request fullscreen for an element
	 * @param elem element
	 */
	public static native void requestFullScreen(Element elem) /*-{
	  	if ($wnd.screenfull.enabled) {
	  		$wnd.screenfull.request(elem);
	  	}
	}-*/;

	/**
	 * Exit fullscreen mode
	 */
	public static native void exitFullScreen() /*-{
	  	if ($wnd.screenfull.enabled) {
	  		$wnd.screenfull.exit();
	  	}
	}-*/;

	/**
	 * Returns a boolean whether fullscreen is active.
	 * @return is active
	 */
	public static native boolean isFullScreen() /*-{
	  	if ($wnd.screenfull.enabled) {
	  		return $wnd.screenfull.isFullscreen;
	  	}
	}-*/;

	/**
	 * Returns the element currently in fullscreen, otherwise null.
	 * @return element
	 */
	public static native Element element() /*-{
	  	if ($wnd.screenfull.enabled) {
	  		return $wnd.screenfull.element;
	  	}
	}-*/;

	/**
	 * Returns a boolean whether you are allowed to enter fullscreen. 
	 * If your page is inside an iframe you will need to add a allowfullscreen attribute (+ webkitallowfullscreen and mozallowfullscreen).
	 * @return is enabled
	 */
	public static native boolean enabled() /*-{
	  	if ($wnd.screenfull.enabled) {
	  		return $wnd.screenfull.enabled;
	  	}
	}-*/;

	/**
	 * Exposes the raw properties (prefixed if needed) used internally: requestFullscreen, exitFullscreen, fullscreenElement, fullscreenEnabled, fullscreenchange, fullscreenerror
	 * @return element
	 */
	public static native Element raw() /*-{
	  	if ($wnd.screenfull.enabled) {
	  		return $wnd.screenfull.raw;
	  	}
	}-*/;
}
