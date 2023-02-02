/*
 * generated by Xtext 2.30.0-SNAPSHOT
 */
package br.compiladores.jhonatan.jlanguage.ide;

import br.compiladores.jhonatan.jlanguage.JlanguageRuntimeModule;
import br.compiladores.jhonatan.jlanguage.JlanguageStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class JlanguageIdeSetup extends JlanguageStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new JlanguageRuntimeModule(), new JlanguageIdeModule()));
	}
	
}