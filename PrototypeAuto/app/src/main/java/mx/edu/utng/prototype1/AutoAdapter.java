package mx.edu.utng.prototype1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ZENAIDO-PC on 13/09/2016.
 */
public class AutoAdapter extends ArrayAdapter<Auto> {
    public AutoAdapter(Context context, ArrayList<Auto> autos){
        super(context, 0, autos);
    }

    public View getView(int position, View convertView, ViewGroup parent){
      Auto auto = getItem(position);
        if (convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.auto_layout, parent,false);
        }
        TextView txvAuto = (TextView)convertView.findViewById(R.id.txv_auto);

        txvAuto.setText(auto.getModelo()+" "+auto.getTipo()+" "+auto.getColor());
        return convertView;
    }
}
