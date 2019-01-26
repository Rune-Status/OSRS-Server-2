package io.guthix.osrs.server.net

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.MessageToByteEncoder

enum class StatusResponse(val opcode: Int) {
    SUCCESSFUL(0),
    DELAY(1),
    NORMAL(2),
    INVALID_CREDENTIALS(3),
    ACCOUNT_DISABLED(4),
    ACCOUNT_ONLINE(5),
    OUT_OF_DATE(6),
    SERVER_FULL(7),
    LOGIN_SERVER_OFFLINE(8),
    LOGIN_LIMIT_EXCEEDED(9),
    BAD_SESSION_ID(10),
    LOGIN_SERVER_REJECTED_SESSION(11),
    MEMBERS_ACCOUNT_REQUIRED(12),
    COULD_NOT_COMPLETE_LOGIN(13),
    SERVER_BEING_UPDATED(14),
    RECONNECTING(15),
    LOGIN_ATTEMPTS_EXCEEDED(16),
    MEMBERS_ONLY_AREA(17),
    INVALID_LOGIN_SERVER(20),
    TRANSFERRING_PROFILE(21);
}

class StatusResponseEncoder : MessageToByteEncoder<StatusResponse>() {
    override fun encode(ctx: ChannelHandlerContext, msg: StatusResponse, out: ByteBuf) {
        out.writeByte(msg.opcode)
    }

}