package screenfullgwt.client;

import screenfullgwt.client.resources.Resources;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.HeadElement;
import com.google.gwt.dom.client.ScriptElement;

public class ScreenFullGWT implements EntryPoint {

	@Override
	public void onModuleLoad() {
		// inject js
		this.inject(Resources.RESOURCES.screenfullScript().getText());
	}

	/**
	 * Inject the js code
	 *
	 * @param javascript
	 */
	private void inject(String javascript) {
		HeadElement head = this.getHead();
		ScriptElement element = this.createScriptElement();
		element.setText(javascript);
		head.appendChild(element);
	}

	/**
	 * Create the script element
	 *
	 * @return
	 */
	private ScriptElement createScriptElement() {
		ScriptElement script = Document.get().createScriptElement();
		script.setAttribute("type", "text/javascript");
		script.setAttribute("charset", "UTF-8");
		return script;
	}

	/**
	 * Get the document header.
	 *
	 * @return
	 */
	private HeadElement getHead() {
		Element element = Document.get().getElementsByTagName("head").getItem(0);
		return HeadElement.as(element);
	}
}
