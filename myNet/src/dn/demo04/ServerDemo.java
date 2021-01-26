package dn.demo04;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author WTIHK
 * @Date 2021/1/25
 */

/*
    接收数据的步骤
        1. 创建服务器端的 Socket 对象 ( ServerSocket )
        2. 获取输入流，读数据，并把数据显示在控制台
        3. 释放资源
 */

public class ServerDemo {
    public static void main(String[] args) throws IOException {

        //1. 创建服务器端的 Socket 对象 ( ServerSocket )
        //ServerSocket(int port) 创建绑定到指定端口的服务器套接字
        ServerSocket ss = new ServerSocket(10010);

        //Socket accept() 侦听对此套接字的连接并接受它
        Socket s = ss.accept();


        //2. 获取输入流，读数据，并把数据显示在控制台
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String data = new String(bytes, 0, len);
        System.out.println("数据是: " + data);


        //3. 释放资源
        s.close();
        ss.close();

    }
}
