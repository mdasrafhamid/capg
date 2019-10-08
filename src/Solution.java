import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

	
	/*
     * Complete the similarStrings function below.
     */
    static int[] similarStrings(String s, int n, int[][] queries) {
        /*
         * Write your code here.
         */
    	int a;
    	int b;
    	
    	for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < queries.length; j++) {
				
			}
		}
    	
    	return new int[] {1,2,3};
    }
    
    private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) throws IOException {
		
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		
		String[] nq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nq[0].trim());

        int q = Integer.parseInt(nq[1].trim());
        
        String s = scanner.nextLine();

        int[][] queries = new int[q][2];

        for (int queriesRowItr = 0; queriesRowItr < q; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = similarStrings(s, n, queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
//            bufferedWriter.write(String.valueOf(result[resultItr]));
        	System.out.println(String.valueOf(result[resultItr]));
        	
        	
            if (resultItr != result.length - 1) {
//                bufferedWriter.write("\n");
            	System.out.println("\n");
            }
        }

//        bufferedWriter.newLine();

//        bufferedWriter.close();
	}

}
