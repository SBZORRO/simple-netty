package com.simple.netty.transport.channel;

/**
 * 事件激活
 * Date: 2020-01-02
 * Time: 20:35
 *
 * @author yrw
 */
public interface ChannelInboundInvoker {

    ChannelInboundInvoker fireChannelRegistered();

    ChannelInboundInvoker fireChannelUnregistered();

    ChannelInboundInvoker fireChannelActive();

    ChannelInboundInvoker fireChannelInactive();

    ChannelInboundInvoker fireExceptionCaught(Throwable cause);

    ChannelInboundInvoker fireUserEventTriggered(Object event);

    ChannelInboundInvoker fireChannelRead(Object msg);

    ChannelInboundInvoker fireChannelReadComplete();

    ChannelInboundInvoker fireChannelWritabilityChanged();
}
