public class prueba {
    public static void main(String[] args) {
        int arre[]={1,2,3,4,5,6,7,8,9,10};
        int x=0;
        for (int i = 0; i < arre.length; i++) {
            x=x+i;
            arre[i]=x;
            
        }
        System.out.println(x);
    }
    
}
