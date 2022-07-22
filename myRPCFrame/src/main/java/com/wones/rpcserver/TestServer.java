package com.wones.rpcserver;

import com.wones.rpcserver.impl.SimpleRPCServer;
import com.wones.rpcserver.impl.ThreadPoolRPCServer;
import com.wones.service.BlogService;
import com.wones.service.UserService;
import com.wones.service.impl.BlogServiceImpl;
import com.wones.service.impl.UserServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class TestServer {
    public static void main(String[] args){
        UserService userService = new UserServiceImpl();
        BlogService blogService = new BlogServiceImpl();

        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.provideServiceInterface(userService);
        serviceProvider.provideServiceInterface(blogService);
        RPCServer rpcServer = new ThreadPoolRPCServer(serviceProvider);
        rpcServer.start(8899);
    }
}
