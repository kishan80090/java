public class youtest {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,68,7};
        int value=8;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value)
            count++;
        }
        System.out.println("Value : "+value+"\nCount : "+count);
    }
}