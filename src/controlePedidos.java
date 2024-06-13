import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controlePedidos {
    Double n1, n2, n3, n4,n5, n6, n7, n8, n9;

    @FXML
    private Button calcular;

    @FXML
    private Button limpar;

    @FXML
    private TextField quantidadeBola;

    @FXML
    private TextField quantidadeChoco;

    @FXML
    private TextField quantidadePote;

    @FXML
    private TextField quantidadeSorv;

    @FXML
    private TextField valorBola;

    @FXML
    private TextField valorChoco;

    @FXML
    private TextField valorPote;

    @FXML
    private TextField valorSorv;

    @FXML
    private TextField valorTotal;

    @FXML
    void fazerCalculo(ActionEvent event) {  
        n1= Double.parseDouble(quantidadeBola.getText());
        n2= Double.parseDouble(quantidadeChoco.getText());
        n3= Double.parseDouble(quantidadePote.getText());
        n4= Double.parseDouble(quantidadeSorv.getText());
        n5= Double.parseDouble(valorBola.getText());
        n6= Double.parseDouble(valorChoco.getText());
        n7= Double.parseDouble(valorPote.getText());
        n8= Double.parseDouble(valorSorv.getText()); 
        n9 = (n1*n5) + (n2*n6) + (n3*n7) + (n4*n8);

        valorTotal.setText(String.valueOf(n9));
    }

    @FXML
    void limparDados(ActionEvent event) {
        quantidadeBola.setText("");
        quantidadeChoco.setText("");
        quantidadePote.setText("");
        quantidadeSorv.setText("");
        valorBola.setText("");
        valorChoco.setText("");
        valorPote.setText("");
        valorSorv.setText("");
        valorTotal.setText("");

    }

}

