package org.laboumerde.pureunicodeconversion;

/**
 * @author laboumerde
 * All the constants.
 */
public interface Constants {
	
	/*************************************************************************/
	/* PARAMETERS */
	/*************************************************************************/

	/**
	 * Unicode codes to UTF8 natives.
	 */
	public final static String CONV_UNICODE_CODES_TO_NATIVE_UTF8 = "UNIC_TO_UTF8";

	/**
	 * UTF8 codes to Unicode natives.
	 */
	public final static String CONV_NATIVE_UTF8_CODES_TO_UNICODE = "UTF8_TO_UNIC";
	
	
	/**
	 * Unicode codes to UTF8 natives.
	 */
	public final static String CONV_DUMMY = "DUMMY";
		
	/*************************************************************************/
	/* CONVERSION TABLES */
	/*************************************************************************/
	
	
	/**
	 * Correspondance table from UTF Code to native character.<br>
	 * The structure is the following : <br>
	 * UTF_CODE_TO_NATIVE_UTF8_CORRESPONDANCE_TABLE[x][0] = UTF CODE <br>
	 * UTF_CODE_TO_NATIVE_UTF8_CORRESPONDANCE_TABLE[x][1] = character in UTF8
	 */
	public final static String[][] UTF_CODE_TO_NATIVE_UTF8_CORRESPONDANCE_TABLE= {
			{"à",
			"\\u00e0"},
			{"â",
			"\\u00e2"},
			{"ä",
			"\\u00e4"},
			{"ç",
			"\\u00e7"},
			{"è",
			"\\u00e8"},
			{"é",
			"\\u00e9"},
			{"ê",
			"\\u00ea"},
			{"ë",
			"\\u00eb"},
			{"î",
			"\\u00ee"},
			{"ï",
			"\\u00ef"},
			{"ô",
			"\\u00f4"},
			{"ö",
			"\\u00f6"},
			{"ù",
			"\\u00f9"},
			{"û",
			"\\u00fb"},
			{"ü",
			"\\u00fc"},
			
			{"à",
			"\\u00E0"},
			{"â",
			"\\u00E2"},
			{"ä",
			"\\u00E4"},
			{"ç",
			"\\u00E7"},
			{"è",
			"\\u00E8"},
			{"é",
			"\\u00E9"},
			{"ê",
			"\\u00EA"},
			{"ë",
			"\\u00EB"},
			{"î",
			"\\u00EE"},
			{"ï",
			"\\u00EF"},
			{"ô",
			"\\u00F4"},
			{"ö",
			"\\u00F6"},
			{"ù",
			"\\u00F9"},
			{"û",
			"\\u00FB"},
			{"ü",
			"\\u00FC"},
			
			//added after debugging.. Yeah I forgot those ones...
			{"É",
			"\\u00c9"},
			{"É",
			"\\u00C9"},
			{"À",
			"\\u00c0"},
			{"À",
			"\\u00C0"},
			{"Â",
			"\\u00c2"},
			{"Â",
			"\\u00C2"},
			{"Ê",
			"\\u00ca"},
			{"Ê",
			"\\u00CA"},
			{"Î",
			"\\u00ce"},
			{"Î",
			"\\u00CE"}
	};

}
