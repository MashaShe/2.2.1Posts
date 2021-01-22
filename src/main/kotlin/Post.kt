data class Post (
        //id = 0 или <0, значит объекта не существует
        var id: Int,
        val ownerId: Int, //идентификатор владельца стены, на которой размещена запись.
        val formId: Int, //идентификатор автора записи (от чьего имени опубликована запись)
        val createdBy: Int =0, // идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора). Возвращается в записях, опубликованных менее 24 часов назад.
        val date: Int, //время публикации записи в формате unixtime.
        val text: String,
        val replyOwnerId: Int = 0, //идентификатор владельца записи, в ответ на которую была оставлена текущая.
        val replyPostId: Int = 0, //идентификатор записи, в ответ на которую была оставлена текущая.
        val friendOnly: Boolean = false,
        val comments: Comment = Comment(), //информация о комментариях к записи, объект с полями - см отдельный класс
        val copyright: Copyright = Copyright(), //источник материала, объект с полями - см отдельный класс
        val likes: Likes = Likes(), //информация о лайках к записи, объект с полями - см отдельный класс
        val reposts: Reposts = Reposts(), //информация о репостах записи («Рассказать друзьям»), объект с полями - см отдельный класс
        val views: Views = Views(), //информация о просмотрах записи. Объект с единственным полем - см отдельный класс
        val postType:String = "post", //тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
        val post_source: PostSource? = null, // Поле возвращается только для Standalone-приложений с ключом доступа, полученным в Implicit Flow. 	информация о способе размещения записи. - см отдельный класс
        val geo: Geo? = null, //  информация о местоположении , содержит поля - см отдельный класс
        val signerId: Int = 0, //идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
        val canPin: Boolean = true, // информация о том, может ли текущий пользователь закрепить запись
        val canDelete: Boolean = false, //информация о том, может ли текущий пользователь удалить запись
        val canEdit:Boolean = false, //информация о том, может ли текущий пользователь редактировать запись
        var is_pinned: Boolean = false, //информация о том, что запись закреплена.
        val markedAsAdds: Boolean = false, //информация о том, содержит ли запись отметку "реклама"
        var isFavorite: Boolean = false, // true, если объект добавлен в закладки у текущего пользователя.
        val donut:Donut = Donut(),//информация о записи VK Donut, объект с полями - см отдельный класс
        val postponed_id:Int = 0//идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.

    ){

}


//likes: Int = 0
//        var likes: Int = likes
//            set(value){ это сеттер
//                    if (value >=0) {
//                        field = value - так не присвоит отрицательные значения полю
//                    }
//            }
