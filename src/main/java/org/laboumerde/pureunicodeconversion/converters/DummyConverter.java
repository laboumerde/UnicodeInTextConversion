package org.laboumerde.pureunicodeconversion.converters;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.apache.commons.lang3.StringUtils;
import org.laboumerde.pureunicodeconversion.Constants;
import org.laboumerde.pureunicodeconversion.interfaces.Converter;

/**
 * @author laboumerde
 * Unicode codes  to native UTF8 converter.
 */
public class DummyConverter implements Converter,Constants {
	
	@Override
	public  String convert(String text){
		return text;
	}

	@Override
	public Charset getDefaultInputCharster() {
		return  StandardCharsets.US_ASCII;
	}

	@Override
	public Charset getDefaultOutputCharset() {
		return  StandardCharsets.UTF_8;
	}
}
