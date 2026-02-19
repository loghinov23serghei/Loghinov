package org;

public class Exercise_Two {
    public static void main(String[] args){
        fibonaci();
    }
    public static void inversul(){
        String str = "cubic";
        String invers = "";
        for (int i = str.length()-1;i>=0;i--){
            invers+=str.charAt(i);
        }
        System.out.println(invers);
    }

    public static void alDoileaCelMaiMareNumar(){
        int[] array = {1,2,5,7,4,2,3,0,8,5,6,7,4,10};
        int max1 = 0;
        int max2 = 0;
        for (int i =0; i<array.length; i++){
            if (array[i]>max2 && array[i]!=max1){
                max2 = array[i];
                if (max2>max1){
                    int temp = max1;
                    max1=max2;
                    max2=temp;
                }
            }
        }
        System.out.println(max2);
    }

    public static void fibonaci(){
        int fib =10;
        int[] array = new int[10];
        int a =0;
        int b = 1;
        System.out.println(a+" ");
        System.out.println(b+" ");
        for(int i = 2; i<fib;i++){
            int num = a+b;
            System.out.println(num+" ");
            a=b;
            b=num;
        }
    }

}
