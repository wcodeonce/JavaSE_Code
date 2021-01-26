package cn.demo03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Author WTIHK
 * @Date 2021/1/23
 */

/*
    UDP发送数据：
        数据来自于键盘录入，直到输入的数据是996，发送结束
 */

public class SendDemo {
    public static void main(String[] args) throws IOException {

        //创建发送端的Socket对象（DatagramSocket）
        DatagramSocket ds = new DatagramSocket();

        //自己封装键盘录入数据
        InputStream in;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null){
            //输入的数据是996，发送结束
            if ("996".equals(line)){
                break;
            }

            //创建数据，并把数据打包
            byte[] bytes = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.1.10"), 12345);

            //调用DatagramSocket对象的方法发送数据
            ds.send(dp);

        }

        //关闭发送端
        ds.close();
    }
}
