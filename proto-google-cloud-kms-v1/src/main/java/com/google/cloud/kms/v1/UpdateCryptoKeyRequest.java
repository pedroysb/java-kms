/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

/**
 *
 *
 * <pre>
 * Request message for [KeyManagementService.UpdateCryptoKey][google.cloud.kms.v1.KeyManagementService.UpdateCryptoKey].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.UpdateCryptoKeyRequest}
 */
public final class UpdateCryptoKeyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.UpdateCryptoKeyRequest)
    UpdateCryptoKeyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateCryptoKeyRequest.newBuilder() to construct.
  private UpdateCryptoKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateCryptoKeyRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateCryptoKeyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateCryptoKeyRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.cloud.kms.v1.CryptoKey.Builder subBuilder = null;
              if (cryptoKey_ != null) {
                subBuilder = cryptoKey_.toBuilder();
              }
              cryptoKey_ =
                  input.readMessage(com.google.cloud.kms.v1.CryptoKey.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cryptoKey_);
                cryptoKey_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_UpdateCryptoKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_UpdateCryptoKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.UpdateCryptoKeyRequest.class,
            com.google.cloud.kms.v1.UpdateCryptoKeyRequest.Builder.class);
  }

  public static final int CRYPTO_KEY_FIELD_NUMBER = 1;
  private com.google.cloud.kms.v1.CryptoKey cryptoKey_;
  /**
   *
   *
   * <pre>
   * Required. [CryptoKey][google.cloud.kms.v1.CryptoKey] with updated values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKey crypto_key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the cryptoKey field is set.
   */
  public boolean hasCryptoKey() {
    return cryptoKey_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. [CryptoKey][google.cloud.kms.v1.CryptoKey] with updated values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKey crypto_key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The cryptoKey.
   */
  public com.google.cloud.kms.v1.CryptoKey getCryptoKey() {
    return cryptoKey_ == null ? com.google.cloud.kms.v1.CryptoKey.getDefaultInstance() : cryptoKey_;
  }
  /**
   *
   *
   * <pre>
   * Required. [CryptoKey][google.cloud.kms.v1.CryptoKey] with updated values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKey crypto_key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.kms.v1.CryptoKeyOrBuilder getCryptoKeyOrBuilder() {
    return getCryptoKey();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (cryptoKey_ != null) {
      output.writeMessage(1, getCryptoKey());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cryptoKey_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCryptoKey());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.kms.v1.UpdateCryptoKeyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.UpdateCryptoKeyRequest other =
        (com.google.cloud.kms.v1.UpdateCryptoKeyRequest) obj;

    if (hasCryptoKey() != other.hasCryptoKey()) return false;
    if (hasCryptoKey()) {
      if (!getCryptoKey().equals(other.getCryptoKey())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCryptoKey()) {
      hash = (37 * hash) + CRYPTO_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getCryptoKey().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.kms.v1.UpdateCryptoKeyRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for [KeyManagementService.UpdateCryptoKey][google.cloud.kms.v1.KeyManagementService.UpdateCryptoKey].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.UpdateCryptoKeyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.UpdateCryptoKeyRequest)
      com.google.cloud.kms.v1.UpdateCryptoKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_UpdateCryptoKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_UpdateCryptoKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.UpdateCryptoKeyRequest.class,
              com.google.cloud.kms.v1.UpdateCryptoKeyRequest.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.UpdateCryptoKeyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (cryptoKeyBuilder_ == null) {
        cryptoKey_ = null;
      } else {
        cryptoKey_ = null;
        cryptoKeyBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_UpdateCryptoKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.UpdateCryptoKeyRequest getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.UpdateCryptoKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.UpdateCryptoKeyRequest build() {
      com.google.cloud.kms.v1.UpdateCryptoKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.UpdateCryptoKeyRequest buildPartial() {
      com.google.cloud.kms.v1.UpdateCryptoKeyRequest result =
          new com.google.cloud.kms.v1.UpdateCryptoKeyRequest(this);
      if (cryptoKeyBuilder_ == null) {
        result.cryptoKey_ = cryptoKey_;
      } else {
        result.cryptoKey_ = cryptoKeyBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.kms.v1.UpdateCryptoKeyRequest) {
        return mergeFrom((com.google.cloud.kms.v1.UpdateCryptoKeyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.UpdateCryptoKeyRequest other) {
      if (other == com.google.cloud.kms.v1.UpdateCryptoKeyRequest.getDefaultInstance()) return this;
      if (other.hasCryptoKey()) {
        mergeCryptoKey(other.getCryptoKey());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.kms.v1.UpdateCryptoKeyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.kms.v1.UpdateCryptoKeyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.kms.v1.CryptoKey cryptoKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.kms.v1.CryptoKey,
            com.google.cloud.kms.v1.CryptoKey.Builder,
            com.google.cloud.kms.v1.CryptoKeyOrBuilder>
        cryptoKeyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. [CryptoKey][google.cloud.kms.v1.CryptoKey] with updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the cryptoKey field is set.
     */
    public boolean hasCryptoKey() {
      return cryptoKeyBuilder_ != null || cryptoKey_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. [CryptoKey][google.cloud.kms.v1.CryptoKey] with updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The cryptoKey.
     */
    public com.google.cloud.kms.v1.CryptoKey getCryptoKey() {
      if (cryptoKeyBuilder_ == null) {
        return cryptoKey_ == null
            ? com.google.cloud.kms.v1.CryptoKey.getDefaultInstance()
            : cryptoKey_;
      } else {
        return cryptoKeyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. [CryptoKey][google.cloud.kms.v1.CryptoKey] with updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCryptoKey(com.google.cloud.kms.v1.CryptoKey value) {
      if (cryptoKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cryptoKey_ = value;
        onChanged();
      } else {
        cryptoKeyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [CryptoKey][google.cloud.kms.v1.CryptoKey] with updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCryptoKey(com.google.cloud.kms.v1.CryptoKey.Builder builderForValue) {
      if (cryptoKeyBuilder_ == null) {
        cryptoKey_ = builderForValue.build();
        onChanged();
      } else {
        cryptoKeyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [CryptoKey][google.cloud.kms.v1.CryptoKey] with updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeCryptoKey(com.google.cloud.kms.v1.CryptoKey value) {
      if (cryptoKeyBuilder_ == null) {
        if (cryptoKey_ != null) {
          cryptoKey_ =
              com.google.cloud.kms.v1.CryptoKey.newBuilder(cryptoKey_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          cryptoKey_ = value;
        }
        onChanged();
      } else {
        cryptoKeyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [CryptoKey][google.cloud.kms.v1.CryptoKey] with updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearCryptoKey() {
      if (cryptoKeyBuilder_ == null) {
        cryptoKey_ = null;
        onChanged();
      } else {
        cryptoKey_ = null;
        cryptoKeyBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [CryptoKey][google.cloud.kms.v1.CryptoKey] with updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.kms.v1.CryptoKey.Builder getCryptoKeyBuilder() {

      onChanged();
      return getCryptoKeyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. [CryptoKey][google.cloud.kms.v1.CryptoKey] with updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.kms.v1.CryptoKeyOrBuilder getCryptoKeyOrBuilder() {
      if (cryptoKeyBuilder_ != null) {
        return cryptoKeyBuilder_.getMessageOrBuilder();
      } else {
        return cryptoKey_ == null
            ? com.google.cloud.kms.v1.CryptoKey.getDefaultInstance()
            : cryptoKey_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. [CryptoKey][google.cloud.kms.v1.CryptoKey] with updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKey crypto_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.kms.v1.CryptoKey,
            com.google.cloud.kms.v1.CryptoKey.Builder,
            com.google.cloud.kms.v1.CryptoKeyOrBuilder>
        getCryptoKeyFieldBuilder() {
      if (cryptoKeyBuilder_ == null) {
        cryptoKeyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.kms.v1.CryptoKey,
                com.google.cloud.kms.v1.CryptoKey.Builder,
                com.google.cloud.kms.v1.CryptoKeyOrBuilder>(
                getCryptoKey(), getParentForChildren(), isClean());
        cryptoKey_ = null;
      }
      return cryptoKeyBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.UpdateCryptoKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.UpdateCryptoKeyRequest)
  private static final com.google.cloud.kms.v1.UpdateCryptoKeyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.UpdateCryptoKeyRequest();
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCryptoKeyRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateCryptoKeyRequest>() {
        @java.lang.Override
        public UpdateCryptoKeyRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateCryptoKeyRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateCryptoKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCryptoKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.UpdateCryptoKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
