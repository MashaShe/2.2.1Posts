data class Place(
    val id: Int = 0, // идентификатор места.
    val title: String = " ", //	название места.
    val latitude: Int = 0, // географическая широта, заданная в градусах (от -90 до 90).
    val longitude: Int = 0, // географическая широта, заданная в градусах (от -90 до 90).
    val created: Int = 0, // дата создания места в Unixtime.
    val icon: String = " ", //иконка места, URL изображения.
    val checkins: Int = 0, //число отметок в этом месте.
    val updated: Int = 0, // 	дата обновления места в Unixtime.
    val type: Int = 0, // тип места.
    val country: Int = 0, // идентификатор страны.
    val city: Int = 0, // идентификатор города.
    val address: String = " "// адрес места.
)