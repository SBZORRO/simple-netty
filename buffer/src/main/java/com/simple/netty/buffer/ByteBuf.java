package com.simple.netty.buffer;

import com.simple.netty.buffer.allocator.ByteBufAllocator;

import java.nio.ByteBuffer;

/**
 * Date: 2019-12-14
 * Time: 12:35
 *
 * @author yrw
 */
public abstract class ByteBuf {

    public abstract int capacity();

    public abstract int maxCapacity();

    public abstract ByteBufAllocator alloc();

    public abstract boolean isDirect();


    public abstract int readableBytes();

    public abstract int writableBytes();

    public abstract boolean isReadable();

    public abstract boolean isReadable(int size);

    public abstract boolean isWritable();

    public abstract boolean isWritable(int size);

    public abstract ByteBuf clear();


    public abstract ByteBuf markReaderIndex();

    public abstract ByteBuf resetReaderIndex();

    public abstract ByteBuf markWriterIndex();

    public abstract ByteBuf resetWriterIndex();


    public abstract boolean getBoolean(int index);

    public abstract byte getByte(int index);

    public abstract int getInt(int index);

    public abstract char getChar(int index);

    public abstract double getDouble(int index);

    public abstract ByteBuf getBytes(int index, ByteBuf dst);

    public abstract ByteBuf getBytes(int index, byte[] dst);


    public abstract boolean readBoolean();

    public abstract byte readByte();

    public abstract int readInt();

    public abstract char readChar();

    public abstract double readDouble();

    public abstract ByteBuf readBytes(int length);

    public abstract ByteBuf readSlice(int length);

    public abstract ByteBuf readRetainedSlice(int length);

    public abstract ByteBuf readBytes(ByteBuf dst);

    public abstract ByteBuf readBytes(byte[] dst);

    public abstract ByteBuf readBytes(ByteBuffer dst);


    public abstract ByteBuf writeBoolean(boolean value);

    public abstract ByteBuf writeByte(int value);

    public abstract ByteBuf writeShortLE(int value);

    public abstract ByteBuf writeInt(int value);

    public abstract ByteBuf writeChar(int value);

    public abstract ByteBuf writeBytes(ByteBuf src);

    public abstract ByteBuf writeBytes(byte[] src);

    public abstract ByteBuf writeBytes(ByteBuffer src);
}
