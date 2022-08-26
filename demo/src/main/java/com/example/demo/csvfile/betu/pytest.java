package com.example.demo.csvfile.betu;

public class pytest {

    public static void main(String[] args) {
        int a=5,b=2,c=4;
       /* for(int i=3 ;i<6;++i){
            a= (b+i)+b;
        }
        for(int i=3 ;i<6;++i){
            a= i+i;
        }*/

       // System.out.println(a+b);
       // aa();
       // System.out.println("va "+ a2(1,3));
        a78();
    }

    static  void a78(){

        int p,q=4, r=6;
        p=(4^6)+q;
        System.out.println(p+q+r);
    }
    static  void  aa(){

        int a=6,b=3,c=10;
        int p=9,q=6,r=5;



        for(int i=3;i<4;++i){

            p=(i^3)+i;
            q=(18+p);
            p=7+p;
            p=(p&3)+i;

           /* if((p+q)>(i-p)){
                continue;
            }
            q=p+r;
            q=(8+7)^p;
*/
        }

      //  System.out.println(p+q);
       /* if((c+b)+ (b&a)>(c&b+a)){
            System.out.println(a+a);// 12
            //b=15 // 21
        }*/
       // System.out.println((12+1)&b);
    }

    static  int  a2(int a, int b){

        if((4-a)>(a-b) && b<4){
            b=(a+1)+a;
            b=6+b;
            a=(b+2)+b;
            return a+ a2(a,b);
        }
        b= 5+a;
        return a;
    }

}
