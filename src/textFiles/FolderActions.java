package textFiles;

import java.io.File;

public class FolderActions {

    public static void main(String[] args) {
        String folderPath = "D:\\bidding-system\\myfiles";
        createFolder(folderPath);
    }

    private static void createFolder(String folderPath){

        File folder = new File(folderPath);
        if (!folder.exists()){
            folder.mkdir();
            System.out.println("Folder created "+ folderPath);
        }
    }
}
