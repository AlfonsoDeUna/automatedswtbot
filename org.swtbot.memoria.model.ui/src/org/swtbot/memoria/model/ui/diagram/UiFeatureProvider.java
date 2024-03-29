package org.swtbot.memoria.model.ui.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import org.swtbot.memoria.model.ui.features.AddDomainObjectConnectionConnectionFeature;
import org.swtbot.memoria.model.ui.features.AddDomainObjectFeature;
import org.swtbot.memoria.model.ui.features.CreateDomainObjectConnectionConnectionFeature;
import org.swtbot.memoria.model.ui.features.CreateDomainObjectFeature;
import org.swtbot.memoria.model.ui.features.LayoutDomainObjectFeature;


public class UiFeatureProvider extends DefaultFeatureProvider {

	public UiFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] {new CreateDomainObjectFeature(this)};
	}
	
	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] {new CreateDomainObjectConnectionConnectionFeature(this)};
	}
	
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		// TODO: check for right domain object instances below
		if (context instanceof IAddConnectionContext /* && context.getNewObject() instanceof <DomainObject> */) {
			return new AddDomainObjectConnectionConnectionFeature(this);
		} else if (context instanceof IAddContext /* && context.getNewObject() instanceof <DomainObject> */) {
			return new AddDomainObjectFeature(this);
		}

		return super.getAddFeature(context);
	}
	
	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		// TODO: check for right domain object instances below
		if (context.getPictogramElement() instanceof ContainerShape /* && getBusinessObjectForPictogramElement(context.getPictogramElement()) instanceof <DomainObject> */) {
			return  new LayoutDomainObjectFeature(this);
		}
	
		return super.getLayoutFeature(context);
	}
}
