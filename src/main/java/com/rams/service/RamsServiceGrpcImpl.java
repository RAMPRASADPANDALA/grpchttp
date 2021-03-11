package com.rams.service;

import com.rams.data.Prasad.HelloReply;
import com.rams.data.Prasad.HelloRequest;
import com.rams.data.RamServiceGrpc.RamServiceImplBase;

import io.grpc.stub.StreamObserver;

public class RamsServiceGrpcImpl extends RamServiceImplBase {

  @Override
  public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
    responseObserver.onNext(HelloReply.newBuilder().setRes(request.getRe()).build());
    responseObserver.onCompleted();
  }

}
