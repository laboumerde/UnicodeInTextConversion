package org.laboumerde.pureunicodeconversion.interfaces;

import java.nio.charset.Charset;

/**
 * @author laboumerde
 * Converter interface
 */
public interface Converter {

	/**
	 * conversion action
	 * @param text
	 * @return
	 */
	public String convert(String text);
	
	/**
	 * Get default charset for input file
	 * @return
	 */
	public Charset getDefaultInputCharster();
	
	/**
	 * Get default charset for output file
	 * @return
	 */
	public Charset getDefaultOutputCharset();
}
