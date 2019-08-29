package file;
// io/DirList1a.java

// TIJ4 Chapter IO, Exercise 1, page 906
/*/ Modify DirList.java (or one of it's variants) so that the FilenameFilter
* opens and reads each file (using the net.mindview.util.TextFile utility) 
* and accepts the file based on whether any of the trailing arguments on the
* command line exist in that file.
* (See also, Solution DirList1b.java)
*/

/* My solution to one of the exercises in 
* Thinking in Java 4th Edition (by Bruce Eckel).
* It compiles and runs correctly using JDK 1.6.0
* @author Greg Gordon
* @author www.greggordon.org
* January, 2008
*/

import java.util.regex.*;
import java.io.*;
import java.util.*;
import net.mindview.util.*;

public class DirList1a {
	public static void main(final String[] args) {
		TextFile a= new TextFile("E:\\20190827Demo\\thinkinJava\\IODemo\\src\\file\\DirList1a.java", "\\W+");
		System.out.println(a.toString());
		}
}
