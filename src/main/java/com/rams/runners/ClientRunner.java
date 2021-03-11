package com.rams.runners;

import com.rams.data.Prasad.HelloReply;
import com.rams.data.Prasad.HelloRequest;
import com.rams.data.RamServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ClientRunner {

  
  public static void main(String[] args) {
    
    
    ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:9090").usePlaintext().build();
    
    RamServiceGrpc.RamServiceBlockingStub stub=RamServiceGrpc.newBlockingStub(channel);
    
    HelloRequest req= HelloRequest.newBuilder().setRe("hey").build();
    HelloReply sayHello = stub.sayHello(req);
    System.out.println(sayHello.getRes());
    channel.shutdown();
        
  }
}
