package Recursion;
class RopeCuttingProblem {
     public static void main(String[] args) {
        int n = 15;
        int p = 5;
        int q = 8;
        int r = 7;
        int  totalPieces=  paperCutting(n,p,q,r);
        System.out.println(totalPieces);

    }

    public static int paperCutting(int n, int p, int q, int r) {
        if(n==0) {
            return 0;
        }
        if(n<0) {
            return -1;
        }

        int a=   paperCutting(n-p, p, q, r);
        int b = paperCutting(n-q,p,q,r);
        int c = paperCutting(n-r,p,q,r);

        int max = Math.max(a, Math.max(b,c));
        if(max==-1) {
            return -1;
        }
        return max+1;
    }
}