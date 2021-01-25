data class Comment (
        var id: Int=0, // идентификатор комментария.
        val postId: Int =0, // идентификатор  поста, к которорму добавлен комментарий
        val fromId: Int=0, // идентификатор автора комментария.
        val date: Int=0, //	дата создания комментария в формате Unixtime.
        val text: String =" ", // текст комментария.
        val donut: Donut? = null, // object	информация о VK Donut. Объект со следующими полями:
    // is_don (boolean) — является ли комментатор подписчиком VK Donut.
    //placeholder (string) — заглушка для пользователей, которые не оформили подписку VK Donut.
        val replyToUser: Int =0, //идентификатор пользователя или сообщества, в ответ которому оставлен текущий комментарий (если применимо).
        val replyToComment: Int =0, // идентификатор комментария, в ответ на который оставлен текущий (если применимо).
        val attachments: Array<Attachment>? = null, //object	медиавложения комментария (фотографии, ссылки и т.п.). Описание массива attachments находится на отдельной странице.
        val parentsStack: Array<Int>? = null, // массив идентификаторов родительских комментариев.
        val thread: CommentThread?=null //Информация о вложенной ветке комментариев
)

data class CommentThread (
    val count: Int =0, // количество комментариев в ветке.
    val items: Array<Comment>? = null,// массив объектов комментариев к записи (только для метода wall.getComments).
    val canPost: Boolean = true, // – может ли текущий пользователь оставлять комментарии в этой ветке.
    val showReplyButton: Boolean = true, //нужно ли отображать кнопку «ответить» в ветке.
    val groupsCanPost: Boolean = false//могут ли сообщества оставлять комментарии в ветке.
)

