package StacksandQueues;

public class MyStack {
    public static void main(String[] args) throws Exception {
        CustomStack stack=new CustomStack();

        stack.push(34);
        stack.push(65);
        stack.push(6);
        stack.push(4);
        stack.push(664);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       // System.out.println(stack.pop());
    }
}
