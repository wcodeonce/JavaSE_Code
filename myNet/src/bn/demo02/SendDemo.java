package bn.demo02;

import java.io.IOException;
import java.net.*;

/**
 * @Author WTIHK
 * @Date 2021/1/23
 */

/*
    发送数据的步骤
        1. 创建发送端的 Socket 对象 ( DatagramSocket )
        2. 创建数据，并把数据打包
        3. 调用 DatagramSocket 对象的方法发送数据
        4. 关闭发送端
 */

public class SendDemo {
    public static void main(String[] args) throws IOException {

        //1. 创建发送端的 Socket 对象 ( DatagramSocket )
        //DatagramSocket() 构造一个数据报套接字并将其绑定到本地主机上的任何可用端口
        DatagramSocket ds = new DatagramSocket();


        //2. 创建数据，并把数据打包
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //构造一个数据报包，用于将长度为 length的数据包发送到指定主机上的指定端口号
        byte[] bytes = "Hello,UDP,JAVA".getBytes();
//        int length = bytes.length;
//        InetAddress address = InetAddress.getByName("192.168.1.10");
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(bytes, length, address, port);

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.1.10"), 10086);


        //3. 调用 DatagramSocket 对象的方法发送数据
        //void send(DatagramPacket p) 从此套接字发送数据报包
        ds.send(dp);


        //4. 关闭发送端
        //void close() 关闭此数据报套接字
        ds.close();

    }
}
