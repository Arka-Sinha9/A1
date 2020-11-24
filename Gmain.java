class Generics<T, U,S,B,D>{
    T o1;
    U o2;
    S o3;
    B o4;
    D o5;
    Generics(T o1, U o2,S o3,B o4,D o5){
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
        this.o4 = o4;
        this.o5 = o5;
    }
    public void print(){
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        System.out.println(o5);
    }
}

class Gmain{
    public static void main (String[] args){
        Generics <String,Integer, String, Boolean, Double> o =
            new Generics<String, Integer, String, Boolean, Double>("Hello", 9,"World",true,6.45);

        o.print();
    }
}
