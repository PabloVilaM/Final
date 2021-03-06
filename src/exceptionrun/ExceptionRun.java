package exceptionrun;

import javafx.application.Application;
import javafx.stage.Stage;
import view.*;
/**
 *
 * @author celta
 */
public class ExceptionRun extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try{
            ViewManager manager= new ViewManager();
            primaryStage = manager.getMainStage();
            primaryStage.show();

        } catch(Exception e){
            e.printStackTrace();
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
