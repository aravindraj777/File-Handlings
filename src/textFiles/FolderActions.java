package textFiles;

import java.io.File;

public class FolderActions {

    public static void main(String[] args) {
        String folderPath = "D:\\bidding-system\\myfiles";
        createFolder(folderPath);
        System.out.println(isFolderExists(folderPath));
    }

    private static void createFolder(String folderPath){

        File folder = new File(folderPath);
        if (!folder.exists()){
            folder.mkdir();
            System.out.println("Folder created "+ folderPath);
        }
    }

    private static boolean isFolderExists(String folderPath){
        File folder = new File(folderPath);
        return folder.exists();
    }
}
