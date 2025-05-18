package ch09;


public class Phone {

    public String number;
    public String brand;


    public void sendMsg(Message msg){
        System.out.println("send msg"+msg.from+","+msg.to+
                ","+msg.content);
    }

}