package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) throws IOException {
	read();
	}
	
	
	public static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		String line = br.readLine();
		int n= (Integer.parseInt(line));
		line = br.readLine();
		int i=0;
		String array[] = null;
		while(i<=n) {
			array = line.split(" ");
			bubbleSort(array);
			line = br.readLine();
			i++;
		}
		br.close();
	}
	
	
	public static void bubbleSort(String array[]) {
		double change = 0;
		double total = 0;
	for (int i = 0; i < array.length-1 ; i++) { 
		total++;
		for (int j = 0; j < array.length-1; j++) {
			if(Double.parseDouble(array[j]) > Double.parseDouble(array[j+1])) {
				double temp = Double.parseDouble(array[j]);
				array[j] = array[j+1];
				array[j+1] = String.valueOf(temp);
				change++;
				}
			}
	
		}
	double average = change/total;
	double newAverage = Math.floor(average*100);
	double newAverage2 = newAverage/100;
	String delete = Arrays.toString(array);
	String withoutComa = delete.replace(",", "");
	System.out.println(newAverage2+"-"+withoutComa.substring(1,withoutComa.length()-1));


	}

}
