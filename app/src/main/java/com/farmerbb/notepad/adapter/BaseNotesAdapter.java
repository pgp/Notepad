package com.farmerbb.notepad.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.farmerbb.notepad.R;
import com.farmerbb.notepad.util.NoteListItem;

import java.util.ArrayList;

public class BaseNotesAdapter extends ArrayAdapter<NoteListItem> {

    public final ArrayList<NoteListItem> notes;

    public BaseNotesAdapter(Context context, ArrayList<NoteListItem> notes) {
        super(context, R.layout.row_layout, notes);
        this.notes = notes;
    }
}
