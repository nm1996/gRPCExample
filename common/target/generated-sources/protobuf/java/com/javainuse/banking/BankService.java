// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bank-service.proto

package com.javainuse.banking;

public final class BankService {
  private BankService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_banking_BigDecimalProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_banking_BigDecimalProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_banking_AccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_banking_AccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_banking_TransactionDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_banking_TransactionDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_banking_TransactionDetailList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_banking_TransactionDetailList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022bank-service.proto\022\007banking\"8\n\017BigDeci" +
      "malProto\022\026\n\016unscaled_value\030\001 \001(\003\022\r\n\005scal" +
      "e\030\002 \001(\005\"B\n\016AccountRequest\022\026\n\016account_num" +
      "ber\030\001 \001(\t\022\030\n\020duration_in_days\030\002 \001(\005\"{\n\021T" +
      "ransactionDetail\022\026\n\016transaction_id\030\001 \001(\t" +
      "\022\030\n\020transaction_type\030\002 \001(\t\0224\n\022transactio" +
      "n_amount\030\003 \001(\0132\030.banking.BigDecimalProto" +
      "\"P\n\025TransactionDetailList\0227\n\023transaction" +
      "_details\030\001 \003(\0132\032.banking.TransactionDeta" +
      "il2`\n\022TransactionService\022J\n\017GetTransacti" +
      "ons\022\027.banking.AccountRequest\032\036.banking.T" +
      "ransactionDetailListB\031\n\025com.javainuse.ba" +
      "nkingP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_banking_BigDecimalProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_banking_BigDecimalProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_banking_BigDecimalProto_descriptor,
        new java.lang.String[] { "UnscaledValue", "Scale", });
    internal_static_banking_AccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_banking_AccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_banking_AccountRequest_descriptor,
        new java.lang.String[] { "AccountNumber", "DurationInDays", });
    internal_static_banking_TransactionDetail_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_banking_TransactionDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_banking_TransactionDetail_descriptor,
        new java.lang.String[] { "TransactionId", "TransactionType", "TransactionAmount", });
    internal_static_banking_TransactionDetailList_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_banking_TransactionDetailList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_banking_TransactionDetailList_descriptor,
        new java.lang.String[] { "TransactionDetails", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
