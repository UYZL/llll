package javase;

public class BreakTest01 {
    public static void main(String[] args){
        for (int i=0;i<10;i++){
            if (i==5){
                break;//��ֹ���ǵ�ǰforѭ��
            }
            System.out.println("i-->"+i);//0 1 2 3 4
        }
        //�������ϱ�forѭ���޹�
        System.out.println(".....");

        for(int j=0;j<3;j++){
            for(int i=0;i<10;i++){
                if(i==5){
                    break ;//��ֹ�����ڲ�forѭ������Ϊ���for�������
                }
                System.out.println("i->"+i);
            }
        }
        System.out.println(".....");

        //��forѭ������for1
        for1:for(int j=0;j<3;j++){
            //��forѭ������for2
            for2:for(int i=0;i<10;i++){
                if(i==5){
                    break for1;//ָ���ж�for1
                }
                System.out.println("i--->"+i);
            }
        }
        System.out.println("hello!");
    }
}
