package io;

/**
 * Created by Ostin on 22.11.2015.
 */
import java.io.*;
public class FormattedMemoryInput {
    public static void main(String[] args)
            throws IOException {
        try {
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile.read(
                                    "FormattedMemoryInput.java").getBytes()));
            while(true)
                System.out.print((char)in.readByte());
        } catch(EOFException e) {
            System.err.println("End of stream");
        }
    }
}