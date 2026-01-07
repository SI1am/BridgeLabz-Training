import java.io.*;

public class BufferedVsUnbuffered {
    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) throws IOException {

        File source = new File("input.txt");

        //unbuffered copy
        long start1 = System.nanoTime();
        copyUnbuffered(source, new File("unbuffered_output.txt"));
        long end1 = System.nanoTime();

        //buffered copy
        long start2 = System.nanoTime();
        copyBuffered(source, new File("buffered_output.txt"));
        long end2 = System.nanoTime();

        System.out.println("Unbuffered Time: " + (end1 - start1) + " ns");
        System.out.println("Buffered Time:   " + (end2 - start2) + " ns");
    }

    public static void copyUnbuffered(File src, File dest) throws IOException {

        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);
        try  {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            fis.close();
            fos.close();
        }
    }
    
    public static void copyBuffered(File src, File dest) throws IOException {
        
        
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        try  {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            bis.close();
            bos.close();
        }
    }
}
