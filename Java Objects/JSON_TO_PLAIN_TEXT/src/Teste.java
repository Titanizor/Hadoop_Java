import java.io.File;
import java.net.URL;

import com.google.gson.*;

public class Teste {
	
public static void main(String[] args) {
	System.out.println("Hello World!!");
	
	System.out.println("Argument 1 " + args[0]);
	
	if (args[0] == null) {
		System.out.println("No Argument 1 was passed... aborting");
		System.exit(0);
	}
	
	Gson x = new Gson();
	x.toString();
	System.out.println("Gson Test - " + x.toString());
	
	URL location = Teste.class.getProtectionDomain().getCodeSource().getLocation();
    System.out.println("Java Location - " + location.getFile());
    
    
    File f = new File(args[0]);
    if(f.exists() && !f.isDirectory()) { 
        // do something
    }
    else {
		System.out.println("The file was not found.... aborting");
		System.exit(0);
    }
    
    
}
}

