public class Dubler {
    public int[] twice(int[]x) {
        int r=0;
        int[]x1=new int[x.length*2];
        for(int i=0; i<x.length; i=i+1) {
            x1[r]=x[i];
            r=r+1;
            x1[r]=x[i];
            r=r+1;
        }
        return x1;
    }
}