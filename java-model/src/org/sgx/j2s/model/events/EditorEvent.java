package org.sgx.j2s.model.events;

import org.sgx.j2s.model.editor.Editor;
import org.sgx.j2s.model.events.Event;
import org.sgx.j2s.model.events.EventTarget;

/**
 * el evento en un editor permite recuperar el valor editado actualmente en el 
 * editor con getValue() (subclass implementation)
 * 
 * el target de un editorEvent es el editor editorEvent.target
 * 
 * @author SGURIN
 *
 * @param <T>
 */
public class EditorEvent<T> implements Event {
	T value;
	EventTarget target;
	
	public EditorEvent(EventTarget target, T value) {
		super();
		this.target = target;
		this.value=value;
	}
	public T  getValue(){return value;}
	public EventTarget getTarget() {
		return target;
	}
}
