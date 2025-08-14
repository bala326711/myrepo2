class neon{
    public static void main(String[] args){
        int n=9;
        int num,remainder,quotient;
        num=n*n;
        remainder =num%10;
        quotient=num/10;
        if(n==remainder+quotient){
            System.out.println("it is a neon number");
        }
        else{
            System.out.println("it is not a neon number");
        }
    }
}