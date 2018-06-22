package com.github.fworks.screenfullgwt.client;

import com.github.fworks.screenfullgwt.client.resources.Resources;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;

/**
 * ScreenFullGWT entry point.
 * 
 * @author flaviolcastro
 *
 */
public class ScreenFullGwt implements EntryPoint {

  @Override
  public void onModuleLoad() {
    // inject js
    ScriptInjector.fromString(Resources.RESOURCES.screenfullMinScript().getText())
        .setWindow(ScriptInjector.TOP_WINDOW).inject();
  }
}
