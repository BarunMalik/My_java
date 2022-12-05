import java.util.Scanner;
public class Bubble_sort{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a[]=new int[10];
       for(int i=0;i<a.length;i++){
        System.out.println("Enter number");
        a[i]=sc.nextInt();
       } 
       for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length-1-i;j++){
            if(a[j]>a[1+j]){
                int temp=a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
            }
        }
       }
       System.out.println("Sorted array in ascending order");
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
    }

}