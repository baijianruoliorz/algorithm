package trie;

import java.security.PublicKey;

/**
 * @author liqiqi_tql
 * @date 2020/12/26 -11:38
 */
public class Trie {
    private boolean is_string=false;
    private Trie next[]=new Trie[26];
    public Trie(){};
    public void insert(String word){
        Trie root=this;
        char w[]=word.toCharArray();
        for (int i=0;i<w.length;++i){
            if (root.next[w[i]-'a']==null){
                root.next[w[i]-'a']=new Trie();
                root=root.next[w[i]-'a'];
            }
            root.is_string=true;
        }
    }
    public boolean search(String word){
        Trie root=this;
        char w[] =word.toCharArray();
        for (int i=0;i<w.length;++i){
            if (root.next[w[i]-'a']==null){
                return false;
            }
            root=root.next[w[i]-'a'];
        }
        return root.is_string;
    }
    public boolean startsWith(String prefix){
        Trie root=this;
        char p[]=prefix.toCharArray();
        for (int i=0;i<p.length;i++){
            if (root.next[p[i]-'a']==null){
                return false;
            }
            root=root.next[p[i]-'a'];
        }
        return true;
    }

}
