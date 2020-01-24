public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int calculateMegabytes = (kiloBytes / 1024);

        int calculateBytes = (kiloBytes % 1024);

        if(kiloBytes < 0)
        {
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(kiloBytes + " KB = " + calculateMegabytes + " MB and " + calculateBytes + " KB");
        }
    }

}


