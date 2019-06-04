package br.senac.pi.simulalogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtUsuario;
    private EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);

        findViewById(R.id.btnEntrar).setOnClickListener(login());
    }

    private View.OnClickListener login() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = edtUsuario.getText().toString();
                String senha = edtSenha.getText().toString();
                if ("senac".equals(usuario) && "123".equals(senha)) {
                    Toast.makeText(getApplication(), R.string.login_sucesso, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplication(), R.string.login_error, Toast.LENGTH_LONG).show();
                }
            }
        };
    }
}
