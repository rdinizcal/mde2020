/*
 * generated by Xtext 2.19.0
 */
package org.xtext.assignment3.msdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MSDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/assignment3/msdsl/parser/antlr/internal/InternalMSDsl.tokens");
	}
}
