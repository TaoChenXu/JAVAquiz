package heapSort;
public class HeapSort2 {
    int[] arr;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HeapSort2 heapSor = new HeapSort2();
        int[] arr = {7,23,45,9,40,73,12,49};  
        heapSor.arr = arr;
        heapSor.heapSort(arr);
         
        for(int i=0;i<arr.length;i++)
            System.out.print(".."+arr[i]);
    }
    void heapAdjust(int[] arr,int s,int m)
    {
        int rc = arr[s];
         
        for(int j=2*s;j <= m;j = s*2){
            if(j<m && arr[j]<arr[j+1])
                j++;  
            if(rc >= arr[j]) break;
             arr[s] = arr[j];  
             s=j;
        }
        arr[s]=rc;  //要放入的位置
         
    }
     
    void heapSort(int[] arr){
        for(int i=(arr.length-1)/2;i > 0;i--)
        {
            heapAdjust(arr,i,arr.length-1);  
        }
        System.out.println("........建堆完成.............");
         
        outputArr(1);
        for(int i=arr.length-1; i>1; i--)
        {
            int temp = arr[1];
            arr[1] = arr[i];
            arr[i] = temp;
            heapAdjust(arr,1,i-1);
        }
    }
    void outputArr(int i)
    {     
        if(i <= arr[0])
        {
            System.out.println(arr[i]);
            outputArr(i*2);  //左
            outputArr(i*2+1);  //右
        }
    }
}
