package org.swtbot.memoria.escuchador.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.swtbot.memoria.model.TestRecordProject;
import org.swtbot.memoria.model.impl.ModelFactoryImpl;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SwtBotRecordedHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	
	private boolean isActivate = false;
	
	public SwtBotRecordedHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"Escuchador",
				"Hello, Eclipse world");
		
		isActivate = !isActivate;
		
		final Job job = new Job ("Escuchador de eventos SWT...") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				while (isActivate) {
					System.out.println("funcionando...");
					
					Display display = Display.getCurrent();
				      //may be null if outside the UI thread
				      if (display == null)
				         display = Display.getDefault();
				      
				      TestRecordProject project = ModelFactoryImpl.eINSTANCE.createTestRecordProject();
				      final EList<org.swtbot.memoria.model.Event> eventos = project.getEventos();
					
				      
				      display.addFilter(SWT.PUSH, new Listener() {

						@Override
						public void handleEvent(Event event) {
							System.out.println("si ...PUSH" + event);							
							eventos.add(fillTestEvent(event));
						}
				    	  
				      }) ;
				      
				      display.addFilter(SWT.Selection, new Listener() {

							@Override
							public void handleEvent(Event event) {
								System.out.println("si ...Selection" + event);
								eventos.add(fillTestEvent(event));
							}
					    	  
					      }) ;
				      
				      display.addFilter(SWT.SELECTED, new Listener() {

				 				@Override
				 				public void handleEvent(Event event) {
				 					System.out.println("si ...SELECTED" + event);
				 					eventos.add(fillTestEvent(event));
				 				}
				 		    	  
				 		      }) ;
				      
				      display.addFilter(SWT.MouseEnter, new Listener() {

					 				@Override
					 				public void handleEvent(Event event) {
					 					System.out.println("si ...MouseEnter" + event);
					 					eventos.add(fillTestEvent(event));
					 				}
					 		    	  
					 		      }) ;
				      
				      
				      display.addFilter(SWT.KeyDown, new Listener() {

					 				@Override
					 				public void handleEvent(Event event) {
					 					System.out.println("si ...keyDown" + event);
					 					eventos.add(fillTestEvent(event));
					 				}
					 		    	  
					 		      }) ;
				      
				}
				return Status.OK_STATUS;
			}
			
		};
		
		job.setPriority(Job.SHORT);
		job.schedule();
		return null;
	}
	
	
	private org.swtbot.memoria.model.Event fillTestEvent (Event e) {
		org.swtbot.memoria.model.Event evento;
		evento = ModelFactoryImpl.eINSTANCE.createEvent();
		evento.setName(e.widget.toString());
		evento.setX(e.x);
		evento.setY(e.y);
		evento.setWidth(e.width);
		evento.setHeight(e.height);
		evento.setTime(e.time);
		return evento;
	}
}
