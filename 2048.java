//package kattis;
/**According to kattis I completed this problem on 2017-12-27 10:40:22 (24hr)
**At the time I was very happy to have just finished this problem despite the obvious hardcoding
** I essentially figured out how to merge the cells any direction, but could not think of a way to put it all together
** which is why we're left with a bunch of boilerplate methods that are only slightly different to meet each merge need.
**Still you have to start somewhere, and I was proud when I finished this one all on my own.
**/

import java.util.Scanner;

public class TwentyFortyEight {
    private int[][] grid = new int[4][4];

    public TwentyFortyEight(int[][] grid) {
        this.grid = grid;
    }

    public void mergeLeft() {
        int[][] numberSlot = new int[4][4];

        for (int i = 0; i < grid.length; i++) {

            int numSize = 4;
            int pos = 0;
            int recMerge = 0;

            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] != 0) {
                    numberSlot[i][pos] = grid[i][j];
                    pos++;

                } else
                    numSize--;
            }
            for (int k = 0; k < grid[i].length; k++) {
                if (numSize > 0) {
                    grid[i][k] = numberSlot[i][k];
                    numSize--;
                } else {
                    grid[i][k] = 0;
                }
            }
            for (int m = 0; m < grid[i].length - 1; m++) {
                if (grid[i][m] == grid[i][m + 1] && grid[i][m] != recMerge) {
                    grid[i][m] += grid[i][m + 1];
                    grid[i][m + 1] = 0;
                }
            }

            numSize = 4;
            pos = 0;

            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] != 0) {
                    numberSlot[i][pos] = grid[i][j];
                    pos++;

                } else
                    numSize--;
            }
            for (int k = 0; k < grid[i].length; k++) {
                if (numSize > 0) {
                    grid[i][k] = numberSlot[i][k];
                    numSize--;
                } else {
                    grid[i][k] = 0;
                }

            }
        } // end outer loop

    }
    
    public void mergeRight() {
        int[][] numberSlot = new int[4][4];
        for(int i = 0; i < grid.length; i++) {
            
            int numSize = 0, pos = 0, recMerge = 0;
            
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] != 0) {
                    numberSlot[i][pos] = grid[i][j];
                    pos++;
                }
                else numSize++;
            }
            pos = 0;
            for(int k = 0; k < grid[i].length; k++) {
                if(k < numSize)
                    grid[i][k] = 0;
                else {
                    grid[i][k] = numberSlot[i][pos];
                    pos++;
                }
            }
            
            for (int m = grid[i].length - 1; m > 0; m--) {
                if (grid[i][m] == grid[i][m - 1] && grid[i][m] != recMerge) {
                    grid[i][m] += grid[i][m - 1];
                    recMerge = grid[i][m];
                    grid[i][m - 1] = 0;
                }
            }
            
             numSize = 0;
             pos = 0;
             
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] != 0) {
                    numberSlot[i][pos] = grid[i][j];
                    pos++;
                }
                else numSize++;
            }
            pos = 0;
            for(int k = 0; k < grid[i].length; k++) {
                if(k < numSize)
                    grid[i][k] = 0;
                else {
                    grid[i][k] = numberSlot[i][pos];
                    pos++;
                }
            }
        }
    }
    
    public void mergeUp() {
        int[][] numberSlot = new int[4][4];
        
        for(int j = 0; j < grid.length; j++) {

            int numSize = 4;
            int pos = 0;
            int recMerge = 0;
            
            for(int i = 0; i < grid[j].length; i++) {
                if(grid[i][j] != 0) {
                    numberSlot[j][pos] = grid[i][j];
                    pos++;
                    
                }
                else numSize--;
            }
            
            pos = 0;
            for(int k = 0; k < grid[j].length; k++) {
                if( k < numSize) {
                    grid[k][j] = numberSlot[j][pos];
                    pos++;
                }
                else {
                    grid[k][j] = 0;
                }
            }
            
           for(int m = 0; m < grid[j].length - 1; m++) {
               if(grid[m][j] == grid[m+1][j] && grid[m][j] != recMerge) {
                   grid[m][j] += grid[m+1][j];
                   grid[m+1][j] = 0;
                   recMerge = grid[m][j];
                   }
           }
           
             numSize = 4;
             pos = 0;
             
             for(int i = 0; i < grid[j].length; i++) {
                    if(grid[i][j] != 0) {
                        numberSlot[j][pos] = grid[i][j];
                        pos++;
                        
                    }
                    else numSize--;
                }
                
                pos = 0;
                for(int k = 0; k < grid[j].length; k++) {
                    if( k < numSize) {
                        grid[k][j] = numberSlot[j][pos];
                        pos++;
                    }
                    else {
                        grid[k][j] = 0;
                    }
                }
        }
    }
    
    public void mergeDown() {
        int[][] numberSlot = new int[4][4];
        
        for(int j = 0; j < grid.length; j++) {
            int pos = 0, recMerge = 0, numSize = 0;
            for(int i = 0; i < grid[j].length; i++) {
                if(grid[i][j] != 0) {
                    numberSlot[pos][j] = grid[i][j];
                    pos++;
                }
                else numSize++;
            }
            
            pos = 0;
            for(int k = 0; k < grid[j].length; k++) {
                if(k < numSize) {
                    grid[k][j] = 0;
                }
                else {
                    grid[k][j] = numberSlot[pos][j];
                    pos++;
                }
            }
            
            for(int m = grid[j].length - 1; m > 0 ; m--) {
                if(grid[m][j] == grid[m - 1][j] && grid[m][j] != recMerge) {
                    grid[m][j] += grid[m-1][j];
                    grid[m-1][j] = 0;
                    recMerge = grid[m][j];
                }
            }
            pos = 0;
            numSize = 0;
            
            for(int i = 0; i < grid[j].length; i++) {
                if(grid[i][j] != 0) {
                    numberSlot[pos][j] = grid[i][j];
                    pos++;
                }
                else numSize++;
            }
            
            pos = 0;
            for(int k = 0; k < grid[j].length; k++) {
                if(k < numSize) {
                    grid[k][j] = 0;
                }
                else {
                    grid[k][j] = numberSlot[pos][j];
                    pos++;
                }
            }
        }
        
        
    }

    public void seeAry() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            if(i != grid.length - 1)
            System.out.println();
        }
    }

    public static void main(String[] args)  {
        Scanner inp = new Scanner(System.in);
        int[][] grid = new int[4][4];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                grid[i][j] = inp.nextInt();

            }
        }
        
        int input = inp.nextInt();
        inp.close(); //close Scanner
        
        TwentyFortyEight tfe = new TwentyFortyEight(grid);     //create instance of the class
        
        switch(input) {
        
        case 0:
            tfe.mergeLeft();
            tfe.seeAry();
            break;
        
        case 1:
            tfe.mergeUp();
            tfe.seeAry();
            break;
            
        case 2: 
            tfe.mergeRight();
            tfe.seeAry();
            break;
        
        case 3: 
            tfe.mergeDown();
            tfe.seeAry();
            break;
        
        default: System.out.println("None of the cases were used.");
        }
    }

}
