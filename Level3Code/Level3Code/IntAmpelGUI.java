import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Orientation;
import javafx.scene.text.Font;
import javafx.event.ActionEvent;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;

/**
 * Stellt eine Ampel grafisch dar und ermöglicht das Weiterschalten 
 * zur nächsten Ampelphase per Knopfdruck.
 *   
 * @author Axel Schmolitzky, Fredrik Winkler
 * @version 2022
 */
public class IntAmpelGUI
{
    private static IntAmpel _ampel;  // statischer Typ einer Variablen wird durch deklarierten Typ definiert
    private Button _roteLampe;
    private Button _gelbeLampe;
    private Button _grueneLampe;
    private Button _roteRechtsLampe;
    private Button _grueneRechtsLampe;

    /**
     * Erzeugt eine neue Ampel und stellt diese anschliessend dar.
     */
    public IntAmpelGUI()
    {
        _ampel = new IntAmpel( ); // Objekterzeugung
         
        new JFXPanel();
        Platform.setImplicitExit(false);
        Platform.runLater( () -> {
                Stage stage = new Stage();
                TilePane root = initialisiere(stage);
                initialisiereLampen(root);
                initialisiereWeiter(root);
                aktualisiereLampen();
                stage.setAlwaysOnTop(true);
                stage.show();
                stage.setAlwaysOnTop(false);
            });
    }

    /**
     * Initialisiert die Stage und liefert den TilePane, der die
     * weiteren Nodes aufnimmt.
     */
    private TilePane initialisiere(Stage stage)
    {
        stage.setTitle("IntAmpel");
        stage.setAlwaysOnTop(true);
        stage.setMinWidth(220);
        stage.setMinHeight(250);
        TilePane root = new TilePane(Orientation.VERTICAL);
        root.setAlignment(Pos.CENTER);
        root.setPrefColumns(1);
        root.setPrefRows(3);
        root.setBorder(new Border(new BorderStroke(null,BorderStrokeStyle.SOLID,null,BorderStroke.THIN)));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        // stage.setOnCloseRequest(e -> System.exit(0));
        return root;
    }

    /**
     * Erzeugt fuer jede Lampe einen Button und traegt ihn die GUI ein.
     */
    private void initialisiereLampen(TilePane root)
    {
        _roteLampe = neueLampe(0);
        root.getChildren().add(_roteLampe);
        _gelbeLampe = neueLampe(1);
        root.getChildren().add(_gelbeLampe);
        _grueneLampe = neueLampe(2);
        root.getChildren().add(_grueneLampe);
        _roteRechtsLampe = neueLampe(3);
        root.getChildren().add(_roteRechtsLampe);
        _grueneRechtsLampe = neueLampe(4);
        root.getChildren().add(_grueneRechtsLampe);
    }
    
    /**
     * Erzeugt einen LampenButton.
     */
    private Button neueLampe(int reihe)
    {
        Button lampe = new Button("\uf06e");
        lampe.setFont(new Font("Webdings", 48));
        lampe.setPadding(new Insets(0,5,5,5));
        lampe.setBackground(new Background(new BackgroundFill(Color.DARKGREY,null,null)));
        lampe.setBorder(new Border(new BorderStroke(null,BorderStrokeStyle.SOLID,null,BorderStroke.THIN)));
        lampe.setTextFill(Color.BLACK);
        // lampe.getFont().fo
        return lampe;
    }

    /**
     * Erzeugt den Weiter-Button und fuegt einen EventHandler hinzu,
     * der die Ampel weiterschaltet, wenn der Button gedrueckt wird.
     */
    private void initialisiereWeiter(TilePane root)
    {
        Button weiter = new Button("weiter");
        weiter.setFont(new Font("Arial", 18));
        weiter.setOnAction(actionEvent -> {_ampel.schalteWeiter( ); aktualisiereLampen(); });
        root.getChildren().add(weiter);
        // ampel.schalteWeiter ( ) = statischer Typ liegt Operationen fest, die über Variable aufrufbar sind
    }

    /**
     * Setzt die Farben der Lampen-Buttons entsprechend der Phase der verwendeten Ampel.
     */
    private void aktualisiereLampen()
    {
        _roteLampe.setTextFill(_ampel.leuchtetRot() ? Color.RED : Color.BLACK);
        _gelbeLampe.setTextFill(_ampel.leuchtetGelb() ? Color.YELLOW : Color.BLACK);
        _grueneLampe.setTextFill(_ampel.leuchtetGruen() ? Color.LIME : Color.BLACK);
        _roteRechtsLampe.setTextFill(_ampel.leuchtetRot()? Color.RED : Color.BLACK);
        _grueneRechtsLampe.setTextFill(_ampel.leuchtetGruen() ? Color.LIME : Color.BLACK);
    }
}
