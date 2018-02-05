class pa1_20151567_02{
    public static void main(String[] args){
        for(int num=2;num<10;num++){//multiplicand
            for(int i=1;i<10;i++){//multiplier
                if(num!=i) System.out.printf("%d X %d = %d\n",num,i,num*i);//if num==i, don't print
            }
            if(num!=9) System.out.println("--------------");//if last, don't print
        }
    }
}
