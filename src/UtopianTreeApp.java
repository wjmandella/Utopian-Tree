// My solution to the HacherRank.com problem "Utopian Tree."
// https://www.hackerrank.com/challenges/utopian-tree/problem

import java.util.Scanner;

public class UtopianTreeApp {

    static int utopianTree(int n) {
        // Complete this function
    	int treeHt = 1;
    	if(n % 2 == 0) {
    		treeHt = (int) (Math.pow(2, ((n/2)+1)))-1;
    	} else {
    		treeHt = 2*((int) (Math.pow(2, ((n+1)/2)))-1);
    	}   	
    	return treeHt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of test cases, T (integer 1-10): ");
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            System.out.print("Enter the number of cycles, N (integer 0-60) for test case #"+(a0+1)+": ");
            int n = in.nextInt();
            int result = utopianTree(n);
            System.out.println(result);
        }
        in.close();
    }
}
