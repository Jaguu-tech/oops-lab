class Bank{
    int i;
    void setValues(int i){
        this.i=i;
    }

//agar hum idhar this keyword use nhi karege toh dono instance aur method variable same name ke hai toh value zero
//print hogi lekin this keyword use kiya hai toh woh as a frefrence variable refers karega current object ko joh
//ki hai class test ka i aba dono variable alag hai toh output 10 aayega

    void show(){
        System.out.println(i);
    }
}
class Xyz{
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setValues(10);
        b.show();
    }
}
