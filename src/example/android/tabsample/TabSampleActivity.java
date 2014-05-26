package example.android.tabsample;



import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


public class TabSampleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab_sample);

		getActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);


		ActionBar.Tab tab1 = getActionBar().newTab();
		tab1.setText("タブ1");
		tab1.setTabListener(new TabSampleListener(new Fragment1()));

		ActionBar.Tab tab2 = getActionBar().newTab();
		tab2.setText("タブ2");
		tab2.setIcon(android.R.drawable.ic_menu_edit);
		tab2.setTabListener(new TabSampleListener(new Fragment2()));

		ActionBar.Tab tab3 = getActionBar().newTab();
		tab3.setText("タブ3");
		tab3.setIcon(android.R.drawable.ic_menu_search);
		tab3.setTabListener(new TabSampleListener(new Fragment3()));

		getActionBar().addTab(tab1);
		getActionBar().addTab(tab2);
		getActionBar().addTab(tab3);

	}

	private class TabSampleListener implements ActionBar.TabListener{
		private Fragment fragment;

		public TabSampleListener(Fragment fragment){
			this.fragment = fragment;
		}

		public void onTabReselected(Tab tab, FragmentTransaction ft){

		}

		public void onTabSelected(Tab tab, FragmentTransaction ft){
			ft.add(R.id.ll_tabsample, fragment);
		}

		public void onTabUnselected(Tab tab, FragmentTransaction ft){
			ft.remove(fragment);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tab_sample, menu);
		return true;
	}

}
