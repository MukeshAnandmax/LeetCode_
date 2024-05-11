class TrieNode{
    TrieNode[] children ;
    boolean isEnd;
    public TrieNode(){
        children = new TrieNode[26];
        isEnd =false;
    }


}


class Trie {

    TrieNode root ;

    public Trie() {
        root = new  TrieNode();
    }

    
    public void insert(String key) {
        TrieNode curr =root;
        for(int i=0;i<key.length();i++){
        
            int idx  = key.charAt(i)-'a';
        
            if(curr.children[idx]==null){
                curr.children[idx] = new TrieNode();
            }
            curr= curr.children[idx];    
        }
    
        curr.isEnd=true;
    }
    
    public boolean search(String key) {
        TrieNode curr =root;
        for(int i=0;i<key.length();i++){
        
            int idx  = key.charAt(i)-'a';
        
            if(curr.children[idx]==null){
                return false;
            }
            curr= curr.children[idx];
        
        
        }
    
        return curr.isEnd;
    }
    
    public boolean startsWith(String key) {
        TrieNode curr =root;
        for(int i=0;i<key.length();i++){
        
            int idx  = key.charAt(i)-'a';
        
            if(curr.children[idx]==null){
                return false;
            }
            curr= curr.children[idx];
    
        }
        // if(curr.isEnd){
        //      return true;
        // }
        //  TrieNode[] child = curr.children;
        // for(TrieNode t :child){
        //     if(t!=null){
        //         return true;
        //     }  
        // }
    
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */