/*
 * generated by Xtext 2.19.0
 */
package org.xtext.assignment3.msdsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.assignment3.msdsl.ui.internal.MsdslActivator;

public class MSDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MsdslActivator.getInstance().getInjector("org.xtext.assignment3.msdsl.MSDsl");
	}

}
