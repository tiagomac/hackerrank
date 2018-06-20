package tiagomac.org;

import java.util.*;
import java.io.*;

public class Day8 {
	

	public static void main(String []argh){
		Map<String, Integer> m = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            if (name != null && phone>0) {
            	m.put(name, phone);
            }
        }
        Integer phone = null;
        while(in.hasNext()){
            String s = in.next();
            phone = m.get(s);
            if (phone != null) {
            	System.out.println(s+"="+phone);
            } else {
            	System.out.println("Not found");
            }
        }
        in.close();
    }
}
