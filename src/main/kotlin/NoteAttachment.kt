data class NoteAttachment (
    override val type: String,
    val note: Note
):Attachment {

}

data class Note (
    val id: Int = 0, // идентификатор заметки.
    val ownerId: Int =0, // идентификатор владельца заметки.
    val title: String = " ", // заголовок заметки.
    val text: String =" ", // текст заметки.
    val date: Int = 0, // дата создания заметки в формате Unixtime.
    val comments: Int = 0, // количество комментариев.
    val readComments: Int = 0, // количество прочитанных комментариев (только при запросе информации о заметке текущего пользователя).
    val viewUrl: String = " " // URL страницы для отображения заметки.
)