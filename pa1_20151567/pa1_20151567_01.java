class pa1_20151567_01{
    public static void main(String[] args){
        int n;//the variable for random number
        int a=0,b=0,c=0,d=0,e=0,f=0;// the variables for counting number for each ranges
        for(int count=1;count<=100;count++){
            n=(int)(100*Math.random()+1);// the random number range is 1~100
            System.out.print(count+". range is ");
            if(n>=1&&n<20){
                System.out.print("01~19");
                a++;
            }
            else if(n>=20&&n<40){
                 System.out.print("20~39");
                 b++;
            }
            else if(n>=40&&n<60){
                 System.out.print("40~59");
                 c++;
            }
            else if(n>=60&&n<80){
                 System.out.print("60~79");
                 d++;
            }
            else if(n>=80&&n<100){
                System.out.print("80~99");
                e++;
            }
            else {
                System.out.print("100");
                f++;
            }
            System.out.printf(" (number is %d)\n",n);
        }
        System.out.printf("(result : %d %d %d %d %d %d)\n",a,b,c,d,e,f);//print the results
    }
}
