package com.engineerAnsh.java_1;

public class loops {
    public static void main(String[] args) {
       // FOR LOOPS:--
        // printing 1 to 100000
//        for (int i = 1;i<=100000;i *= 10) {
//            System.out.println(i);
//        }

//        for (int i = 1 , j = 1 ;  j<=6;  i *= 10,j++){
//            System.out.println(i);
//        }

        // counting digits of a number:
        int no = 433233,cnt = 0;
        while(no != 0){
            no = (int)(no/10);
            cnt++;
        }
        System.out.println(cnt);

        // factorial :
        int n = 6;
        int ans = 1;
        while(n!=0)
        {
            ans = ans *n;
            n-- ;
        }
        System.out.println(ans);
    }

}
