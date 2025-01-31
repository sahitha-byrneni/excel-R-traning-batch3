class Demo054 {
    void display() {
        System.out.println("No parameters");
    }
    
    void display(int a) {
        System.out.println("Integer parameter: " + a);
    }
    
    void display(double a) {
        System.out.println("Double parameter: " + a);
    }
    
    void display(int a, int b) {
        System.out.println("Two integer parameters: " + a + ", " + b);
    }
    
    public static void main(String[] args) {
        Demo054 obj = new Demo054();
        obj.display();
        obj.display(5);
        obj.display(3.14);
        obj.display(10, 20);
    }
}