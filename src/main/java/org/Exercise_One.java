package org;

public class Exercise_One {
    public static void main(String[] args){

        factorial();
    }

    public static void numerelePare(){
        int[] masiv = {1,2,3,4,5,6,7,8,9,10};
        int[] array = new int[masiv.length];
        int index = 0;
        for (int i = 0; i<masiv.length; i++){
            if (masiv[i]%2 ==0){
                array[index]=masiv[i];
                index++;
            }
        }
        for (int i = 0; i<index;i++) {
            System.out.println(array[i]);
        }
    }

    public static void vocale(){
        String str = "Propozitie";
        int count = 0;
        for (int i =0; i<str.length();i++){
            if (str.charAt(i)=='a' || str.charAt(i)=='o' || str.charAt(i)=='i' || str.charAt(i)=='e' || str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void factorial(){
        int num = 6;
        int sum =1;
        for (int i = 1;i<=num; i++){
            sum*=i;
        }
        System.out.println(sum);
    }
}
