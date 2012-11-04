package org.swtbot.memoria.model.ui.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class UiDiagramTypeProvider extends AbstractDiagramTypeProvider {

	public UiDiagramTypeProvider() {
		super();
		setFeatureProvider(new UiFeatureProvider(this));
	}
}
