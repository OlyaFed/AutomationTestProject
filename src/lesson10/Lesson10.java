package lesson10;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//1. Read about java.nio package(Path, Paths, Files, File) and try to use it to read the data from the first file
//        and write this data to the second file. Delete the initial file from the disk.
public class Lesson10 {
    public static void main(String[] args) throws IOException {
        String fileName1 = System.getProperty("user.dir") + "/src/lesson10/file1.txt";
        String fileName2 = System.getProperty("user.dir") + "/src/lesson10/file2.txt";

        createFile(fileName1, "content in file1=1\n");
        createFile(fileName2, "content in file29999\n");
        copy(fileName1, fileName2);
        deleteFile(fileName1);
    }
    public static void deleteFile(String fileName1) {
        try {
            Files.delete(Paths.get(fileName1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createFile(String fileName, String textIntofile) {
        Path path = Paths.get(fileName);
        try (BufferedWriter writer =
                     Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {

            writer.write(textIntofile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copy(String file1, String file2) throws IOException {
        String source = file1;
        String dest = file2;

        File fin = new File(source);
        FileInputStream fis = new FileInputStream(fin);
        BufferedReader in = new BufferedReader(new InputStreamReader(fis));

        FileWriter fstream = new FileWriter(dest, true);
        BufferedWriter out = new BufferedWriter(fstream);

        String aLine = null;
        while ((aLine = in.readLine()) != null) {
            out.write(aLine);
            out.newLine();
        }

        in.close();
        out.close();
    }
}
