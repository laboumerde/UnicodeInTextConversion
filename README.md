# UnicodeInTextConversion

Current version: 0.0.1-SNAPSHOT

## What for?

My example : I have a java properties file for translations. All unicode characters are coded like "\u00E9". This is a logical output with my tranlsation tool.

This is usually not a pb with java programs (but not in one I use).

I'm not an expert with charsets, and was not able to convert the files with other tools. So I coded a kind of utf generating tool to generate the correct unicode characters.

## How to use it?

For the moment there is only one option : convert to UTF8...

Here is an example of the command line :
 java -jar generatedjarfile.jar UNIC_TO_UTF8 input.properties output.properties

A runnable jar is available in the jar folder.

WARNINGS : 

* This code is really basic, it's on my repo mainly for backup and deployment tests. Please feel free for any comment and advice !
* You must Use java over 1.7 version

## License

Copyright (C) 2013 La Boumerde

This library is distributed under the GNU Lesser General Public License v3.0 (http://www.gnu.org/licenses/lgpl-3.0-standalone.html) and the Eclipse Public License v1.0 (http://www.eclipse.org/org/documents/epl-v10.html).
