package creational.prototype.example2;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("mail:"+mail.toString());
        for (int i = 0; i <10 ; i++) {
            Mail mailTemp=(Mail)mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i+"@110.com");
            mailTemp.setContent("恭喜您，您的彩票中奖了。");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆的mailTemp:"+mailTemp.toString());

        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
