class Solution {

     ArrayList<Integer> a = new ArrayList<Integer>();
     ArrayList<Integer> b = new ArrayList<Integer>();
      
    void getLeaf1(TreeNode node) {
        if(node.left!=null && node.right!=null) {
           getLeaf1(node.left);
           getLeaf1(node.right);
        } else if(node.left !=null && node.right==null){
            getLeaf1(node.left);
        }else if(node.left==null&&node.right!=null){
            getLeaf1(node.right);
        }else{
            a.add(node.val);
        }

    }

    void getLeaf2(TreeNode node) {
        if(node.left!=null&& node.right!=null) {
           getLeaf2(node.left);
           getLeaf2(node.right);
        } else if(node.left!=null && node.right==null){
            getLeaf2(node.left);
        }else if(node.left==null&&node.right!=null){
            getLeaf2(node.right);
        }else{
            b.add(node.val);
        }

    }



    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        getLeaf1(root1); // [2,3]
        getLeaf2(root2); // [3,2]

        /**
        a = [2,3];
        b = [3,2];
         */
        if(a.size()==b.size()){
            for(int i=0;i<a.size();i++){
                if(a.get(i)!= b.get(i)){
                    return false;
                }
            }
            return true;
        }
        return false;
        
    }
}
