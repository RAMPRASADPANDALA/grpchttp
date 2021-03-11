package com.rams.data;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.32.1)",
    comments = "Source: com/rams/proto/prasad.proto")
public final class RamServiceGrpc {

  private RamServiceGrpc() {}

  public static final String SERVICE_NAME = "com.rams.proto.RamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rams.data.Prasad.HelloRequest,
      com.rams.data.Prasad.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.rams.data.Prasad.HelloRequest.class,
      responseType = com.rams.data.Prasad.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rams.data.Prasad.HelloRequest,
      com.rams.data.Prasad.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.rams.data.Prasad.HelloRequest, com.rams.data.Prasad.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = RamServiceGrpc.getSayHelloMethod) == null) {
      synchronized (RamServiceGrpc.class) {
        if ((getSayHelloMethod = RamServiceGrpc.getSayHelloMethod) == null) {
          RamServiceGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.rams.data.Prasad.HelloRequest, com.rams.data.Prasad.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rams.data.Prasad.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rams.data.Prasad.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new RamServiceMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RamServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RamServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RamServiceStub>() {
        @java.lang.Override
        public RamServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RamServiceStub(channel, callOptions);
        }
      };
    return RamServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RamServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RamServiceBlockingStub>() {
        @java.lang.Override
        public RamServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RamServiceBlockingStub(channel, callOptions);
        }
      };
    return RamServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RamServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RamServiceFutureStub>() {
        @java.lang.Override
        public RamServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RamServiceFutureStub(channel, callOptions);
        }
      };
    return RamServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RamServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(com.rams.data.Prasad.HelloRequest request,
        io.grpc.stub.StreamObserver<com.rams.data.Prasad.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rams.data.Prasad.HelloRequest,
                com.rams.data.Prasad.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class RamServiceStub extends io.grpc.stub.AbstractAsyncStub<RamServiceStub> {
    private RamServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RamServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RamServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(com.rams.data.Prasad.HelloRequest request,
        io.grpc.stub.StreamObserver<com.rams.data.Prasad.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RamServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RamServiceBlockingStub> {
    private RamServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RamServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RamServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.rams.data.Prasad.HelloReply sayHello(com.rams.data.Prasad.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RamServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RamServiceFutureStub> {
    private RamServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RamServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RamServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rams.data.Prasad.HelloReply> sayHello(
        com.rams.data.Prasad.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RamServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RamServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.rams.data.Prasad.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.rams.data.Prasad.HelloReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RamServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rams.data.Prasad.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RamService");
    }
  }

  private static final class RamServiceFileDescriptorSupplier
      extends RamServiceBaseDescriptorSupplier {
    RamServiceFileDescriptorSupplier() {}
  }

  private static final class RamServiceMethodDescriptorSupplier
      extends RamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RamServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RamServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
