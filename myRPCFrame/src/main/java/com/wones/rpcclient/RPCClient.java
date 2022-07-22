package com.wones.rpcclient;

import com.wones.pojo.Blog;
import com.wones.pojo.User;
import com.wones.service.BlogService;
import com.wones.service.UserService;
import com.wones.util.ClientProxy;

public class RPCClient {
    public static void main(String[] args) {
        ClientProxy clientProxy = new ClientProxy("127.0.0.1",8899);

        UserService proxy = clientProxy.getProxy(UserService.class);
        BlogService blogService = clientProxy.getProxy(BlogService.class);
        Blog blogById = blogService.getBlogById(10000);
        System.out.println("从服务端得到的blog为：" + blogById);
        //服务的方法1
        User user = proxy.getUserByUserId(10);
        System.out.println("从服务端得到的user为："+user);
        //服务的方法2
        User user2 = User.builder().userName("张三").id(100).sex(true).build();
        Integer integer = proxy.insertUserId(user2);
        System.out.println("向服务端插入数据："+integer);


    }
}
