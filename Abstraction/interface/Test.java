interface I1{
    void show();   // public abstract method only blueprint no data
    static void play(){       
    }
}    
interface I2{
    void display();
    default void run(){ 
    // default concrete method can be made but with a body not a semi colon same as static and private method
    }
}

// implements is used to inherit the interface in the class

class Test implements I1,I2{               // use to compile multiple inheritance
    public void show(){   
        System.out.println("1");        // method body is define in class only     
    }
    public void display(){
        System.out.println("2");
    }
    public void run(){
        System.out.println("3");
    }
    public void play(){
        System.out.println("4");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.display();
        t.play();
        t.run();
    }    
}