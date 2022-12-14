class Solution {
    String str ="";
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
      for(int i=0;i<strs.length-1;i++){
        str = "";
        int min = Math.min(strs[i].length(),strs[i+1].length());
        for(int j=0;j<min;j++){
            if(strs[i].charAt(j)==strs[i+1].charAt(j)){
                str+=strs[i].charAt(j);
            } else {
                break;
            }
        }
        strs[i+1] = str;
     }
     return str;
  }
}
