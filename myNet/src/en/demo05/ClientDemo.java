package en.demo05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author WTIHK
 * @Date 2021/1/25
 */

/*
    客户端：发送数据，接收服务器反馈
 */

public class ClientDemo {
    public static void main(String[] args) throws IOException {

        //创建客户端的Socket对象(Socket)
        Socket s = new Socket("192.168.1.10", 10020);

        //获取输出流,写数据
        OutputStream os = s.getOutputStream();

        os.write("Hello TCP, 你好!".getBytes());

        //接收服务器反馈
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String data = new String(bytes, 0, len);
        System.out.println("客户端: " + data);


        //释放资源
//        is.close();
//        os.close();
        s.close();

    }
}
