package daiane.example.bancodedadossqlite.view;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import daiane.example.bancodedadossqlite.R;
import daiane.example.bancodedadossqlite.controller.ClienteController;
import daiane.example.bancodedadossqlite.controller.ProdutoController;

public class MainActivity extends AppCompatActivity {
    ClienteController clienteController;
    ProdutoController produtoController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        clienteController = new ClienteController(this);
        produtoController = new ProdutoController(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}