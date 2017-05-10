package tree;
//红黑树，插入的写完了，删除的还未写完
/**
 * Created by 不语恋 on 2017/5/9.
 */
enum Color{black,red};
class Node {
    int key;
    int val;
    Node left;
    Node right;
    Node parent;
    Color color;

    public Node() {}

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}
//红黑树
public class RedBlackTree {
    Node root;
    boolean insert(Node node){
        if(root==null)
            root=node;
        node.color=Color.black;
        Node now=findParent(node.key);
        if(now.key==node.key)
            return false;
        if(node.key<now.key){
            now.left=node;
            node.parent=now;
            now=now.left;
        }else {
            now.right=node;
            node.parent=now;
            now=now.right;
        }
        insertAdjust(now);
        return true;
    }
    void insertAdjust(Node now){
        if(now==root)
            now.color=Color.black;
        if(now.parent.color==Color.black)
            return;
        Node grandFather=now.parent.parent;
        if(now.parent==grandFather.left){
            Node uncle=grandFather.right;
            if(uncle.color==Color.red){
                now.parent.color=Color.black;
                uncle.color=Color.red;
                grandFather.color=Color.red;
                insertAdjust(grandFather);
                return;
            }else {
                if(now.parent.right==now){
                    leftRotate(now.parent);
                }
                rightRotate(grandFather);
                grandFather.color=Color.red;
                grandFather.parent.color=Color.black;
                return;
            }
        }else {
            Node uncle=grandFather.left;
            if(uncle.color==Color.red){
                now.parent.color=Color.black;
                uncle.color=Color.red;
                grandFather.color=Color.red;
                insertAdjust(grandFather);
                return;
            }else {
                if(now.parent.right==now){
                    rightRotate(now.parent);
                }
                leftRotate(grandFather);
                grandFather.color=Color.red;
                grandFather.parent.color=Color.black;
                return;
            }
        }
    }
    void leftRotate(Node now){
        Node x=now.right;
        Node y=x.left;
        if(now.parent.left==now){
            now.parent.left=x;
            x.parent=now.parent;
        }else{
            now.parent.right=x;
            x.parent=now.parent;
        }
        x.left=now;
        now.parent=x;

        now.right=y;
        y.parent=now;
    }
    void rightRotate(Node now){
        Node x=now.left;
        Node y=x.right;
        if(now.parent.left==now){
            now.parent.left=x;
            x.parent=now.parent;
        }else{
            now.parent.right=x;
            x.parent=now.parent;
        }
        x.right=now;
        now.parent=x;

        now.left=y;
        y.parent=now;
    }
    //如果有则返回节点，如果没有则返回其父节点。
    Node findParent(int key){
        Node now=root;
        Node now2=now;
        while(now!=null){
            now2=now;
            if(key<now.key){
                now=now.left;
            }else if(key>now.key){
                now=now.right;
            }else{
                return now;
            }
        }
        return now2;
    }
    boolean find(int key){
        if(findParent(key).key==key)
            return true;
        return false;
    }
    //此方法未完成
    boolean remove(int key){
        Node now=findParent(key);
        if(now.key!=key)
            return false;
        if(now.right!=null&&now.left!=null){
            Node beh=findBehind(now);
            Color t=now.color;
            now.color=beh.color;
            beh.color=t;
            if(now==root){
                beh.left=now.left;
                beh.right=now.right;
                now.parent=beh.parent;
                beh.parent=null;
                root=beh;
            }else if(now.parent.left==now){
                beh.left=now.left;
                beh.right=now.right;
                now.parent.left=beh;

                now.parent=beh.parent;
            }else{
                beh.left=now.left;
                beh.right=now.right;
                now.parent.right=beh;

                now.parent=beh.parent;
            }
        }else if(now.left!=null){
            if(now==root){
                root=now.left;
                root.parent=null;
                return true;
            }else if(now.parent.left==now){
                now.parent.left=now.left;
                now.left.parent=now.parent;
                now=now.left;
            }else{
                now.parent.right=now.left;
                now.left.parent=now.parent;
                now=now.left;
            }
        }else{
            if(now==root){
                root=now.right;
                root.parent=null;
                return true;
            }else if(now.parent.left==now){
                now.parent.left=now.right;
                now.right.parent=now.parent;
                now=now.left;
            }else{
                now.parent.right=now.right;
                now.right.parent=now.parent;
                now=now.right;
            }
        }
        return true;
    }
    //寻找node的后继结点
    Node findBehind(Node node){
        Node now=node.right;
        while (now.left!=null)
            now=now.left;
        return now;
    }
}
