package Operations;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import main.*;

public class SelectAll implements OperationStrategy{
    Notepad notepad;
    public SelectAll(Notepad notepad){
        this.notepad = notepad;
    }

    @Override
    public void makeOperation() {
        try {
       Robot robot  = new Robot();
       robot.keyPress(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_A);          
        } catch (Exception e) {
        }

    }
    
    
}
