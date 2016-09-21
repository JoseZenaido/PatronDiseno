package mx.edu.utng.prototype2;

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
public class CalendarioAdapter extends ArrayAdapter<Calendario> {
    public CalendarioAdapter(Context context, ArrayList<Calendario> calendarios){
        super(context, 0, calendarios);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Calendario calendario = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.calendario_layout, parent, false);
        }
        TextView txvCalendario = (TextView)convertView.findViewById(R.id.txv_calendario);
        txvCalendario.setText(calendario.getNombre()+""+calendario.getAño()+ "  "+calendario.getTamanio());

        return convertView;
    }

}
