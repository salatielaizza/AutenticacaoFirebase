package com.cursoandroid.autenticacaousuario.autenticacaousuario;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();




        //Login usuario
        /*
        firebaseAuth.signInWithEmailAndPassword("salatiel@email.com", "senha123")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if ( task.isSuccessful()){ //sucesso ao fazer sigIn
                            Log.i( "signIn", "Sucesso ao fazer login do usuario");
                        }else {
                            Log.i("signIn", "login do usuario Não realizado");
                        }

                    }
                });
        */

        //deslogar usuario
        firebaseAuth.signOut();

        //Verifica se o usuario atual está logado
        if ( firebaseAuth.getCurrentUser() != null) {
            Log.i("verificaUser", "Usuario está logado");
        }else {
            Log.i("verificaUser", "Usuario Não está logado");
        }


        //cadastro
        /*
        firebaseAuth.createUserWithEmailAndPassword("salatiel@email.com", "senha123"  )
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if ( task.isSuccessful()){ //sucesso ao cadastrar
                    Log.i( "createUser", "Sucesso ao cadastrar");
                }else {
                    Log.i("createUser", "Cadastro Não realizado");
                }

            }
        });
        */

    }
}
