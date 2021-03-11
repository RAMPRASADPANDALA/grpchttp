package com.rams.runners;

import java.io.IOException;

import com.rams.service.RamsServiceGrpcImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ServerRunner {

  public static void main(String[] args) throws IOException, InterruptedException {
    Server server=  ServerBuilder.forPort(9090).addService(new RamsServiceGrpcImpl()).build();
    server.start();
    System.out.println("Server started at "+server.getPort());
    server.awaitTermination();
  }
}
