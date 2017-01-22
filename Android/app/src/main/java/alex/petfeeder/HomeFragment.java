package alex.petfeeder;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    View view;
    ImageButton food, water;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view    =  inflater.inflate(R.layout.fragment_home, container, false);
        food    = (ImageButton) view.findViewById(R.id.iv_dogfood);
        water   = (ImageButton) view.findViewById(R.id.iv_water);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent food = new Intent(getActivity(), FoodActivity.class);
                startActivity(food);
            }
        });
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent water = new Intent(getActivity(),DrinkActivity.class);
                startActivity(water);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

}
