package screenfullgwt.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface Resources extends ClientBundle {

	public static Resources RESOURCES = GWT.create(Resources.class);

	@Source("js/screenfull.min.js")
	TextResource screenfullScript();
}
