package Algoritmi;
import java.io.IOException;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
public class wcounter {

	public static void main(String[] args) throws IOException {
		 
		        HashMap<String, Integer> WordsCounter = new HashMap<>();
		 
		        Scanner wordsFile = new Scanner(new File("C:\\Users\\Владислав\\.eclipse\\org.eclipse.oomph.p2\\cache\\wcounting\\words.txt"));
		        int counter;
		 
		        while (wordsFile.hasNextLine()) {
		 
		            counter = 0;
		            String searchedWord = wordsFile.nextLine().toLowerCase();
		            WordsCounter.put(searchedWord, counter);
		 
		            Scanner sampleFile = new Scanner(new File("C:\\Users\\Владислав\\.eclipse\\org.eclipse.oomph.p2\\cache\\wcounting\\sample.txt"));
		            while (sampleFile.hasNext()){
		                String searhedText = sampleFile.next().toLowerCase();
		                if (searhedText.contains(searchedWord)){
		                    counter++; 
		                }
		            }//end of while for sample.txt
		            sampleFile.close();
		        }//end of while for words.txt
		        wordsFile.close();
		 
		        Scanner resultFile = new Scanner(new File("C:\\Users\\Владислав\\.eclipse\\org.eclipse.oomph.p2\\cache\\result.txt"));
		        while (resultFile.hasNextLine()) {
		            String printText = resultFile.nextLine();
		            System.out.println(printText);
		        }//end of result
		            resultFile.close();
		 
		    }//end of main
		}//end of class