// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface ReceivedMessageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.ReceivedMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * This ID can be used to acknowledge the received message.
   * </pre>
   *
   * <code>string ack_id = 1;</code>
   */
  java.lang.String getAckId();
  /**
   *
   *
   * <pre>
   * This ID can be used to acknowledge the received message.
   * </pre>
   *
   * <code>string ack_id = 1;</code>
   */
  com.google.protobuf.ByteString getAckIdBytes();

  /**
   *
   *
   * <pre>
   * The message.
   * </pre>
   *
   * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
   */
  boolean hasMessage();
  /**
   *
   *
   * <pre>
   * The message.
   * </pre>
   *
   * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
   */
  com.google.pubsub.v1.PubsubMessage getMessage();
  /**
   *
   *
   * <pre>
   * The message.
   * </pre>
   *
   * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
   */
  com.google.pubsub.v1.PubsubMessageOrBuilder getMessageOrBuilder();
}
