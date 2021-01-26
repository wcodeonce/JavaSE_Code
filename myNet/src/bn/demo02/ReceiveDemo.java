package bn.demo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Author WTIHK
 * @Date 2021/1/23
 */

/*
    接收数据的步骤
        1. 创建接收端的 Socket 对象（ DatagramSocket ）
        2. 创建一个数据包，用于接收数据
        3. 调用 DatagramSocket 对象的方法接收数据
        4. 解析数据包，并把数据在控制台显示
        5. 关闭接收端

 */

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {

        //1. 创建接收端的 Socket 对象（DatagramSocket ）
        //DatagramSocket(int port) 构造一个数据报套接字并将其绑定到本地主机上的指定端口。
        DatagramSocket ds = new DatagramSocket(10086);


        //2. 创建一个数据包，用于接收数据
        //DatagramPacket(byte[] buf, int length) 构造 DatagramPacket用于接收长度为 length数据包。
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);


        //3. 调用 DatagramSocket 对象的方法接收数据
        //void receive(DatagramPacket p) 从此套接字接收数据报包
        ds.receive(dp);


        //4. 解析数据包，并把数据在控制台显示
        //byte[] getData() 返回数据缓冲区
//        byte[] data = dp.getData();
        //int getLength() 返回要发送的数据的长度或接收的数据的长度
        int len = dp.getLength();
//        String dataStr = new String(data, 0, len);
//        System.out.println("数据是: " + dataStr);

        System.out.println("数据是: " + new String(dp.getData(), 0, dp.getLength()));


        //5. 关闭接收端
        ds.close();

    }
}
