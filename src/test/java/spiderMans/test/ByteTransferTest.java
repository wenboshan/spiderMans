package spiderMans.test;

public class ByteTransferTest {
    public static void main(String[] args) {
        int y [] = new int[]{0x1f,0x8b,0x8,0x0,0x0,0x0,0x0,0x0,0x0,0x3,00,0x85,0xef,0xfd,0x15,0x12,0xad,0x8b,0xac,0xad,0xee,0xcd,0xdb,0x1f,0xbf, 0x82,0x83,0x3,0xe7,0xf0,0xcd,0x99,0x1,0xde,0xeb,0x92,0xa3,0x1,0xda,0xb7,0x1c,70,0xba,0x93,40,0xb1,0x83,~0x9a,0x91,0x1f,0x8e,0xb6,0x8d,0xa6,0x15,0xa8,0x15,0xa3,0xc8,0x19};


        byte a [] = new byte[y.length];


        for (int i = 0; i < a.length; i++) {

            a[i] = (byte) y[i];
        }
        System.out.println(new String(a));
    }
}