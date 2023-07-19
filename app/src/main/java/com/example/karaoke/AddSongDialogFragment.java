package com.example.karaoke;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.DialogFragment;

import com.example.karaoke.Adapter.SongAdapter;
import com.example.karaoke.Models.Song;

import java.util.List;

public class AddSongDialogFragment extends DialogFragment {

    private List<Song> songList;

    public AddSongDialogFragment(List<Song> songList, SongAdapter songAdapter) {
        this.songList = songList;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.fragment_add_song_dialog, null);
        EditText edtSongId = dialogView.findViewById(R.id.edtSongId);
        EditText edtSongName = dialogView.findViewById(R.id.edtSongName);
        EditText edtSongDesc = dialogView.findViewById(R.id.edtSongDescription);
        EditText edtSongAuthor = dialogView.findViewById(R.id.edtSongAuthor);
        Button btnAdd = dialogView.findViewById(R.id.btnAdd);
        Button btnCancel = dialogView.findViewById(R.id.btnCancel);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String songId = edtSongId.getText().toString();
                String songName = edtSongName.getText().toString();
                String songDesc = edtSongDesc.getText().toString();
                String songAuthor = edtSongAuthor.getText().toString();

                Song newSong = new Song(songId, songName, songDesc, songAuthor);

                songList.add(newSong);

                getDialog().dismiss();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });

        builder.setView(dialogView)
                .setTitle("Add Song");

        return builder.create();
    }

}