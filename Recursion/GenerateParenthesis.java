package Recursion;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 2;
        char[] ch = new char[n*2];
        int i = 0;

        generateParenthesis(n,ch,i,0,0);
    }

    public static void generateParenthesis(int n, char[] ch, int index, int openCount, int closeCount) {
        if(index==2*n) {
            System.out.println(ch);
        }

        if(openCount<n) {
            ch[index] = '(';
            generateParenthesis(n, ch, index+1, openCount+1, closeCount);
        }  if(closeCount<openCount) {
            ch[index] = ')';
            generateParenthesis(n, ch, index+1, openCount, closeCount+1);
        }
    }
}
