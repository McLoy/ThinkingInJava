package io;

/**
 * Created by Ostin on 22.11.2015.
 */
import java.io.*;
public class TestEOF {
    public static void main(String[] args)
            throws IOException {
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("TestEOF.java")));
        while(in.available() != 0)
            System.out.print((char)in.readByte());
    }
}