package Operations;
import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import main.*;

public class OpenFile implements OperationStrategy{
    Notepad notepad;
    public OpenFile(Notepad notepad){
        this.notepad = notepad;
    }
    
    @Override
    public void makeOperation(){
        String fileName;
        FileDialog fd = new FileDialog(notepad, "Open File", FileDialog.LOAD);
        fd.setVisible(true);
        
        if(fd.getFile() != null){
            fileName = fd.getDirectory() + fd.getFile();
            notepad.setTitle(fileName);
            
            try {
            Scanner sc = new Scanner(new File(fileName));
            notepad.textArea.setText("");
            while(sc.hasNextLine()){
                notepad.textArea.append(sc.nextLine() + "\n");               
            }
            
            } catch (FileNotFoundException e) {
                System.out.println("File is not found!");
            }  
        }
      }
    
}
