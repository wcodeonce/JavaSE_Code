package en.demo06;

import java.io.*;
import java.net.Socket;

/**
 * @Author WTIHK
 * @Date 2021/1/25
 */

/*
    客户端：数据来自于键盘录入，知道输入的数据是996，发送数据结束
 */

public class ClientDemo {
    public static void main(String[] args) throws IOException {

        //创建一个Socket对象
        Socket s = new Socket("192.168.1.10", 10030);

        //数据来自于键盘录入,知道输入的数据是996,发送数据结束
        InputStream in;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象
        Writer out;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null){
            if ("996".equals(line)){
                break;
            }

            //获取输出流对象
//            OutputStream os = s.getOutputStream();
//            os.write(line.getBytes());

            bw.write(line);
            bw.newLine();
            bw.flush();

        }

        //释放资源
        s.close();

    }
}
