public class Use1 {
    int i;
    void setValues(int i){
        this.i=i;
    }
    void show(){
        System.out.println("value: "+i);
    }

    public static void main(String[] args) {
        Use1 u = new Use1();
        u.setValues(100);
        u.show();
    }
}
