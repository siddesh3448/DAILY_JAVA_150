public  class Search_element {
    public static void main(String[] args) {
        
        int[] arr = {100,200,300,400,500};
        int target = 200;
        int indx = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                indx = i;
            }
        }
        int a = 200;
        int b = 200;
        boolean ans = true;
        if(a==b){
            ans = true;
        }else{
            ans = false;
        }
        System.out.print(indx);
        System.out.println(ans);
        System.out.println(200==200);
    }
}