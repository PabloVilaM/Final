
package modelado;

import javafx.animation.TranslateTransition;
import javafx.scene.SubScene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.util.Duration;


public class ExcSubEscenas extends SubScene {
    
    private final static String FONT_PATH = "src/modelado/recursos/kenvector_future.tlf";
    private final static String BACKGROUND_IMAGE = "File:green_panel.png";
    
    private  boolean ocultar;
    
    public ExcSubEscenas() {
        super(new AnchorPane(),600, 400);
        prefWidth(600);
        prefHeight(400);
        
        BackgroundImage myBI= new BackgroundImage(new Image(BACKGROUND_IMAGE,600,400,false,true),
                    BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                    BackgroundSize.DEFAULT);
        
       AnchorPane root2= (AnchorPane) this.getRoot();
       root2.setBackground(new Background(myBI));
        
        setLayoutX(1024);
        setLayoutY(100);
        
        
    }
    
  public void moverSubScene (){
      TranslateTransition tr = new TranslateTransition();
      tr.setDuration(Duration.seconds(0.3));
      /**QUÉ ELEMENTO MOVEMOS **/
      tr.setNode(this);
      /**COMO CAMBIA SU POSICION **/
      if(ocultar){
      tr.setToX(-676);
      ocultar=false;
      }else{
          tr.setToX(0);
          ocultar = true;
      }
      tr.play();
  }
    
}
