import java.util.Scanner;
import java.util.HashMap;


public class Ques2{
    public static void main(String args[])
    {
        Scanner Obj= new Scanner(System.in);

        System.out.println("ENTER A STRING :  ");
        String s=Obj.nextLine();

        System.out.println("ENTER THE NUMBER OF WORDS: ");
        int n;
        n=Obj.nextInt();
        String arr[]=new String[n+1];
        HashMap<String,Integer> map= new HashMap<String,Integer>();
        System.out.println("ENTER THE WORDS: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Obj.nextLine();
            map.put(arr[i],1);
        }
        int start=0,end=0;
        char ans[]=new char[s.length()+1];
        for(int i=0;i<s.length();i++)
        {
            ans[i]=s.charAt(i);
        }
        while(end<s.length())
        {
            if(s.charAt(end)==' ')
            {
                if(map.get(s.substring(start,end))!=null)
                {
                    for(int j=start+1;j<end;j++)
                    {
                        ans[j]='*';
                    }
                }
                start=end+1;
            }
            end++;
        }
        for(int z=0;z<ans.length;z++)
        {
            System.out.print(ans[z]);
        }
    }

}
