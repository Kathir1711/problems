
class Temparray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] temp2=new int[1];
        temp2=a;
        int [] temp=a;
        for(int i:temp2)
        {
            System.out.print(i+" ");
        }
    }
}
