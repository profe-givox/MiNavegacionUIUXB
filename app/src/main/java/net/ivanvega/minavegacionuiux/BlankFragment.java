package net.ivanvega.minavegacionuiux;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BlankFragment extends Fragment {

    private BlankViewModel mViewModel;

    public static BlankFragment newInstance() {
        return new BlankFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.blank_fragment, container, false);

        layout.findViewById(R.id.btnNavegar).setOnClickListener(
                view -> {
                    /*
                    NavHostFragment.findNavController(Fragment)
                    Navigation.findNavController(Activity, @IdRes int viewId)
                    Navigation.findNavController(View)
                     */
                    Bundle bundle = new Bundle();
                    bundle.putString("nombre", "ITSUR");

                   NavController navController = NavHostFragment.findNavController(this) ;
                   navController.navigate(R.id.nav_blankfragment2,bundle);

                }
        );

        return layout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(BlankViewModel.class);
        // TODO: Use the ViewModel
    }

}