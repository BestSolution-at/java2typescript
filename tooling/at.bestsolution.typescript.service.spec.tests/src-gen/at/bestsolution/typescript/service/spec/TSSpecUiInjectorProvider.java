/*
 * generated by Xtext
 */
package at.bestsolution.typescript.service.spec;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class TSSpecUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return at.bestsolution.typescript.service.spec.ui.internal.TSSpecActivator.getInstance().getInjector("at.bestsolution.typescript.service.spec.TSSpec");
	}
	
}
