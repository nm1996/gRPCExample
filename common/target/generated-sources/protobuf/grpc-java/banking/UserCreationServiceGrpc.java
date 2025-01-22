package banking;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: user-creation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserCreationServiceGrpc {

  private UserCreationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "banking.UserCreationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<banking.UserCreation.UserCreationRequest,
      banking.UserCreation.UserCreationResponse> getUserCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserCreate",
      requestType = banking.UserCreation.UserCreationRequest.class,
      responseType = banking.UserCreation.UserCreationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<banking.UserCreation.UserCreationRequest,
      banking.UserCreation.UserCreationResponse> getUserCreateMethod() {
    io.grpc.MethodDescriptor<banking.UserCreation.UserCreationRequest, banking.UserCreation.UserCreationResponse> getUserCreateMethod;
    if ((getUserCreateMethod = UserCreationServiceGrpc.getUserCreateMethod) == null) {
      synchronized (UserCreationServiceGrpc.class) {
        if ((getUserCreateMethod = UserCreationServiceGrpc.getUserCreateMethod) == null) {
          UserCreationServiceGrpc.getUserCreateMethod = getUserCreateMethod =
              io.grpc.MethodDescriptor.<banking.UserCreation.UserCreationRequest, banking.UserCreation.UserCreationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  banking.UserCreation.UserCreationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  banking.UserCreation.UserCreationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserCreationServiceMethodDescriptorSupplier("UserCreate"))
              .build();
        }
      }
    }
    return getUserCreateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserCreationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserCreationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserCreationServiceStub>() {
        @java.lang.Override
        public UserCreationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserCreationServiceStub(channel, callOptions);
        }
      };
    return UserCreationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserCreationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserCreationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserCreationServiceBlockingStub>() {
        @java.lang.Override
        public UserCreationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserCreationServiceBlockingStub(channel, callOptions);
        }
      };
    return UserCreationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserCreationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserCreationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserCreationServiceFutureStub>() {
        @java.lang.Override
        public UserCreationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserCreationServiceFutureStub(channel, callOptions);
        }
      };
    return UserCreationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void userCreate(banking.UserCreation.UserCreationRequest request,
        io.grpc.stub.StreamObserver<banking.UserCreation.UserCreationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserCreateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserCreationService.
   */
  public static abstract class UserCreationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserCreationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserCreationService.
   */
  public static final class UserCreationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserCreationServiceStub> {
    private UserCreationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserCreationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserCreationServiceStub(channel, callOptions);
    }

    /**
     */
    public void userCreate(banking.UserCreation.UserCreationRequest request,
        io.grpc.stub.StreamObserver<banking.UserCreation.UserCreationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserCreateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserCreationService.
   */
  public static final class UserCreationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserCreationServiceBlockingStub> {
    private UserCreationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserCreationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserCreationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public banking.UserCreation.UserCreationResponse userCreate(banking.UserCreation.UserCreationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserCreateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserCreationService.
   */
  public static final class UserCreationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserCreationServiceFutureStub> {
    private UserCreationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserCreationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserCreationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<banking.UserCreation.UserCreationResponse> userCreate(
        banking.UserCreation.UserCreationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserCreateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_USER_CREATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_USER_CREATE:
          serviceImpl.userCreate((banking.UserCreation.UserCreationRequest) request,
              (io.grpc.stub.StreamObserver<banking.UserCreation.UserCreationResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getUserCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              banking.UserCreation.UserCreationRequest,
              banking.UserCreation.UserCreationResponse>(
                service, METHODID_USER_CREATE)))
        .build();
  }

  private static abstract class UserCreationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserCreationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return banking.UserCreation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserCreationService");
    }
  }

  private static final class UserCreationServiceFileDescriptorSupplier
      extends UserCreationServiceBaseDescriptorSupplier {
    UserCreationServiceFileDescriptorSupplier() {}
  }

  private static final class UserCreationServiceMethodDescriptorSupplier
      extends UserCreationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserCreationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserCreationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserCreationServiceFileDescriptorSupplier())
              .addMethod(getUserCreateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
