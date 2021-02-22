package fn.demo07;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author WTIHK
 * @Date 2021/1/25
 */

/*
    服务器：接收到的数据写入文本文件
 */

public class ServerDemo {
    public static void main(String[] args) throws IOException {

        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(10040);

        //监听客户端连接,返回一个对应的Socket对
        Socket s = ss.accept();

        //接收数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("myNet\\s.txt"));

        String line;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        ss.close();
        bw.close();

    }
}
