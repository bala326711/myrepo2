abstract class shape{
    abstract void area();
}
class rectangle extends shape{
    void area(){
        int l=10,b=20,h=30,result;
        result=l*b*h;
        System.out.println("shape of recatngle:"+result);
    }
}
class triangle extends shape{
    void area(){
        double k=2,l=3,result;
        result=0.5*(k*l);
        System.out.println("shape of triangle:"+result);
    }
}
class demo{
    public static void main(String[] args){
        rectangle r=new rectangle();
        triangle t=new triangle();
        r.area();
        t.area();
    }
}
