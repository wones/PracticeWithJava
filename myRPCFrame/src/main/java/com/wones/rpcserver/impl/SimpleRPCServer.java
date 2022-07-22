package com.wones.rpcserver.impl;

import com.wones.rpcserver.RPCServer;
import com.wones.rpcserver.ServiceProvider;
import com.wones.rpcserver.thead.WorkThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

public class SimpleRPCServer implements RPCServer {
    //存着服务接口名->service对象的map
    private ServiceProvider serviceProvider;

    public SimpleRPCServer(ServiceProvider serviceProvider){
        this.serviceProvider = serviceProvider;
    }

    @Override
    public void start(int port) {
        try{
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("服务器启动了");
            //BIO的方式监听Socket
            while (true){
                Socket socket = serverSocket.accept();
                //开启一个新线程去处理
                new Thread(new WorkThread(socket,serviceProvider)).start();
            }

        }catch (IOException e){
            e.printStackTrace();
            System.out.println("服务器启动失败");
        }
    }

    @Override
    public void stop() {

    }
}
