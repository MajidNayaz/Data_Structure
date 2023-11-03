public class Q3_stackOpration {
        int top = -1;
        int arrSize = 6;
        int[] stackArry = new int[arrSize];

        boolean isFull () {
            return arrSize-1 == top;
        }
        boolean isEmpty () {
            return top == -1;
        }

        void push (int data) {
            if(!isFull()) {
                stackArry[++top] = data;
                System.out.println("enserted successfully");
            }else {
                System.out.println("Stack is overflow");
            }
        }
        void pop () {
            if(!isEmpty()) {
                top--;
                System.out.println("the top element delated");
            }else {
                System.out.println("Stack is Empty");
            }
        }
        void peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
            }else {
            System.out.println("The topmost element : "+stackArry[top]);
            }
        }

    public static void main(String[] args) {
        Q3_stackOpration st = new Q3_stackOpration();
        st.push(12);
        st.push(34);
         System.out.println("isEmpty: "+st.isEmpty());
        st.push(87);
        st.push(45);
        st.push(78);
        st.push(56);
        st.push(98);
        st.pop();
        st.push(98);
    }
}