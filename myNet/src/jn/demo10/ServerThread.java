package jn.demo10;

import java.io.*;
import java.net.Socket;

/**
 * @Author WTIHK
 * @Date 2021/1/26
 */

public class ServerThread implements Runnable {

    private Socket s;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        //接收数据到文本文件
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//            BufferedWriter bw = new BufferedWriter(new FileWriter("myNet\\Copy.txt"));

            //解决名称冲突问题
            int count = 0;
            File file = new File("myNet\\Copy["+count+"].txt");
            while (file.exists()){
                count ++;
                file = new File("myNet\\Copy["+count+"].txt");
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //给出反馈
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();

            //释放资源
            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

