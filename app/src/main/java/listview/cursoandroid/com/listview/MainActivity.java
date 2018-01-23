package listview.cursoandroid.com.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listaItens;
    private String[] itens = {
            "Angra dos Reis", "Caldas Novas", "Campos do Jordão", "Costa do Sauipe",
            "Ilhéus", "Porto Seguro", "Rio de Janeiro", "Tiradentes", "Praga",
            "Santiago", "Zurique", "Caribe", "Buenos Aires", "Budapeste", "Cancun", "Aruba"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaItens = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens);

        listaItens.setAdapter(adapter);

        listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int codigoPosicao = i;
                String valorClicado = listaItens.getItemAtPosition(codigoPosicao).toString();

                Toast.makeText(MainActivity.this, valorClicado, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
