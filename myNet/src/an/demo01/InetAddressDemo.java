package an.demo01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author WTIHK
 * @Date 2021/1/22
 */


/*
    InetAddress：
      此类表示 Internet协议（IP）地址

      static InetAddress getByName(String host)	确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
      String getHostName()                    	获取值IP地址的主机名
      String getHostAddress()                 	返回文本形式中的IP地址字符串
 */

public class InetAddressDemo {
    public static void main(String[] args) {

        //static InetAddress getByName(String host)	确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
        InetAddress address = null;
        try {
            //address = InetAddress.getByName("WTIHK");
            address = InetAddress.getByName("192.168.1.10");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        //String getHostName()                    	获取值IP地址的主机名
        String name = address.getHostName();

        //String getHostAddress()                 	返回文本形式中的IP地址字符串
        String ip = address.getHostAddress();

        System.out.println("主机名:" + name);
        System.out.println("IP地址:" + ip);

    }
}
