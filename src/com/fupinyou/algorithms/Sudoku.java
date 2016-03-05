package com.fupinyou.algorithms;

import java.util.HashSet;
import java.util.Set;
class Sudoku {
    /**
      * 请判定一个数独是否有效。该数独可能只填充了部分数字，其中缺少的数字用 . 表示。
      * @param board: the board
        @return: wether the Sudoku is valid
      */
    public static boolean isValidSudoku(char[][] board) {
        Set<Character> hs0=new HashSet<Character>();
        Set<Character> hs1=new HashSet<Character>();
        Set<Character> hs2=new HashSet<Character>();
        int n0=0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                 hs0.add(board[i][j]);
                 if(board[i][j]=='.')
                 {
                     n0++;
                 }
            }
            if(hs0.size()!=(10-n0)){
            	System.out.println("在第一个for中    ：    "+hs0.size());
                return false;}
                
                hs0.clear();
                n0=0;
        }
        
        
        
        int n1=0;
        for(int j=0;j<9;j++){
            for(int i=0;i<9;i++){
                 hs1.add(board[i][j]);
                 if(board[i][j]=='.')
                 {
                     n1++;
                 }
            }
            if(hs1.size()!=(10-n1)){
            	System.out.println("在第二个for中    ：    "+hs1.size());
                 return false;}
                 
                 hs1.clear();
                 n1=0;
        }
        
        
        
        
        int n2=0;
            for(int i=0;i<9;i=i+3){
                for(int j=0;j<9;j=j+3){
                    for(int a=0;a<3;a++){
                        for(int b=0;b<3;b++){
                            hs2.add(board[i+a][j+b]);
                            if(board[i+a][j+b]=='.')              
                                n2++; 
                                }
                            }                                   
                 if(hs2.size()!=(10-n2)){
                	 System.out.println("在第三个for中    ：    "+hs2.size());
                     return false;
                 }                 
                 hs2.clear();
                 n2=0;
                        }
                    }
    
         return true;
    }
public static void main(String[] args){
    boolean boo;
    char[][] c=new char[9][9];
    String[] str=new String[] {".87654321","2........","3........","4........","5........","6........","7........","8........","9........"};
    for(int i=0;i<9;i++){
        c[i]=str[i].toCharArray();
    }
    boo=isValidSudoku(c);
    
    System.out.println(boo);
}

}
