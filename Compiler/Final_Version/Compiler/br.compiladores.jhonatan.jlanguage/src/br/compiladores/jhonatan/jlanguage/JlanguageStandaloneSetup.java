/*
 * generated by Xtext 2.30.0-SNAPSHOT
 */
package br.compiladores.jhonatan.jlanguage;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class JlanguageStandaloneSetup extends JlanguageStandaloneSetupGenerated {

	public static void doSetup() {
		new JlanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
