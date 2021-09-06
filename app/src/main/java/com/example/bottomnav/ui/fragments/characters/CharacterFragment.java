package com.example.bottomnav.ui.fragments.characters;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomnav.R;
import com.example.bottomnav.data.CharacterClient;
import com.example.bottomnav.databinding.FragmentCharacterBinding;


public class CharacterFragment extends Fragment implements CharacterAdapter.OnItemClick{

    private FragmentCharacterBinding binding;
    private CharacterAdapter adapter = new CharacterAdapter();
    private CharacterClient client = new CharacterClient();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCharacterBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler();
    }

    private void initRecycler() {
        adapter.setList(client.getList());
        adapter.setListener(this);
        binding.characterRv.setAdapter(adapter);
    }

    @Override
    public void onLongClick(int position) {
//        adapter.removeItem(position);
        AlertDialog.Builder alert = new AlertDialog.Builder(requireActivity());
        alert.setTitle("Attention !!")
                .setMessage("delete item ?")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        adapter.removeItem(position);
                    }
                })
                .setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).show();
    }
}