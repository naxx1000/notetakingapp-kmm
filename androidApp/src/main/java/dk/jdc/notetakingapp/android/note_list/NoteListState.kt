package dk.jdc.notetakingapp.android.note_list

import dk.jdc.notetakingapp.domain.note.Note

data class NoteListState(
    val notes: List<Note> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean = false
)
