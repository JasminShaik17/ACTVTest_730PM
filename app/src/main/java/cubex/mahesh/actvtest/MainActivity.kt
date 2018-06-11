package cubex.mahesh.actvtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {

    var actv:AutoCompleteTextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        actv = findViewById(R.id.actv)

        var values =  resources.getStringArray(R.array.countries)

  /*      var values = mutableListOf<String>()
        values.add("South Africa")
        values.add("Sri Lanka")
        values.add("Saudi  Arebia") */


        var myadapter = ArrayAdapter<String>(this,
          android.R.layout.simple_list_item_single_choice,values)
        actv?.setAdapter(myadapter)
        actv?.threshold = 1
    }
}
