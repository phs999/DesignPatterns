package structural.Adapter;

public class PowerAdapter implements DC5 {
    private AC220 ac220=new AC220();
    @Override
    public int outputDC5V() {
        int adpterInput=ac220.outputAC220V();
        int adpterOutput=adpterInput/44;//变压器

        System.out.println("使用电源适配器输入AC:"+adpterInput+"V"+"输出DC:"+adpterOutput+"V");
        return adpterOutput;
    }
}
