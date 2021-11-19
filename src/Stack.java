import java.util.EmptyStackException;

public class Stack<T> {
    private ListNode top;
    private int length;

    private class ListNode{
        private T data; // can be a generic type
        private ListNode next; // Reference to next ListNode in list

        public ListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void Stack(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return  length ==0;
    }

    public void push(T data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T result = top.data;
        top = top.next;
        length--;
        return result;
    }

/*    Stack<Character>stack = new Stack<>(){
        char[] chars = str.to CharArray();
    for(char c : chars){
            stack.push(c);
        }
    for(int i = 0; i<str.length(); i++){
            chars[i]=stack.pop();
        }
    return new String(chars);
    }
    */
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(15);
        stack.push(20);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

    }

}