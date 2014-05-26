package example.android.tabsample;


import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment2 extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container,
			Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.fragment2, container, false);
		view.setBackgroundColor(Color.GREEN);

		return view;
	}

}
