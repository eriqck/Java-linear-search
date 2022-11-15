public class Binary {
    
    public static int[] list = new int[] {0,1,2,3,4,5,6,7,8,9};
    public static void main (String[] args)
     {

        if (binarySearch(list, 7))
        {
            System.out.println("Found the number!");
        }

         if (binarySearch(list, 7)) 
        {
        System.out.println("Found number 7!");
        }

        

    }

    private static boolean binarySearch(final int[] array, final int search) {
        int first =0;
        int last= array.length-1;
        int middle=(first+last)/2;

        while(first <= last) 
        {
            if (array[middle] < search)
            {
                first = middle+1;
            }

            else if (array[middle] == search)
            {
                return true;
            }
            else
            {
                middle = last-1;
            }

            middle = (last + first)/2;
        }
        return false;
    }


   

    
}
