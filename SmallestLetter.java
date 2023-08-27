import java.util.*; 
class SmallestLetter
{
    public static char smallestLetter(char [] letters,char key)
    {
        int start=0;
        int end=letters.length-1;
        while(start<=end)
        {
            int mid= start +(end-start)/2;
            if(key<letters[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return letters[start % letters.length];
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=in.nextInt();
        char [] letters=new char[size];

        System.out.println("Enter the elements of array:");
        for(int i=0;i<size;i++)
        {
            letters[i]=in.next().charAt(0);
        }

        System.out.println("Enter the key:");
        char key=in.next().charAt(0);

        char  gg=smallestLetter(letters,key);
        System.out.println(gg);
    }
}
