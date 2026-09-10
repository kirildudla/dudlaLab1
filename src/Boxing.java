void main()
{
    int i = 5;
    Integer iw = 10;
    Integer auto = i;
    int unbox = iw;

    boolean b = true;
    Boolean bw = false;
    Boolean autoB = b;
    boolean unboxB = bw;

    long l = 1000000L;
    Long lw = 2000000L;
    Long autoL = l;
    long unboxL = lw;

    IO.println("i = " + i);
    IO.println("iw = " + iw);
    IO.println("auto = " + auto);
    IO.println("unbox = " + unbox);

    IO.println("b = " + b);
    IO.println("bw = " + bw);
    IO.println("autoB = " + autoB);
    IO.println("unboxB = " + unboxB);

    IO.println("l = " + l);
    IO.println("lw = " + lw);
    IO.println("autoL = " + autoL);
    IO.println("unboxL = " + unboxL);

    IO.println(i + iw);
    IO.println(l + lw);

    try
    {
        Integer npe = null;
        int x = npe;
    }
    catch (NullPointerException e)
    {
        IO.println("NPE: распаковка Integer null");
    }
}