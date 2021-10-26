package net.ivanvega.minavegacionuiux;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BlankFragment2 extends Fragment {

    private BlankViewModel2 mViewModel;

    public static BlankFragment2 newInstance() {
        return new BlankFragment2();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.blank_fragment2, container, false);
        ((TextView)layout.findViewById(R.id.lblTitleFrag2)).setText(
            getArguments().getString("nombre")
        );

        return layout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(BlankViewModel2.class);
        // TODO: Use the ViewModel
    }

}