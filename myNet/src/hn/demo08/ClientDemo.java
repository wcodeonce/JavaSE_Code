package hn.demo08;

import java.io.*;
import java.net.Socket;

/**
 * @Author WTIHK
 * @Date 2021/1/25
 */

/*
    客户端:数据来自于文本文件
 */

public class ClientDemo {
    public static void main(String[] args) throws IOException {

        //创建客户端Socket对象
        Socket s = new Socket("192.168.1.10", 10060);

        //封装文本文件
        BufferedReader br = new BufferedReader(new FileReader("myNet\\s.txt"));

        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        br.close();
        s.close();

    }
}
