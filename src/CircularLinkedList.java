public class CircularLinkedList{
    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data)
        {
            this.data = data;
        }
    }
    public CircularLinkedList(){
        last =null;
        length =0;
    }
}
