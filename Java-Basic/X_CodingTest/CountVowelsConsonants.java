package Basic_Java.X_CodingTest;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str=sc.nextLine();

        int totalVowels=countVowels(str.toLowerCase());
        System.out.println("Total vowels in a string : "+totalVowels);
        int totalConsonants=countConsonants(str);
        System.out.println("Total consonants in a string : "+totalConsonants);

    }

    public static int countVowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== 'a' || str.charAt(i)== 'e' ||str.charAt(i)== 'i' ||str.charAt(i)== 'o' ||str.charAt(i)== 'u'){
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(!(str.charAt(i)== 'a' || str.charAt(i)== 'e' ||str.charAt(i)== 'i' ||str.charAt(i)== 'o' ||str.charAt(i)== 'u')){
                count++;
            }
        }
        return count;
    }
}
