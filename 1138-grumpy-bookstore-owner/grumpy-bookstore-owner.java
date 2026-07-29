class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                sum+=customers[i];
            }
        }
     int[] arr=new int[customers.length];
     for(int i=0;i<customers.length;i++){
        if(grumpy[i]==1){
            arr[i]=customers[i];
        }
     }
     int s=0,m=0,a=0;
     for(int i=0;i<arr.length;i++){
if(a<minutes){
    s+=arr[i];
    a++;
}
else{
    m=Math.max(m,s);
    s-=arr[i-minutes];
    a-=1;
    i--;
}
     }
      m=Math.max(m,s);
     return sum+m;
    }
}