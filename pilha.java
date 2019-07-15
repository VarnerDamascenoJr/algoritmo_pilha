package Pilha;

public class Pilha {
    public static void main(String []args){
    

    }

    int pilha[] = new int[5];
    int top = 0;

    public void push(int data){
        pilha[top] = data;
    }

    public void show(){
        for(int n : pilha){
            System.out.print(n +"");
        }
    }

    public int pop(){
        int data;
        top--;
        data = pilha[top];
        pilha[top] = 0;
        return data;
    }

    public int peek(){
        int data;
        data = pilha[top - 1];
        return data;
    }
}
