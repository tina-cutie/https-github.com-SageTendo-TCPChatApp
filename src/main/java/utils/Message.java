package utils;

import java.io.Serializable;

/**
 * Represents a message in a client-server chat application.
 */
public class Message implements Serializable {

  public enum MessageType {
    // TODO: Add more types if necessary
    CHAT,
    CONNECTION,
    DISCONNECTION,
    INVALID_MESSAGE,
    INVALID_USERNAME,
    NONEXISTENT_USER,
    USERS,
    WHISPER

  }

  private final MessageType type;
  private final String sender;
  private final String receiver;
  private final String body;
  private static final long serialVersionUID = 69L;

  public static final String DELIMITER = ",";

  /**
   * Constructor
   *
   * @param type:     The type of message to be sent
   * @param sender:   The client sending the message
   * @param receiver: The client receiving the message (for Whisper messages)
   * @param body:     The content of the message, such as "Hello User1"
   */
  public Message(MessageType type, String sender, String receiver, String body) {
    this.type = type;
    this.sender = sender;
    this.receiver = receiver;
    this.body = body;
  }

  /**
   * @return MessageType: The message type
   */
  public MessageType getType() {
    return type;
  }

  /**
   * @return String: The sender's username
   */
  public String getSender() {
    return sender;
  }

  /**
   * @return String: The receiver's username
   */
  public String getReceiver() {
    return receiver;
  }

  /**
   * @return String: The message body
   */
  public String getBody() {
    return body;
  }

  /**
   * EXAMPLE MESSAGE=> TYPE: TEXT FROM: Alice TO: Bob body: Hi Bob, how are you doing?
   *
   * @return A string representation of the message object.
   */
  @Override
  public String toString() {
    return "MESSAGE:\n" +
        "\t TYPE: " + type + '\n' +
        "\t FROM: " + sender + '\n' +
        "\t TO: " + receiver + '\n' +
        "\t body: " + body + "\n";
  }
}
