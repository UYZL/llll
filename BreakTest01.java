package javase;

public class BreakTest01 {
    public static void main(String[] args){
        for (int i=0;i<10;i++){
            if (i==5){
                break;//终止的是当前for循环
            }
            System.out.println("i-->"+i);//0 1 2 3 4
        }
        //这里与上边for循环无关
        System.out.println(".....");

        for(int j=0;j<3;j++){
            for(int i=0;i<10;i++){
                if(i==5){
                    break ;//终止的是内层for循环，因为这个for离他最近
                }
                System.out.println("i->"+i);
            }
        }
        System.out.println(".....");

        //给for循环起名for1
        for1:for(int j=0;j<3;j++){
            //给for循环起名for2
            for2:for(int i=0;i<10;i++){
                if(i==5){
                    break for1;//指定中断for1
                }
                System.out.println("i--->"+i);
            }
        }
        System.out.println("hello!");
    }
}
