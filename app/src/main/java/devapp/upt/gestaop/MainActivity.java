package devapp.upt.gestaop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addProduct(View button) {
// find the textboxes
        EditText productNameEdit = (EditText) findViewById(R.id.TexBoxPName);
        EditText
                productPriceEdit = (EditText) findViewById(R.id.TextBoxPPrice);
// copy the values
        String productName = productNameEdit.getText().toString();
        float productPrice = Float.parseFloat(productPriceEdit.getText().toString());
        Product nProduct = new Product(productName,
                productPrice);
// clear the textboxes productNameEdit.setText(null);
        productPriceEdit.setText(null);
// show in label
        TextView target = (TextView) findViewById(R.id.precoProdutoNomeAtualizar);
        target.setText(nProduct.toString());
        // create the product
    }
}