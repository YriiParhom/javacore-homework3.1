import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var sb = new StringBuilder();

        var dirSrc = new File("D://Games/src");
        if (dirSrc.mkdir()) {
            sb.append("Каталог \"src\" создан \n");
        }

        var dirRes = new File("D://Games/res");
        if (dirRes.mkdir()) {
            sb.append("Каталог \"res\" создан \n");
        }

        var dirSaveGames = new File("D://Games/SaveGames");
        if (dirSaveGames.mkdir()) {
            sb.append("Каталог \"SaveGames\" создан \n");
        }

        var dirTemp = new File("D://Games/temp");
        if (dirTemp.mkdir()) {
            sb.append("Каталог \"temp\" создан \n");
        }

        var dirMain = new File("D://Games/src/main");
        if (dirMain.mkdir()) {
            sb.append("Каталог \"main\" создан \n");
        }

        var dirTest = new File("D://Games/src/test");
        if (dirTest.mkdir()) {
            sb.append("Каталог \"test\" создан \n");
        }

        var dirDrawables = new File("D://Games/res/drawables");
        if (dirDrawables.mkdir()) {
            sb.append("Каталог \"drawables\" создан \n");
        }

        var dirVectors = new File("D://Games/res/vectors");
        if (dirVectors.mkdir()) {
            sb.append("Каталог \"vectors\" создан \n");
        }

        var dirIcons = new File("D://Games/res/icons");
        if (dirIcons.mkdir()) {
            sb.append("Каталог \"icons\" создан \n");
        }

        var fileMainSrcMain = new File("D://Games/src/main//main.java");
        try {
            if (fileMainSrcMain.createNewFile()) sb.append("Файл main.java был создан \n");
        } catch (IOException e) {
            sb.append("Не удалось создать файл \n");
        }

        var fileUtilSrcMain = new File("D://Games/src/main//util.java");
        try {
            if (fileUtilSrcMain.createNewFile()) sb.append("Файл util.java был создан \n");
        } catch (IOException e) {
            sb.append("Не удалось создать файл \n");
        }

        var fileTempTemp = new File("D://Games/temp//temp.txt");
        try {
            if (fileTempTemp.createNewFile()) sb.append("Файл temp.txt был создан \n");
        } catch (IOException e) {
            sb.append("Не удалось создать файл \n");
        }

        try (FileWriter writer = new FileWriter("D://Games/temp//temp.txt", false)) {
            writer.write(String.valueOf(sb));
        } catch (IOException ex) {
            System.out.println("Запсиь файла не удалась \n");
        }

        System.out.println("Установка завершена");
    }
}
