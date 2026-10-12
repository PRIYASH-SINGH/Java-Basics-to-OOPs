public class ArrayASStack{

        int []arr = new int[5];
        int top=-1;
        int size=0;

        public boolean isEmpty(){
            return top == -1;
        }
        public boolean isFull(){
            return top == arr.length-1;
        }
        public void push(int val){
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            top++;
            arr[top]=val;
            size++;
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int val=arr[top];
            top--;
            size--;
            return val;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
            }
            int val=arr[top];
            return val;
        }
        public static void main(String[] args){
            ArrayASStack st=new ArrayASStack();
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            st.push(60);
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println("Element at the top "+st.peek());
        }
}
        
