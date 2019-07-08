package sg.edu.rp.c347.portfolio_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Ride> {
    private ArrayList<Ride> ride;
    private Context context;
    private TextView tvDate;
    private TextView tvLocation;
    private ImageView ivMap;


    public CustomAdapter(Context context, int resource, ArrayList<Ride> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        ride = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvDate = rowView.findViewById(R.id.tvDateTime);
        tvLocation = rowView.findViewById(R.id.tvLocation);
        ivMap = rowView.findViewById(R.id.ivMap);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Ride currentRide = ride.get(position);
        // Set the TextView to show the food

        tvDate.setText(currentRide.getDate() + "  " + currentRide.getTime());
        tvLocation.setText(currentRide.getMeetup());

        // Return the nicely done up View to the ListView
        return rowView;
    }

}
