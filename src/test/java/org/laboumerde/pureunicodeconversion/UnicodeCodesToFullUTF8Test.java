/**
 * 
 */
package org.laboumerde.pureunicodeconversion;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.laboumerde.pureunicodeconversion.converters.DummyConverter;
import org.laboumerde.pureunicodeconversion.converters.UnicodeToNativeUTF8;
import org.laboumerde.pureunicodeconversion.interfaces.Converter;

/**
 * @author etudiant
 *
 */
public class UnicodeCodesToFullUTF8Test {

	/**
	 * Ressource path
	 */
	private final static String ressourcePath = "src/test/resources/";

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {

	}

	
	@Test
	public final void testUnicodeInUTF8(){
		//preparing the test files
		String inputFile = ressourcePath + "Language_fr_4TEST_ORIG.properties";
		String outputFile = ressourcePath + "Language_fr_4TEST_FINAL_TO_VERIFY.properties";
		String referenceOutput = ressourcePath + "Language_fr_4TEST_FINAL.properties";
		
		//running the test
		String[] args = {"UNIC_TO_UTF8",inputFile,outputFile};
		Main.main(args);
		
		// comparing the files
		// read and compare each line
		Converter converter = new UnicodeToNativeUTF8();
		
		try {
			Path path = Paths.get(outputFile);
			List<String> outputLines = Files.readAllLines(path, converter.getDefaultOutputCharset());
			Path refPath = Paths.get(referenceOutput);
			List<String> refOutputLines = Files.readAllLines(refPath, converter.getDefaultOutputCharset());
			for (int i=0; i < refOutputLines.size(); i++) {
				String refLine = refOutputLines.get(i);
				String line = outputLines.get(i);
				assertTrue((refLine== null && line == null) || refLine.compareTo(line) == 0);
			}
			
			// clean
			Files.delete(Paths.get(ressourcePath + "Language_fr_4TEST_FINAL_TO_VERIFY.properties"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		//clean

		
	}

	@Test
	public final void testDummy(){
		//preparing the test files
		String inputFile = ressourcePath + "Language_fr_4TEST_ORIG.properties";
		String outputFile = ressourcePath + "Language_fr_4TEST_FINAL_NOT_CONVERTED_TO_VERIFY.properties";
		String referenceOutput = ressourcePath + "Language_fr_4TEST_FINAL.properties";
		
		//running the test
		String[] args = {"DUMMY",inputFile,outputFile};
		Main.main(args);
		
		// comparing the files
		// read and compare each line
		Converter converter = new DummyConverter();
		
		try {
			Path path = Paths.get(outputFile);
			List<String> outputLines = Files.readAllLines(path, converter.getDefaultOutputCharset());
			Path refPath = Paths.get(referenceOutput);
			List<String> refOutputLines = Files.readAllLines(refPath, converter.getDefaultOutputCharset());
			boolean notTheSame = false;
			for (int i=0; i < refOutputLines.size(); i++) {
				String refLine = refOutputLines.get(i);
				String line = outputLines.get(i);
				notTheSame = !((refLine== null && line == null) || refLine.compareTo(line) == 0);
				if (notTheSame){
					break;
				}
			}
			assertTrue(notTheSame);
			
			// clean
			Files.delete(Paths.get(ressourcePath + "Language_fr_4TEST_FINAL_NOT_CONVERTED_TO_VERIFY.properties"));

		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		//checkgin the results
		
	}
}
