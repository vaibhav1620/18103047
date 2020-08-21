import java.util.Scanner;

public class Ques4{
    public static void main(String args[])
    {
        Scanner Obj=new Scanner(System.in);
        System.out.println("ENTER STRING 1 :  ");
        String s1=Obj.nextLine();

        System.out.println("ENTER STRING 2 :  ");
        String s2=Obj.nextLine();

        int arr[]=new int[257];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
        for(int i=0;i<s1.length();i++)
        {
            int x=s1.charAt(i);
            arr[x]++;
        }
        for(int i=0;i<s2.length();i++)
        {
            int x=s2.charAt(i);
            if(arr[x]>0)
            {
                arr[x]--;
            }
        }
        int f=0;
        for(int i=0;i<257;i++)
        {
            if(arr[i]>0)
            {
                f=1;
            }
        }
        if(f==1)
        {
            System.out.println("THE STRINGS ARE NOT ANAGRAMS");
        }
        else
        {
            System.out.println("THE STRINGS ARE ANAGRAMS");
        }
    }
}
