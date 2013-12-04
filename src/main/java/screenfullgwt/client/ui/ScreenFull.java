package screenfullgwt.client.ui;

import com.google.gwt.dom.client.Element;

public class ScreenFull {


	public static native void toggleFullScreen() /*-{
	  	if ($wnd.screenfull.enabled) {
	  		$wnd.screenfull.toggle();
	  	}
	}-*/;

	public static native void requestFullScreen() /*-{
	  	if ($wnd.screenfull.enabled) {
	  		$wnd.screenfull.request();
	  	}
	}-*/;

	public static native void exitFullScreen() /*-{
	  	if ($wnd.screenfull.enabled) {
	  		$wnd.screenfull.exit();
	  	}
	}-*/;

	/**
	 * Returns a boolean whether fullscreen is active.
	 * @return
	 */
	public static native boolean isFullScreen() /*-{
	  	if ($wnd.screenfull.enabled) {
	  		return $wnd.screenfull.isFullscreen;
	  	}
	}-*/;

	/**
	 * Returns the element currently in fullscreen, otherwise null.
	 * @return
	 */
	public static native Element element() /*-{
	  	if ($wnd.screenfull.enabled) {
	  		return $wnd.screenfull.element;
	  	}
	}-*/;

	/**
	 * Returns a boolean whether you are allowed to enter fullscreen. If your page is inside an <iframe> you will need to add a allowfullscreen attribute (+ webkitallowfullscreen and mozallowfullscreen).
	 * @return
	 */
	public static native boolean enabled() /*-{
	  	if ($wnd.screenfull.enabled) {
	  		return $wnd.screenfull.enabled;
	  	}
	}-*/;

	/**
	 * Exposes the raw properties (prefixed if needed) used internally: requestFullscreen, exitFullscreen, fullscreenElement, fullscreenEnabled, fullscreenchange, fullscreenerror
	 * @return
	 */
	public static native Element raw() /*-{
	  	if ($wnd.screenfull.enabled) {
	  		return $wnd.screenfull.raw;
	  	}
	}-*/;


/*
	.raw

	Exposes the raw properties (prefixed if needed) used internally: requestFullscreen, exitFullscreen, fullscreenElement, fullscreenEnabled, fullscreenchange, fullscreenerror

	$(document).on(screenfull.raw.fullscreenchange, function () {
	    console.log('Fullscreen change');
	});*/
}
