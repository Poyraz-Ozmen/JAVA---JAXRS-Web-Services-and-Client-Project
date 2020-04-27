

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		try 
		{
			ArrayList<URL> url_list = new ArrayList<URL>();
			
			
			URL url  =  new URL("http://localhost:8080/PoyrazOzmenCS310Homework2WebService/rest/ProductWebService/addNewProduct/Apple/5.0/3000");
			url_list.add(url);
			
			url  =  new URL("http://localhost:8080/PoyrazOzmenCS310Homework2WebService/rest/ProductWebService/addNewProduct/Banana/12.0/22000");
			url_list.add(url);
			
			url  =  new URL("http://localhost:8080/PoyrazOzmenCS310Homework2WebService/rest/ProductWebService/addNewProduct/Grape/2.0/42000");
			url_list.add(url);
			
			url  =  new URL("http://localhost:8080/PoyrazOzmenCS310Homework2WebService/rest/ProductWebService/addNewProduct/WaterMelon/4.0/700");
			url_list.add(url);
			
			url  =  new URL("http://localhost:8080/PoyrazOzmenCS310Homework2WebService/rest/ProductWebService/deleteProduct/1");
			url_list.add(url);
			
			url  =  new URL("http://localhost:8080/PoyrazOzmenCS310Homework2WebService/rest/ProductWebService/updateProductStock/2/25.0/554");
			url_list.add(url);
			

		     
		    for (int counter = 0; counter < url_list.size(); counter++) { 		      
		    	
		    	
		    	URL url2 = url_list.get(counter);
		    	
		    	InputStreamReader reader = new InputStreamReader(url2.openStream());
				
				BufferedReader rd = new BufferedReader(reader);
				
				while(true)
				{
					String line = rd.readLine();
					if(line==null)
						break;
					System.out.println(line);
				}	
		    }   

			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
