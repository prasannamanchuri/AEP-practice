/*package basic;

 public class Sort
{
    public Node SortedMerge(Node A, Node B)
    {
     
        if(A == null) return B;
        if(B == null) return A;
         
        if(A.data < B.data)
        {
            A.next = SortedMerge(A.next, B);
            return A;
        }
        else
        {
            B.next = SortedMerge(A, B.next);
            return B;
        }
         
    }
    public static void main(String args[])
	{
    	Sort s = new Sort();
		Node A = {"2,6,9"};
		System.out.println("Integer form of Roman Numeral"
						+ " is "
						+ r.romanToDecimal(str));
	}
}*/