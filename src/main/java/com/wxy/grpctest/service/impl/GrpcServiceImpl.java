package com.wxy.grpctest.service.impl;

import com.wxy.grpctest.service.GrpcService;
import io.grpc.examples.helloworld.GreeterGrpc;
import io.grpc.examples.helloworld.HelloReply;
import io.grpc.examples.helloworld.HelloRequest;
import org.springframework.stereotype.Service;

@Service
public class GrpcServiceImpl implements GrpcService {
    private GreeterGrpc.GreeterBlockingStub greeterBlockingStub;
    public GrpcServiceImpl (GreeterGrpc.GreeterBlockingStub greeterBlockingStub) {
        this.greeterBlockingStub = greeterBlockingStub;
    }

    @Override
    public String sayHello(String message) {
        HelloReply reply = greeterBlockingStub.sayHello(HelloRequest.newBuilder().setName(message).build());
        return  reply.getMessage();
    }
}
