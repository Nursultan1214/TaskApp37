package com.example.taskapp37;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.taskapp37.databinding.FragmentHomeBinding;
import com.example.taskapp37.databinding.FragmentNewsBinding;
import com.example.taskapp37.models.News;
import com.example.taskapp37.ui.home.HomeViewModel;

import org.jetbrains.annotations.NotNull;

public class NewsFragment extends Fragment {

    private FragmentNewsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentNewsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
                
            }
        });
    }

    private void save() {
        String text = binding.EditText.getText().toString().trim();
        Bundle bundle = new Bundle();
        News news = new News(text, System.currentTimeMillis());
        bundle.putSerializable("news", news);
        getChildFragmentManager().setFragmentResult("rk_news", bundle);
        close();
    }

    private void close(){
        NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
        navController.navigateUp();

    }
}