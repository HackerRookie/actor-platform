package im.actor.server.mtproto.protocol

trait ProtoMessageWithHeader {
  val header: Int
}
trait ProtoMessage extends ProtoMessageWithHeader
trait RpcRequestMessage extends ProtoMessageWithHeader
trait RpcResponseMessage extends ProtoMessageWithHeader
trait UpdateMessage extends ProtoMessageWithHeader
