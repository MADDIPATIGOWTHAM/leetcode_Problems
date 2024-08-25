class Solution {
    public static String tobin(int nums){
        StringBuilder sb=new StringBuilder("");
        while(nums>0){
        sb.append(nums%2);
        nums/=2;
        }
        return sb.toString();
    }
    
    public int findComplement(int num) {
       String s=tobin(num);
       System.out.println(s);
       int count=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='0'){
            count += (int) Math.pow(2,i);
        }
        
       }
       return count;
    }
}