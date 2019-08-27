package file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class fileDemo {
 public static void main(String[] args) {
	File f=new File(".");
	String[] list;
	if(args.length==0) {
		list=f.list();
	}
	else {
		list=f.list(new DirFilter(args[0]));
	}
//	Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
	for(String dir:list) {
		System.out.println(dir);
	}
 	}
}
 class DirFilter implements FilenameFilter{
	 private Pattern pattern;
	 
	public DirFilter(String string) {
		// TODO Auto-generated constructor stub
		pattern=Pattern.compile(string);
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return pattern.matcher(name).matches();
	}
	
}