import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        String separator = File.separator;
        Character pathSeparator = File.pathSeparatorChar;

        String folderUrlGames = "D:" + separator + separator + "Games" + separator;
        String folderURLSrc = "D:" + separator + separator + separator + "Games" + separator + "src" + separator;
        String folderURLGamesRes = "D:" + pathSeparator + separator + "Games" + separator + "res" + separator;
        String fileURLGamesSrcMain = "D:" + separator + separator + "Games" + separator + "src" + separator +
                "main" + separator;

        createFolder(folderUrlGames, "src");
        createFolder(folderUrlGames, "res");
        createFolder(folderUrlGames, "SaveGames");
        createFolder(folderUrlGames, "temp");
        createFolder(folderURLSrc, "main");
        createFolder(folderURLSrc, "test");
        createFolder(folderURLGamesRes, "drawable");
        createFolder(folderURLGamesRes, "vectors");
        createFolder(folderURLGamesRes, "icons");
        createFile(fileURLGamesSrcMain, "main.java");
        createFile(fileURLGamesSrcMain, "util.java");
        createFile("D:" + separator + separator + "Games" + separator + "temp" + separator, "temp.txt");

        try (FileWriter writer =
                     new FileWriter("D:" + separator + separator + "Games" + separator + "temp" + separator + "temp" +
                             ".txt",
                             false)) {
            writer.write(String.valueOf(sb));
        } catch (IOException ex) {
            System.out.println("Запсиь файла не удалась \n");
        }

        System.out.println("Установка завершена");
    }

    public static StringBuilder createFolder(String url, String name) {

        var dirSrc = new File(url + name);
        if (dirSrc.mkdir()) {
            sb.append("Каталог ").append(name).append(" создан \n");
        }
        return sb;
    }

    public static StringBuilder createFile(String url, String fileName) {
        var fileUtilSrcMain = new File(url, fileName);
        try {
            if (fileUtilSrcMain.createNewFile()) sb.append("Файл ").append(fileName).append(" был создан \n");
        } catch (IOException e) {
            sb.append("Не удалось создать файл \n");
        }
        return sb;
    }
}
