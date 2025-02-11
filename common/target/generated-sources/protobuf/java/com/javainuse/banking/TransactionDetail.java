// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bank-service.proto

package com.javainuse.banking;

/**
 * Protobuf type {@code banking.TransactionDetail}
 */
public final class TransactionDetail extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:banking.TransactionDetail)
    TransactionDetailOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransactionDetail.newBuilder() to construct.
  private TransactionDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransactionDetail() {
    transactionId_ = "";
    transactionType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TransactionDetail();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.javainuse.banking.BankService.internal_static_banking_TransactionDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.javainuse.banking.BankService.internal_static_banking_TransactionDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.javainuse.banking.TransactionDetail.class, com.javainuse.banking.TransactionDetail.Builder.class);
  }

  private int bitField0_;
  public static final int TRANSACTION_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object transactionId_ = "";
  /**
   * <code>string transaction_id = 1;</code>
   * @return The transactionId.
   */
  @java.lang.Override
  public java.lang.String getTransactionId() {
    java.lang.Object ref = transactionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      transactionId_ = s;
      return s;
    }
  }
  /**
   * <code>string transaction_id = 1;</code>
   * @return The bytes for transactionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTransactionIdBytes() {
    java.lang.Object ref = transactionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      transactionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSACTION_TYPE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object transactionType_ = "";
  /**
   * <code>string transaction_type = 2;</code>
   * @return The transactionType.
   */
  @java.lang.Override
  public java.lang.String getTransactionType() {
    java.lang.Object ref = transactionType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      transactionType_ = s;
      return s;
    }
  }
  /**
   * <code>string transaction_type = 2;</code>
   * @return The bytes for transactionType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTransactionTypeBytes() {
    java.lang.Object ref = transactionType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      transactionType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSACTION_AMOUNT_FIELD_NUMBER = 3;
  private com.javainuse.banking.BigDecimalProto transactionAmount_;
  /**
   * <code>.banking.BigDecimalProto transaction_amount = 3;</code>
   * @return Whether the transactionAmount field is set.
   */
  @java.lang.Override
  public boolean hasTransactionAmount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.banking.BigDecimalProto transaction_amount = 3;</code>
   * @return The transactionAmount.
   */
  @java.lang.Override
  public com.javainuse.banking.BigDecimalProto getTransactionAmount() {
    return transactionAmount_ == null ? com.javainuse.banking.BigDecimalProto.getDefaultInstance() : transactionAmount_;
  }
  /**
   * <code>.banking.BigDecimalProto transaction_amount = 3;</code>
   */
  @java.lang.Override
  public com.javainuse.banking.BigDecimalProtoOrBuilder getTransactionAmountOrBuilder() {
    return transactionAmount_ == null ? com.javainuse.banking.BigDecimalProto.getDefaultInstance() : transactionAmount_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transactionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, transactionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transactionType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, transactionType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getTransactionAmount());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transactionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, transactionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transactionType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, transactionType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTransactionAmount());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.javainuse.banking.TransactionDetail)) {
      return super.equals(obj);
    }
    com.javainuse.banking.TransactionDetail other = (com.javainuse.banking.TransactionDetail) obj;

    if (!getTransactionId()
        .equals(other.getTransactionId())) return false;
    if (!getTransactionType()
        .equals(other.getTransactionType())) return false;
    if (hasTransactionAmount() != other.hasTransactionAmount()) return false;
    if (hasTransactionAmount()) {
      if (!getTransactionAmount()
          .equals(other.getTransactionAmount())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TRANSACTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTransactionId().hashCode();
    hash = (37 * hash) + TRANSACTION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getTransactionType().hashCode();
    if (hasTransactionAmount()) {
      hash = (37 * hash) + TRANSACTION_AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getTransactionAmount().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.javainuse.banking.TransactionDetail parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.javainuse.banking.TransactionDetail parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.javainuse.banking.TransactionDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.javainuse.banking.TransactionDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.javainuse.banking.TransactionDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.javainuse.banking.TransactionDetail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.javainuse.banking.TransactionDetail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.javainuse.banking.TransactionDetail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.javainuse.banking.TransactionDetail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.javainuse.banking.TransactionDetail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.javainuse.banking.TransactionDetail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.javainuse.banking.TransactionDetail parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.javainuse.banking.TransactionDetail prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code banking.TransactionDetail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:banking.TransactionDetail)
      com.javainuse.banking.TransactionDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.javainuse.banking.BankService.internal_static_banking_TransactionDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.javainuse.banking.BankService.internal_static_banking_TransactionDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.javainuse.banking.TransactionDetail.class, com.javainuse.banking.TransactionDetail.Builder.class);
    }

    // Construct using com.javainuse.banking.TransactionDetail.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTransactionAmountFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      transactionId_ = "";
      transactionType_ = "";
      transactionAmount_ = null;
      if (transactionAmountBuilder_ != null) {
        transactionAmountBuilder_.dispose();
        transactionAmountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.javainuse.banking.BankService.internal_static_banking_TransactionDetail_descriptor;
    }

    @java.lang.Override
    public com.javainuse.banking.TransactionDetail getDefaultInstanceForType() {
      return com.javainuse.banking.TransactionDetail.getDefaultInstance();
    }

    @java.lang.Override
    public com.javainuse.banking.TransactionDetail build() {
      com.javainuse.banking.TransactionDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.javainuse.banking.TransactionDetail buildPartial() {
      com.javainuse.banking.TransactionDetail result = new com.javainuse.banking.TransactionDetail(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.javainuse.banking.TransactionDetail result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.transactionId_ = transactionId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.transactionType_ = transactionType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.transactionAmount_ = transactionAmountBuilder_ == null
            ? transactionAmount_
            : transactionAmountBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.javainuse.banking.TransactionDetail) {
        return mergeFrom((com.javainuse.banking.TransactionDetail)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.javainuse.banking.TransactionDetail other) {
      if (other == com.javainuse.banking.TransactionDetail.getDefaultInstance()) return this;
      if (!other.getTransactionId().isEmpty()) {
        transactionId_ = other.transactionId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTransactionType().isEmpty()) {
        transactionType_ = other.transactionType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasTransactionAmount()) {
        mergeTransactionAmount(other.getTransactionAmount());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              transactionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              transactionType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getTransactionAmountFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object transactionId_ = "";
    /**
     * <code>string transaction_id = 1;</code>
     * @return The transactionId.
     */
    public java.lang.String getTransactionId() {
      java.lang.Object ref = transactionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        transactionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string transaction_id = 1;</code>
     * @return The bytes for transactionId.
     */
    public com.google.protobuf.ByteString
        getTransactionIdBytes() {
      java.lang.Object ref = transactionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transactionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string transaction_id = 1;</code>
     * @param value The transactionId to set.
     * @return This builder for chaining.
     */
    public Builder setTransactionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      transactionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string transaction_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTransactionId() {
      transactionId_ = getDefaultInstance().getTransactionId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string transaction_id = 1;</code>
     * @param value The bytes for transactionId to set.
     * @return This builder for chaining.
     */
    public Builder setTransactionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      transactionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object transactionType_ = "";
    /**
     * <code>string transaction_type = 2;</code>
     * @return The transactionType.
     */
    public java.lang.String getTransactionType() {
      java.lang.Object ref = transactionType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        transactionType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string transaction_type = 2;</code>
     * @return The bytes for transactionType.
     */
    public com.google.protobuf.ByteString
        getTransactionTypeBytes() {
      java.lang.Object ref = transactionType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transactionType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string transaction_type = 2;</code>
     * @param value The transactionType to set.
     * @return This builder for chaining.
     */
    public Builder setTransactionType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      transactionType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string transaction_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTransactionType() {
      transactionType_ = getDefaultInstance().getTransactionType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string transaction_type = 2;</code>
     * @param value The bytes for transactionType to set.
     * @return This builder for chaining.
     */
    public Builder setTransactionTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      transactionType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.javainuse.banking.BigDecimalProto transactionAmount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.javainuse.banking.BigDecimalProto, com.javainuse.banking.BigDecimalProto.Builder, com.javainuse.banking.BigDecimalProtoOrBuilder> transactionAmountBuilder_;
    /**
     * <code>.banking.BigDecimalProto transaction_amount = 3;</code>
     * @return Whether the transactionAmount field is set.
     */
    public boolean hasTransactionAmount() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.banking.BigDecimalProto transaction_amount = 3;</code>
     * @return The transactionAmount.
     */
    public com.javainuse.banking.BigDecimalProto getTransactionAmount() {
      if (transactionAmountBuilder_ == null) {
        return transactionAmount_ == null ? com.javainuse.banking.BigDecimalProto.getDefaultInstance() : transactionAmount_;
      } else {
        return transactionAmountBuilder_.getMessage();
      }
    }
    /**
     * <code>.banking.BigDecimalProto transaction_amount = 3;</code>
     */
    public Builder setTransactionAmount(com.javainuse.banking.BigDecimalProto value) {
      if (transactionAmountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transactionAmount_ = value;
      } else {
        transactionAmountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.banking.BigDecimalProto transaction_amount = 3;</code>
     */
    public Builder setTransactionAmount(
        com.javainuse.banking.BigDecimalProto.Builder builderForValue) {
      if (transactionAmountBuilder_ == null) {
        transactionAmount_ = builderForValue.build();
      } else {
        transactionAmountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.banking.BigDecimalProto transaction_amount = 3;</code>
     */
    public Builder mergeTransactionAmount(com.javainuse.banking.BigDecimalProto value) {
      if (transactionAmountBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          transactionAmount_ != null &&
          transactionAmount_ != com.javainuse.banking.BigDecimalProto.getDefaultInstance()) {
          getTransactionAmountBuilder().mergeFrom(value);
        } else {
          transactionAmount_ = value;
        }
      } else {
        transactionAmountBuilder_.mergeFrom(value);
      }
      if (transactionAmount_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.banking.BigDecimalProto transaction_amount = 3;</code>
     */
    public Builder clearTransactionAmount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      transactionAmount_ = null;
      if (transactionAmountBuilder_ != null) {
        transactionAmountBuilder_.dispose();
        transactionAmountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.banking.BigDecimalProto transaction_amount = 3;</code>
     */
    public com.javainuse.banking.BigDecimalProto.Builder getTransactionAmountBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getTransactionAmountFieldBuilder().getBuilder();
    }
    /**
     * <code>.banking.BigDecimalProto transaction_amount = 3;</code>
     */
    public com.javainuse.banking.BigDecimalProtoOrBuilder getTransactionAmountOrBuilder() {
      if (transactionAmountBuilder_ != null) {
        return transactionAmountBuilder_.getMessageOrBuilder();
      } else {
        return transactionAmount_ == null ?
            com.javainuse.banking.BigDecimalProto.getDefaultInstance() : transactionAmount_;
      }
    }
    /**
     * <code>.banking.BigDecimalProto transaction_amount = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.javainuse.banking.BigDecimalProto, com.javainuse.banking.BigDecimalProto.Builder, com.javainuse.banking.BigDecimalProtoOrBuilder> 
        getTransactionAmountFieldBuilder() {
      if (transactionAmountBuilder_ == null) {
        transactionAmountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.javainuse.banking.BigDecimalProto, com.javainuse.banking.BigDecimalProto.Builder, com.javainuse.banking.BigDecimalProtoOrBuilder>(
                getTransactionAmount(),
                getParentForChildren(),
                isClean());
        transactionAmount_ = null;
      }
      return transactionAmountBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:banking.TransactionDetail)
  }

  // @@protoc_insertion_point(class_scope:banking.TransactionDetail)
  private static final com.javainuse.banking.TransactionDetail DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.javainuse.banking.TransactionDetail();
  }

  public static com.javainuse.banking.TransactionDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransactionDetail>
      PARSER = new com.google.protobuf.AbstractParser<TransactionDetail>() {
    @java.lang.Override
    public TransactionDetail parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<TransactionDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransactionDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.javainuse.banking.TransactionDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

