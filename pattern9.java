public class pattern9 {
    public static void main(String[] args){
        int a=5;
         int b=0;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
              
                if(b==0){
                    b=1;
                }else{
                  b=0;
                }
                
                System.out.print(b+" ");
                
            }
            System.out.println();
        }
    }
}
