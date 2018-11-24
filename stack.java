public class TestDemo {
    public static void main(String[] args) {
        method2();
    }
    public static void method2(){
        MyQueue queue = new MyQueue();
        queue.add("hello");
        queue.add("world");
        queue.add("java");
        while(!queue.isEmpty()){
            System.out.println(queue.get());
        }
    }

    public static void method1(){
        MyStatck statck = new MyStatck();
        statck.add("hello");
        statck.add("java");
        statck.add("world");
        while(!statck.isEmpty()){
            System.out.println(statck.get());
        }
    }
}
