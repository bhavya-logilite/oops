package binnary_tree_in_array;
class array {
    static int root = 0;
    static String[] str = new String[10];
 
    public void Root(String key)
    {
        str[0] = key;
    }
    public void setLeft(String key, int root)
    {
        int t = (root * 2) + 1;
 
        if (str[root] == null) {
            System.out.printf("Can't set child at %d, no parent found\n", t);
        }
        else {
            str[t] = key;
        }
    }
    public void setRight(String key, int root)
    {
        int t = (root * 2) + 2;
 
        if (str[root] == null) {
            System.out.printf("Can't set child at %d, no parent found\n", t);
        }
        else {
            str[t] = key;
        }
    }
    public void print_Tree()
    {
        for (int i = 0; i < 10; i++) {
            if (str[i] != null)
                System.out.print(str[i]);
            else
                System.out.print(".");
        }
    }
}
public class Binnary_tree {
	public static void main(String[] args) {
		array a = new array();
		 a.Root("A");
		 a.setLeft("B",0);
		 a.setRight("C", 0);
	     a.setLeft("D", 1);
	     a.setRight("E", 1);
	     a.setLeft("F", 2);
	     a.print_Tree();
	}

}
