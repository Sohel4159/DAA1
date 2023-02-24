class Qsort1
{       
    //The first Index of a partition/block considered as pivot;

    static int quickSort(int a[],int low,int high)   // partition function
    {   
        int pivot=a[low];
      int i=low-1;
      int j=high+1;
      while(true)
      {  // jab tak pivot se bada element nahi milta ,tab tak i++ karneka
        do
        {
            i++;
        }while(a[i]<pivot);



        // jab tak pivot se chota= element nahi milta ,tab tak j-- karneka

        do 
        {
            j--;
        }while(a[j]>pivot);

          if(i>=j)
          {
            return j;
          }
      int t=a[i];
      a[i]=a[j];
      a[j]=t;

      }
      


    }  
      static void QuickSort(int a[],int low,int high)
    {
        if(low<high)
        {
            int p=quickSort(a,low,high);
             QuickSort(a,low,p);
             QuickSort(a,p+1,high);
        }
    }
    public static void main(String[] args)
    {
        int arr[]={5,3,8,4,2,7,4,41};
        QuickSort(arr,0,7);
        for(int i=0;i<8;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}