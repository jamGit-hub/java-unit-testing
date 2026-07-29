/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countpositive;

/**
 *
 * @author RAGHA
 */
public class CountPositive {

    /** 
     * @param x array to search
     * @return number of positive elements in x
     * @throws NullPointerException if x is null
     */
   public static int countPositive(int[] x) {
    int count = 0;
    for (int i = 0; i < x.length; i++) {
        if (x[i] >= 0) {
            count++;
        }
    }
    return count;
}
    public static void main(String[] argv) {
{       // Driver method for countPositive
        // Read an array from standard input, call countPositive()
        int []inArr = new int [argv.length];
        if (argv.length == 0)
        {
            System.out.println ("Usage: java CountPositive v1 [v2] [v3] ... ");
            return;
        }
        for (int i = 0; i< argv.length; i++)
        {
            try
            {
                inArr [i] = Integer.parseInt (argv[i]);
            }
            catch (NumberFormatException e)
            {
                System.out.println ("Entry must be a integer, using 1.");
                inArr [i] = 1;
            }
        }
        System.out.println ("Number of positive numbers is: " + countPositive (inArr));
}
}
    }
