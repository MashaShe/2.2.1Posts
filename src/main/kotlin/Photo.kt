data class Photo (
    val id: Int = 0, // integer	идентификатор фотографии.
    val albumId: Int =0, //идентификатор альбома, в котором находится фотография.
    val ownerId: Int = 0, //идентификатор владельца фотографии.
    val userId: Int =0, //идентификатор пользователя, загрузившего фото (если фотография размещена в сообществе). Для фотографий, размещенных от имени сообщества, user_id = 100.
    val text: String=" ", //текст описания фотографии.
    val date: Int =0, //дата добавления в формате Unixtime.
    val sizes: Array<Pics>?, //	массив с копиями изображения в разных размерах.- см отдельный класс
    val width: Int=0,//	ширина оригинала фотографии в пикселах.
    val height: Int=0, //высота оригинала фотографии в пикселах.
    val postId: Int?=0//Для фотографий, которые были загружены не в запрашиваемую запись, дополнительно возвращается поле post_id, содержащее идентификатор записи, в которую была загружена фотография.
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Photo

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }

}

data class Pics (
    val type: String=" ", // тип копии. См. Формат описания размеров фотографии в документации вк https://vk.com/dev/photo_sizes
    val url: String =" ", //URL копии.
    val width: Int, //высота в px.
    val height: Int //ширина в px.
)